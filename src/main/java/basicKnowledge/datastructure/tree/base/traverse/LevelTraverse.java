package basicKnowledge.datastructure.tree.base.traverse;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/9/7 12:01
 */
public class LevelTraverse implements Traverse {

    @Override
    public List<Integer> traverseByDFS(TreeNode root) {
        return new ArrayList<>();
    }

    @Override
    public List<Integer> traverseByIteration(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode node = q.poll();
            if (node.left != null) {
                q.add(node.left);
            }
            if (node.right != null) {
                q.add(node.right);
            }
        }
        return list;
    }
}
