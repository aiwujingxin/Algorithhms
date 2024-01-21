package leetcode.problems;

import knowledge.advstructure.BinaryIndexedTree;

/**
 * @author jingxinwu
 * @date 2024-01-18 22:16:10
 */
public class LeetCode1375 {

    public int numTimesAllBlue(int[] flips) {
        int n = 0;
        for (int flip : flips) {
            n = Math.max(n, flip);
        }
        n = n + 1;
        int[] nums = new int[n];
        BinaryIndexedTree bitTree = new BinaryIndexedTree(n + 1);
        for (int i = 0; i < n; i++) {
            bitTree.update(i + 1, 0);
        }
        int cnt = 0;
        for (int i = 0; i < flips.length; i++) {
            int index = flips[i];
            int diff = (nums[index] == 0 ? 1 : -1);
            nums[index] = (nums[index] == 0 ? 1 : 0);
            bitTree.update(index + 1, diff);
            if (bitTree.query(i + 2) - bitTree.query(0) == i + 1) {
                cnt++;
            }
        }
        return cnt;
    }
}
