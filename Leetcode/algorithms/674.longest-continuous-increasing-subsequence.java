/*
 * @lc app=leetcode id=674 lang=java
 *
 * [674] Longest Continuous Increasing Subsequence
 */

// @lc code=start
class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int maxLen = 0;
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            for (; j < nums.length && nums[j] > nums[j - 1]; j++) {
            }
            maxLen = Math.max(maxLen, j - i);
            i = j - 1;
        }
        return maxLen;
    }
}
// @lc code=end
/*
 * 35/35 cases passed (1 ms)
 * Your runtime beats 98.56 % of java submissions
 * Your memory usage beats 54.7 % of java submissions (39.8 MB)
 */

