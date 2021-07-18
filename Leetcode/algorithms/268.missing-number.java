/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int maxVal = -1;
        boolean foundZero = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                foundZero = true;
            maxVal = Math.max(maxVal, nums[i]);
            sum += nums[i];
        }
        if (!foundZero)
            return 0;
        int rightTotal = maxVal * (maxVal + 1) / 2;
        return rightTotal - sum == 0 ? maxVal + 1 : rightTotal - sum;
    }
}
// @lc code=end

/*
 * 122/122 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.64 % of java submissions (39.5 MB)
 */
