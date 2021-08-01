/*
 * @lc app=leetcode id=693 lang=java
 *
 * [693] Binary Number with Alternating Bits
 */

// @lc code=start
class Solution {
    public boolean hasAlternatingBits(int n) {
        Boolean preBitOne = (n & 1) == 1;
        n = n >> 1;
        while( n > 0) {
            if ((preBitOne && (n & 1) == 1) || 
              (!preBitOne && (n & 1) == 0))  {
                return false;
            }
            preBitOne = !preBitOne;
            n = n >> 1;
        }
        return true;
    }
}
// @lc code=end
/*
 * 204/204 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 35.56 % of java submissions (36 MB)
 */