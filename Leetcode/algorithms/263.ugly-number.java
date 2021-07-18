package Leetcode.algorithms;
/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {
        if( n < 1) return false;
        while( n != 1) {
            if(n % 5 == 0) {
                n /= 5;
            }
            else if(n % 3 == 0) {
                n /= 3;
            }
            else if(n % 2 == 0) {
                n /= 2;
            }
            else return false;
        }
        return true;
    }
}
// @lc code=end
/*
 * 1013/1013 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 42.09 % of java submissions (36.2 MB)
 */
