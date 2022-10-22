package leetplan.datastructure;

import common.TreeNode;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/10/18 00:18
 */
public class LeetCode701_recursion {


    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
}
