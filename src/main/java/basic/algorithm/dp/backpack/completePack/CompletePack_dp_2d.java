package basic.algorithm.dp.backpack.completePack;

import basic.problems.dp.*;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/7/18 12:33
 */
public class CompletePack_dp_2d implements BackPack {

    @Override
    public int backPack(int capacity, int[] weights, int[] values) {
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];
        // 初始化边界条件
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        // 计算每个容量下的最大价值
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= capacity; j++) {
                if (weights[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - weights[i - 1]] + values[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[n][capacity];
    }
}