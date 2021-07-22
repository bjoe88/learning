/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        return n  > 0 && Math.pow(3, 19) % n == 0;
    }
}
// @lc code=end
/*
 * 21038/21038 cases passed (11 ms)
 * Your runtime beats 67.23 % of java submissions
 * Your memory usage beats 24.69 % of java submissions (39.2 MB)
 */