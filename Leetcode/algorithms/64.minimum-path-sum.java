/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 */

// @lc code=start
class Solution {
    public int minPathSum(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for ( int j = 0; j < grid[i].length; j++) {
                int minToCell = Integer.MAX_VALUE;
                if (i > 0) minToCell = Math.min(minToCell, grid[i - 1][j]);
                if (j > 0) minToCell = Math.min(minToCell, grid[i][j - 1]);
                if(minToCell != Integer.MAX_VALUE)
                    grid[i][j] += minToCell;
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
// @lc code=end
/*
 * 61/61 cases passed (2 ms)
 * Your runtime beats 81.05 % of java submissions
 * Your memory usage beats 97.61 % of java submissions (41.3 MB)
 */
