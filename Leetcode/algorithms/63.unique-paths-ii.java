/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid[0].length;
        int[] row = new int[n];
        row[0] = 1;
        for( int[] rowOG : obstacleGrid) {
            for (int j = 0; j < n; j++) {
                if ( rowOG[j] == 1) row[j] = 0; 
                else if ( j > 0) row[j] += row[j - 1];
            }
        }
        return row[n - 1];
    }
}
// @lc code=end
/*
 * 41/41 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 98.56 % of java submissions (36.7 MB)
 */

