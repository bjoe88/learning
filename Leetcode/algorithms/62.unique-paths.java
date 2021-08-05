/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution {
    public int uniquePaths(int m, int n) {
        if( m == 1 || n == 1) return 1;
        int[] row1 = new int[n];
        Arrays.fill(row1, 1);
        for( int i = 1 ; i < m; i++) {
            for (int j = 1 ; j < n; j++) {
                row1[j] = row1[j] + row1[j - 1];
            }
        }
        return row1[n - 1];
    }
}
// @lc code=end
/*
 * 62/62 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 95.38 % of java submissions (35.5 MB)
 */


