package basic.template.Acwing;

import java.util.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/5/1 12:58
 * <a href="https://labuladong.github.io/algo/di-yi-zhan-da78c/shou-ba-sh-48c1d/xiao-er-me-c304e/">...</a>
 * <a href="https://leetcode.cn/problems/range-addition/submissions/">example</a>
 */
public class PreDiff {

    public static void main(String[] args) {
        PreDiff p = new PreDiff(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        p.increment(2, 6, 9);
        System.out.println(Arrays.toString(p.result()));
    }

    private final int[] diff;

    public PreDiff(int[] nums) {
        assert nums.length > 0;
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    public void increment(int i, int j, int val) {
        diff[i] += val;
        if (j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    public int[] result() {
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}
