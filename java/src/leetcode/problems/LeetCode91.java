package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2024/4/12 13:24
 */
public class LeetCode91 {

    public int numDecodings(String s) {
        if (s == null || s.isEmpty() || s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) != '0') {
                dp[i + 1] = dp[i];
            }
            String ss = s.substring(i - 1, i + 1);
            int num = Integer.parseInt(ss);
            dp[i + 1] = dp[i];
            if (num >= 10 && num <= 26 && s.charAt(i) != '0') {
                dp[i + 1] += dp[i - 1];
            }
        }
        return dp[n];
    }
}
