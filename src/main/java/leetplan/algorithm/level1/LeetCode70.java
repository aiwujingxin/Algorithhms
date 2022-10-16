package leetplan.algorithm.level1;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/10/16 13:46
 */
public class LeetCode70 {

    public int climbStairs(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[dp.length - 1];
    }
}
