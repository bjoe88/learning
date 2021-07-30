/*
 * @lc app=leetcode id=598 lang=java
 *
 * [598] Range Addition II
 */

// @lc code=start
class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        for (int i = 0; i < ops.length; i++) {
            m = Math.min(m, ops[i][0]);
            n = Math.min(n, ops[i][1]);
        }
        return m * n;
    }
}
// @lc code=end
/*
 * 69/69 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 99.76 % of java submissions (38.4 MB)
 */

