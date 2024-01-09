package leetcode.problems;

import common.TreeNode;
import knowledge.datastructure.tree.Serialize;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/9/7 23:40
 * @see Serialize
 */
public class LeetCode297 {
    public class Codec {

        StringBuilder sb = new StringBuilder();

        public String serialize(TreeNode root) {
            if (root == null) {
                return sb.toString();
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (node != null) {
                    sb.append(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                } else {
                    sb.append("null");
                }
                if (!queue.isEmpty()) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        public TreeNode deserialize(String data) {
            if (data.isEmpty()) {
                return null;
            }
            String[] strs = data.split(",");
            TreeNode root = new TreeNode(Integer.parseInt(strs[0]));
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            int index = 1;
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                if (!"null".equals(strs[index])) {
                    node.left = new TreeNode(Integer.parseInt(strs[index]));
                    queue.add(node.left);
                }
                index++;
                if (!"null".equals(strs[index])) {
                    node.right = new TreeNode(Integer.parseInt(strs[index]));
                    queue.add(node.right);
                }
                index++;
            }
            return root;
        }
    }
}
