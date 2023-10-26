package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/10/23 16:38
 */
public class LeetCode44 {

    //https://leetcode.com/problems/wildcard-matching/discuss/1662953/DFS-without-memo
    Boolean[][] memo;

    public boolean isMatch(String s, String p) {
        memo = new Boolean[s.length() + 1][p.length() + 1];
        return dfs(s, p, 0, 0);
    }

    boolean dfs(String s, String p, int si, int pi) {
        if (memo[si][pi] != null) {
            return memo[si][pi];
        }
        if (si == s.length() && pi == p.length()) {
            memo[si][pi] = true;
            return true;
        }
        //当p走到最后，说明匹配失败
        if (pi == p.length()) {
            memo[si][pi] = false;
            return false;
        }
        //当s走到最后，判断p剩下的是否都是*
        if (si == s.length()) {
            int i = 0;
            while (pi + i < p.length()) {
                if (p.charAt(pi + i++) != '*') {
                    memo[si][pi] = false;
                    return false;
                }
            }
            memo[si][pi] = true;
            return true;
        }

        if ((p.charAt(pi) == '?' || s.charAt(si) == p.charAt(pi))) {
            return dfs(s, p, si + 1, pi + 1);
        }
        if (p.charAt(pi) == '*') {
            //case * 的话， 可以向后匹配很多的字符
            for (int i = 0; i + si <= s.length(); i++) {
                boolean ans = dfs(s, p, si + i, pi + 1);
                if (ans) {
                    memo[si][pi] = true;
                    return true;
                }
            }
        }
        memo[si][pi] = false;
        return false;
    }

    //https://www.youtube.com/watch?v=7M-dShnqqEI
    public boolean isMatch_dp(String s, String p) {
        int m = s.length();
        int n = p.length();
        boolean[][] dp = new boolean[m + 1][n + 1];
        dp[0][0] = true;
        for (int i = 1; i <= n; ++i) {
            if (p.charAt(i - 1) == '*') {
                dp[0][i] = true;
            } else {
                break;
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (p.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] || dp[i - 1][j];
                } else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }
        return dp[m][n];
    }
}
