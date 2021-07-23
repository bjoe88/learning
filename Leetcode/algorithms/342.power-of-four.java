/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        return  n > 0 && (n & (n - 1)) == 0 && ((n & 715827882) == 0);
    }
}
// @lc code=end
/*
 * 1061/1061 cases passed (1 ms)
 * Your runtime beats 99.46 % of java submissions
 * Your memory usage beats 92.65 % of java submissions (35.7 MB)
 */