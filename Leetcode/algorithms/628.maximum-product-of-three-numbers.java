/*
 * @lc app=leetcode id=628 lang=java
 *
 * [628] Maximum Product of Three Numbers
 */

// @lc code=start
class Solution {
    public int maximumProduct(int[] nums) {
        int biggest1 = Integer.MIN_VALUE, biggest2 = Integer.MIN_VALUE, biggest3 = Integer.MIN_VALUE;
        int smaller1 = Integer.MAX_VALUE, smaller2 = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < smaller1) {
                smaller2 = smaller1;
                smaller1 = nums[i];
            }
            else if (nums[i] < smaller2) {
                smaller2 = nums[i];
            }
            if (nums[i] > biggest1) {
                biggest3 = biggest2;
                biggest2 = biggest1;
                biggest1 = nums[i];
                continue;
            }
            if (nums[i] > biggest2) {
                biggest3 = biggest2;
                biggest2 = nums[i];
                continue;
            }
            if (nums[i] > biggest3) {
                biggest3 = nums[i];
            }
        }
        return Math.max(biggest1 * biggest2 *  biggest3, biggest1 * smaller1 * smaller2);
    }
}
// @lc code=end
/*
 * 92/92 cases passed (2 ms)
 * Your runtime beats 99.24 % of java submissions
 * Your memory usage beats 32.61 % of java submissions (40.6 MB)
 */

