package leetcode.problems;

import java.util.Arrays;

/**
 * @author aiwujingxin@gmail.com
 * @date 2022/7/9 11:06
 */
public class LeetCode188_dfs {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/discuss/1007170/Java-Recursive-greater-Memoization-greater-3D-Bottom-Up-greater-2D-Bottom-Up

    public int maxProfit(int k, int[] prices) {
        int[][][] memo = new int[prices.length][2][k + 1];

        for (int[][] ints : memo) {
            for (int[] anInt : ints) {
                Arrays.fill(anInt, -1);
            }
        }

        return maxProfit(0, 0, k, prices, memo);
    }

    private int maxProfit(int i, int state, int k, int[] prices, int[][][] memo) {
        if (i >= prices.length || k == 0) {
            return 0;
        }
        if (memo[i][state][k] != -1) {
            return memo[i][state][k];
        }
        return memo[i][state][k] = (state == 0) ?
                Math.max(maxProfit(i + 1, 1, k, prices, memo) - prices[i], maxProfit(i + 1, state, k, prices, memo)) :
                Math.max(maxProfit(i + 1, 0, k - 1, prices, memo) + prices[i], maxProfit(i + 1, state, k, prices, memo));
    }

    public int maxProfit_dp(int k, int[] prices) {
        int[][][] profit = new int[prices.length + 1][2][k + 1];

        for (int i = prices.length - 1; i >= 0; i--) {
            for (int state = 1; state >= 0; state--) {
                for (int j = 1; j <= k; j++) {
                    profit[i][state][j] = (state == 0) ?
                            Math.max(profit[i + 1][1][j] - prices[i], profit[i + 1][state][j]) :
                            Math.max(profit[i + 1][0][j - 1] + prices[i], profit[i + 1][state][j]);
                }
            }
        }

        return profit[0][0][k];
    }

}
