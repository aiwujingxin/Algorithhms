package LeetCode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jingxinwu
 * @date 2021-07-06 12:38 上午
 */
public class LeetCode106 {


    public TreeNode buildTree(int[] inorder, int[] postorder) {

        return buildTreeHelper(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1);

    }

    private TreeNode buildTreeHelper(int[] postorder, int p_start, int p_end, int[] inorder, int i_start, int i_end) {
        // preorder 为空，直接返回 null
        if (p_end < p_start || i_end < i_start) {
            return null;
        }
        System.out.println(i_end);

        //根据后序遍历找到根节点
        int root_val = postorder[p_end];
        TreeNode root = new TreeNode(root_val);
        //在中序遍历中找到根节点的位置
        int i_root_index = 0;
        for (int i = i_start; i <= i_end; i++) {
            if (inorder[i] == root_val) {
                i_root_index = i;
                break;
            }
        }
        int leftNum = i_root_index - i_start;
        //递归的构造左子树
        root.left = buildTreeHelper(postorder, p_start, p_start + leftNum - 1, inorder, i_start, i_root_index - 1);
        //递归的构造右子树
        root.right = buildTreeHelper(postorder, p_start + leftNum, p_end - 1, inorder, i_root_index + 1, i_end);
        return root;
    }



    Map<Integer, Integer> map;
    public TreeNode buildTreev2(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        int[] postIndex = new int[]{postorder.length - 1};
        for (int i = 0; i < inorder.length; ++i) {
            map.put(inorder[i], i);
        }
        return arrayToTree(postorder, 0, postorder.length - 1, postIndex);
    }

    private TreeNode arrayToTree(int[] postorder, int left, int right, int[] postIndex) {
        if (left > right) {
            return null;
        }
        int value = postorder[postIndex[0]];
        postIndex[0] = postIndex[0] - 1;
        TreeNode root = new TreeNode(value);
        int index = map.get(value);
        root.right = arrayToTree(postorder, index + 1, right, postIndex);
        root.left = arrayToTree(postorder, left, index - 1, postIndex);
        return root;
    }
}
