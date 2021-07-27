/*
 * @lc app=leetcode id=441 lang=java
 *
 * [441] Arranging Coins
 */

// @lc code=start
class Solution {
    public int arrangeCoins(int n) {
        long count = 1;
        int level = 1;
        while( count < n) {
            level++;
            count += level;
        }
        return count == n ? level : level - 1;
    }
}
// @lc code=end
/*
 * 1335/1335 cases passed (14 ms)
 * Your runtime beats 9.36 % of java submissions
 * Your memory usage beats 87.17 % of java submissions (36 MB)
 */
