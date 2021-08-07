/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int lastIndexRed = 0;
        int lastIndexBlue = nums.length -1;
        for (int i = 0; i< nums.length; i++) {
            if( nums[i] == 0) {
                lastIndexRed = getNextRedPlace(nums,lastIndexRed);
                if(i <= lastIndexRed) {
                    continue;
                }
                swap(nums, lastIndexRed, i);
                i--;
            }
            else if( nums[i] == 2) {
                lastIndexBlue = getNextBluePlace(nums,lastIndexBlue);
                if(i >= lastIndexBlue) continue;
                swap(nums, lastIndexBlue, i);
                i--;
            }
        }
    }

    public int getNextRedPlace(int[] nums, int lastIndex) {
        while(nums[lastIndex] == 0 && lastIndex < nums.length - 1) lastIndex++;
        return lastIndex;
    }

    public int getNextBluePlace(int[] nums, int lastIndex) {
        while(nums[lastIndex] == 2 && lastIndex > 0) lastIndex--;
        return lastIndex;
    }

    public void swap(int[] nums, int i1, int i2) {
        int tmp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = tmp;
    }
}
// @lc code=end
/*
 * 87/87 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 84.15 % of java submissions (37.4 MB)
 */
