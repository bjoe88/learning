/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int numberOrRing = (matrix.length + 1) / 2; 
        for(int ring = 0; ring  < numberOrRing; ring++) { 
            int ringLength = matrix.length - 1 - (2 * ring); 
            int pointMin = ring; 
            int pointMax = matrix.length - pointMin - 1; 
            for( int cell = 0; cell < ringLength; cell++) { 
                int tmp = matrix[pointMin][pointMin + cell];
                matrix[pointMin][pointMin + cell] = matrix[pointMax - cell][pointMin];
                matrix[pointMax - cell][pointMin] = matrix[pointMax][pointMax - cell];
                matrix[pointMax][pointMax - cell] = matrix[pointMin + cell][pointMax];
                matrix[pointMin + cell][pointMax] = tmp;
            }
        }
    }
}
// @lc code=end
/*
 * 21/21 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.38 % of java submissions (39.3 MB)
 */
