package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/10/24 11:46
 * @link <a href="https://www.youtube.com/watch?v=qWxLyexGW1k"></a>
 * @description 想办法像已知的状态上靠
 */
public class LeetCode10 {

    public boolean isMatch(String s, String p) {
        if (p == null || p.isEmpty() || s == null || s.isEmpty()) {
            return true;
        }
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;
        // init s 空串的情况
        for (int j = 2; j <= p.length(); j += 2) {
            dp[0][j] = dp[0][j - 2] && p.charAt(j - 1) == '*';
        }
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*')
                    // 0个 || 多个
                    dp[i][j] = dp[i][j - 2] || ((s.charAt(i - 1) == p.charAt(j - 2) || p.charAt(j - 2) == '.') && dp[i - 1][j]);
            }
        }
        return dp[s.length()][p.length()];
    }
}
