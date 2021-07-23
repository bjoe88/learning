/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 2)
            return true;
        long upper = num / 2;
        long lower = 2;
        long mid = lower + (upper - lower) / 2, guessNumber = 1;
        while (upper >= lower) {
            mid = lower + (upper - lower) / 2;
            guessNumber = mid * mid;
            if (guessNumber == num) {
                return true;
            }
            if (guessNumber > num) {
                upper = mid - 1;
            } else {
                lower = mid + 1;
            }
        }
        return false;
    }
}
// @lc code=end
/*
 * 70/70 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 84.8 % of java submissions (35.6 MB)
 */
