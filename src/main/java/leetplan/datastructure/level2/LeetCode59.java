package leetplan.datastructure.level2;

/**
 * @author wujingxinit@outlook.com
 * @date 2022/10/25 22:06
 */
public class LeetCode59 {

    public int[][] generateMatrix(int n) {
        if (n == 0) {
            return new int[0][0];
        }
        int[][] matrix = new int[n][n];

        int rowStart = 0;
        int rowEnd = matrix.length - 1;//行
        int colStart = 0;
        int colEnd = matrix[0].length - 1;//列

        int count = 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {

            for (int j = colStart; j <= colEnd; j++) {
                matrix[rowStart][j] = count;
                count++;
            }
            rowStart++;

            for (int j = rowStart; j <= rowEnd; j++) {
                matrix[j][colEnd] = count;
                count++;
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                for (int j = colEnd; j >= colStart; j--) {
                    matrix[rowEnd][j] = count;
                    count++;
                }
            }
            rowEnd--;

            if (colStart <= colEnd) {
                for (int j = rowEnd; j >= rowStart; j--) {
                    matrix[j][colStart] = count;
                    count++;
                }
            }
            colStart++;
        }
        return matrix;
    }
}
