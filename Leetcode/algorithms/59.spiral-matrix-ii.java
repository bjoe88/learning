/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 */

// @lc code=start
class Solution {
    public int[][] generateMatrix(int n) {
        int[][] answer = new int[n][n];
        int numberOfRing = (n + 1) / 2; 
        int maxCell = n * n; 
        int cellCount = 1;
        for (int ring = 0; ring  < numberOfRing; ring++) { 
            int repeat = n  - 1 - (2 * ring); 
            int maxPoint = n - 1 - ring;
            for (int i = 0; i < repeat && cellCount <= maxCell; i++, cellCount++) { 
                answer[ring][ring + i] = cellCount;
            }
            for (int i = 0; i < repeat && cellCount <= maxCell; i++, cellCount++) {
                answer[ring + i][maxPoint] = cellCount;
            }
            for (int i = 0; i < repeat && cellCount <= maxCell; i++, cellCount++) {
                answer[maxPoint][maxPoint - i] = cellCount;
            }
            for (int i = 0; i < repeat && cellCount <= maxCell; i++, cellCount++) {
                answer[maxPoint - i][ring] = cellCount;
            }
            if( repeat == 0 && cellCount <= maxCell) {
                answer[ring][ring] = cellCount++;
            }
        }
        return answer;
    }
}
// @lc code=end
/*
 * 20/20 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 53.54 % of java submissions (37.2 MB)
 */