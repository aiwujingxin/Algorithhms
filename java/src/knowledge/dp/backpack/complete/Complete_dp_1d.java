package knowledge.dp.backpack.complete;


/**
 * @author wujingxinit@outlook.com
 * @date 2023/7/18 12:33
 */
public class Complete_dp_1d implements CompletePack {

    @Override
    public int backPack(int[] weights, int[] values, int capacity) {
        int n = weights.length;
        int[] dp = new int[capacity + 1];
        // 计算每个容量下的最大价值
        // 内外循环可以颠倒 可能会带来算法时间常数上的优化
        for (int i = 0; i <= capacity; i++) {
            for (int j = 0; j < n; j++) {
                if (weights[j] <= i) {
                    dp[i] = Math.max(dp[i], dp[i - weights[j]] + values[j]);
                }
            }
        }
        return dp[capacity];
    }
}