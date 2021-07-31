/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i]  - nums[i - k];
            max = Math.max(max, sum);
        }

        return max / k;
    }
}
// @lc code=end
/*
 * 127/127 cases passed (4 ms)
 * Your runtime beats 75.86 % of java submissions
 * Your memory usage beats 71.8 % of java submissions (53.2 MB)
 */