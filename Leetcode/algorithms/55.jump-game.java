/*
 * @lc app=leetcode id=55 lang=java
 *
 * [55] Jump Game
 */

// @lc code=start
class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1) return true;
        int maxJump = nums[0]; // 3
        for (int i = 1; i <= maxJump; i++) {
            if(maxJump >= nums.length - 1) return true;
            maxJump = Math.max(maxJump, nums[i] + i);
        }
        return false;
    }
}
// @lc code=end
/*
 * 166/166 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 78.02 % of java submissions (39.6 MB)
 */

