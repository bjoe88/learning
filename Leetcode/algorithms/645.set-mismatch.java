/*
 * @lc app=leetcode id=645 lang=java
 *
 * [645] Set Mismatch
 */

// @lc code=start
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int tmp = Math.abs(nums[i]);
            if (nums[tmp - 1] > 0)
                nums[tmp - 1] *= -1; 
            else
                ans[0] = tmp;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans[1] = i + 1;
            }
        }
        return ans;
    }
}
// @lc code=end
/*
 * 49/49 cases passed (2 ms)
 * Your runtime beats 82.76 % of java submissions
 * Your memory usage beats 56.21 % of java submissions (40.7 MB)
 */

