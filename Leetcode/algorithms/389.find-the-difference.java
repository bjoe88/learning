/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        char cc = 0;
        for (int i = 0; i < s.length(); i += 1) {
            cc ^= s.charAt(i);
        }
        for (int i = 0; i < t.length(); i += 1) {
            cc ^= t.charAt(i);
        }
        return cc;
    }
}
// @lc code=end
/*
 * 54/54 cases passed (1 ms)
 * Your runtime beats 98.67 % of java submissions
 * Your memory usage beats 93.07 % of java submissions (37.1 MB)
 */