/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
// @lc code=end
/*
 * 149/149 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 63.67 % of java submissions (35.8 MB)
 */
