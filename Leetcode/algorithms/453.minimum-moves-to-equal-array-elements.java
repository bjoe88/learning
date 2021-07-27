/*
 * @lc app=leetcode id=453 lang=java
 *
 * [453] Minimum Moves to Equal Array Elements
 */

// @lc code=start
public class Solution {
    public int minMoves(int[] nums) {
        int moves = 0, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            moves += nums[i] - min;
        }
        return moves;
    }
}
// @lc code=end
/*
 * 84/84 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 87.11 % of java submissions (39.1 MB)
 */