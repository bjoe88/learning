/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution {
    public void moveZeroes(int[] nums) {
        int ptr1 = 0;
        for( int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) continue;
            if(i != ptr1) {
                nums[ptr1] = nums[i];
            }
            ptr1++;
        }
        for(;ptr1< nums.length; ptr1++) nums[ptr1] = 0;
    }
}
// @lc code=end
/*
 * 21/21 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 33.24 % of java submissions (39.4 MB)
 */
