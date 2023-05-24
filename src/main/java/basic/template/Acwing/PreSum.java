package basic.template.Acwing;

/**
 * @author wujingxinit@outlook.com
 * @date 2023/5/1 12:49
 */
public class PreSum {

    //1D: https://leetcode.cn/problems/range-sum-query-immutable/
    class NumArray {

        int[] sums;

        public NumArray(int[] nums) {
            int n = nums.length;
            sums = new int[n + 1];
            for (int i = 1; i < sums.length; i++) {
                sums[i] = sums[i - 1] + nums[i - 1];
            }
        }

        public int sumRange(int i, int j) {
            return sums[j + 1] - sums[i];
        }
    }

    //2D: https://leetcode.cn/problems/range-sum-query-2d-immutable/
    class NumMatrix {

        private final int[][] sums;

        public NumMatrix(int[][] matrix) {
            int n = matrix.length;
            int m = matrix[0].length;
            sums = new int[n + 1][m + 1];
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    sums[i][j] = sums[i][j - 1] + sums[i - 1][j] - sums[i - 1][j - 1] + matrix[i - 1][j - 1];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            return sums[row2 + 1][col2 + 1] - sums[row1][col2 + 1] - sums[row2 + 1][col1] + sums[row1][col1];
        }
    }
}