/*
 * @lc app=leetcode id=566 lang=java
 *
 * [566] Reshape the Matrix
 */

// @lc code=start
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c)
            return mat;
        int[][] ans = new int[r][c];
        short ni = 0;
        short nj = 0;
        for (int oi = 0; oi < mat.length; oi++) {
            for (int oj = 0; oj < mat[0].length; oj++) {
                ans[ni][nj] = mat[oi][oj];
                nj++;
                if(nj == c ) {
                    nj = 0;
                    ni++;
                }
            }
        }
        return ans;
    }
}
// @lc code=end
/*
 * 57/57 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 72.02 % of java submissions (39.8 MB)
 */
