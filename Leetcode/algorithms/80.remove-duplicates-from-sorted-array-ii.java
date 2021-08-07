/*
 * @lc app=leetcode id=80 lang=java
 *
 * [80] Remove Duplicates from Sorted Array II
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr1 = 1;
        int countRepeat = 1;
        for (int i = 1; i < nums.length; i++) {
            if ( nums[i] == nums[i - 1]) {
                countRepeat++;
            }
            else {
                countRepeat = 1;
            }
            if(countRepeat <= 2) {
                nums[ptr1++] = nums[i];
            }
        }

        return ptr1;
    }
}
// @lc code=end
/*
164/164 cases passed (1 ms)
Your runtime beats 28.58 % of java submissions
Your memory usage beats 5.86 % of java submissions (41.7 MB)
*/

