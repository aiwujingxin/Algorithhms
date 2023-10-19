package leetcode.problems;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/10/19 14:45
 */
public class LeetCode50 {

    public double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        if (x == 1 || x == 0) {
            return x;
        }
        if (n < 0) {
            return 1 / dfs(x, -n);
        }
        return dfs(x, n);
    }

    private double dfs(double x, long n) {
        if (n == 0) {
            return 1.0;
        }
        if (n % 2 == 0) {
            return dfs(x * x, n / 2);
        }
        return x * dfs(x * x, n / 2);
    }
}
