/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sumExclude = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            sumExclude = sumExclude ^ i ^ nums[i];
        }
    
        return sumExclude ^ i;
    }
}
// @lc code=end

/*
 * 122/122 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 47.14 % of java submissions (39.5 MB)
 */
