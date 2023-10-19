package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/10/19 18:11
 */
public class LeetCode45_greedy {
    public static void main(String[] args) {
        System.out.println(new LeetCode45_greedy().jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(new LeetCode45_greedy().jump(new int[]{2, 3, 0, 1, 4}));
    }

    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int end = 0;
        int max = 0;
        int step = 0;
        // 不访问最后一个元素
        for (int i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, nums[i] + i);
            if (i == end) {
                end = max;
                step++;
            }
        }
        return step;
    }
}
