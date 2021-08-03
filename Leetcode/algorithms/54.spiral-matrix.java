/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>();
        int minWH = Math.min( matrix.length, matrix[0].length); 
        int numberOfRing = (minWH + 1) / 2; 
        int numberOfCell = matrix.length * matrix[0].length; 
        int maxW = -1;
        int maxH = -1;
        for (int ring = 0; ring < numberOfRing; ring++) { 
            maxW = matrix[0].length - 1 - ( 2  * ring); 
            maxH = matrix.length - 1 - ( 2 * ring); 
            for (int i = 0; i < maxW && numberOfCell > 0;i++, numberOfCell--) { 
                answer.add(matrix[ring][ ring + i]);
            }
            for (int i = 0; i < maxH && numberOfCell > 0;i++, numberOfCell--) {
                answer.add(matrix[ ring + i][ ring + maxW]);
            }
            for (int i = 0; i < maxW && numberOfCell > 0;i++, numberOfCell--) {
                answer.add(matrix[ring + maxH][ring + maxW - i]);
            }
            for (int i = 0; i < maxH && numberOfCell > 0;i++, numberOfCell--) {
                answer.add(matrix[ring + maxH - i][ring]);
            }
            if(maxH == 0 && maxH == 0 && numberOfCell > 0) answer.add(matrix[ring][ring]);
            
        }

        return answer;
    }
}
// @lc code=end
/*
23/23 cases passed (0 ms)
Your runtime beats 100 % of java submissions
Your memory usage beats 77.18 % of java submissions (37.1 MB)
*/