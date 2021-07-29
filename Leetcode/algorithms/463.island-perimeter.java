/*
 * @lc app=leetcode id=463 lang=java
 *
 * [463] Island Perimeter
 */

// @lc code=start
class Solution {
    public int islandPerimeter(int[][] grid) {
        int gridWidth = grid.length;
        int gridHeight = grid[0].length;
        int count = 0;
        for (int i = 0; i < gridWidth; i++) {
            for (int j = 0; j < gridHeight; j++) {
                if (grid[i][j] == 1) {
                    count += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        count--;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        count--;
                    }
                    if (i < gridWidth - 1 && grid[i + 1][j] == 1) {
                        count--;
                    }
                    if (j < gridHeight - 1 && grid[i][j + 1] == 1) {
                        count--;
                    }
                }
            }
        }
        return count;
    }
}
// @lc code=end
/*
 * 5833/5833 cases passed (5 ms)
 * Your runtime beats 99.72 % of java submissions
 * Your memory usage beats 64.13 % of java submissions (40.4 MB)
 */
