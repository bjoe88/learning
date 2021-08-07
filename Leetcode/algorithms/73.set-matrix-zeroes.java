/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean isRowZero = false;
        boolean isColZero = false;
        for (int i = 0; i < matrix.length && !isColZero; i++) {
            if(matrix[i][0] == 0) isColZero = true;
        }

        for (int i = 0; i < matrix[0].length && !isRowZero; i++) {
            if(matrix[0][i] == 0) isRowZero = true;
        }

        for (int i = 1; i < matrix.length;i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < matrix.length;i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][0] == 0 ||
                    matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                }
            }
        }
        if (isColZero) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }

        if(isRowZero) {
            for (int i = 0; i < matrix[0].length; i++) {
                matrix[0][i] = 0;
            }
        }

        return;
    }
}
// @lc code=end
/*
 * 164/164 cases passed (1 ms)
 * Your runtime beats 93.18 % of java submissions
 * Your memory usage beats 93.09 % of java submissions (40.3 MB)
 */