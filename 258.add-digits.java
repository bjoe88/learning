/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}
// @lc code=end
/*
 * 1101/1101 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 52.36 % of java submissions (36.2 MB)
 */