package basic.algorithm.dp.knapsack;

import leetcode.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/9/13 13:33
 * @see LeetCode322_dp_1d 01背包
 * @see LeetCode518_dp_1d 完全背包 凑成总金额的硬币组合数
 */
public interface ChangeMoney {
    int change(int amount, int[] coins);
}
