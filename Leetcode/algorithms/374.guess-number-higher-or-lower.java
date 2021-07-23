/*
 * @lc app=leetcode id=374 lang=java
 *
 * [374] Guess Number Higher or Lower
 */

// @lc code=start
/**
 * Forward declaration of guess API.
 * 
 * @param num your guess
 * @return -1 if num is lower than the guess number 1 if num is higher than the
 *         guess number otherwise return 0 int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int upper = n, lower = 1, mid = 0;
        while (lower <= upper) {
            mid = lower + (upper - lower) / 2;
            int guessAnswer = guess(mid);
            if (guessAnswer == 0)
                return mid;
            if (guessAnswer == 1)
                lower = mid + 1;
            else
                upper = mid - 1;
        }
        return mid;
    }
}
// @lc code=end
/*
 * 25/25 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 91.13 % of java submissions (35.5 MB)
 */