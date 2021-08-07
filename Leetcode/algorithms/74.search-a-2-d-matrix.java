/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ptrMin = 0;
        int ptrMax = matrix.length - 1;
        while(ptrMin < ptrMax) {
            int ptrMid = ptrMin + (ptrMax - ptrMin) / 2;
            if(matrix[ptrMid][0] > target) ptrMax = ptrMid - 1;
            else if(matrix[ptrMid][0] <= target && matrix[ptrMid][matrix[0].length - 1] >= target) {
                ptrMax = ptrMid;
                ptrMin = ptrMid;
            }
            else ptrMin = ptrMid + 1;
            
        }
        int i = ptrMin;
        ptrMin = 0;
        ptrMax = matrix[0].length - 1;
        while(ptrMin < ptrMax) {
            int ptrMid = ptrMin + (ptrMax - ptrMin) / 2;
            if(matrix[i][ptrMid] > target) ptrMax = ptrMid - 1;
            else if(matrix[i][ptrMid] == target) {
                ptrMax = ptrMid; 
                ptrMin = ptrMid; 
            }
            else ptrMin = ptrMid + 1;
            //[[1],[3],[5]]\n3
        }
        return matrix[i][ptrMin] == target;
    }
}
// @lc code=end
/*
 * 133/133 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 41.96 % of java submissions (38.6 MB)
 */