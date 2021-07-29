/*
 * @lc app=leetcode id=521 lang=java
 *
 * [521] Longest Uncommon Subsequence I
 */

// @lc code=start
class Solution {
    public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
// @lc code=end
/*
 * 40/40 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 47.41 % of java submissions (36.9 MB)
 */
