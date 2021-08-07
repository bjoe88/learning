/*
 * @lc app=leetcode id=81 lang=java
 *
 * [81] Search in Rotated Sorted Array II
 */

// @lc code=start
class Solution {
    public boolean search(int[] nums, int target) {
        int ptr1 = 0;
        int ptr2 = nums.length - 1;
        while(ptr1 <= ptr2) {
            int ptrMid = ptr1 + (ptr2 - ptr1) / 2;
            if (nums[ptrMid] == target) return true;
            if (nums[ptr1] < nums[ptrMid]) {
                if(target < nums[ptr1] || target > nums[ptrMid]) {
                    ptr1 = ptrMid + 1;
                }
                else {
                    ptr2 = ptrMid - 1;
                }
            }
            else if (nums[ptrMid] < nums[ptr1]) {
                if (target < nums[ptrMid] || target > nums[ptr2]) {
                    ptr2 = ptrMid - 1;
                }
                else {
                    ptr1 =  ptrMid + 1;
                }
            }
            else {
                ptr1++;
            }
        }
        return false;
    }
}
// @lc code=end
/*
 * 279/279 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 40.27 % of java submissions (38.8 MB)
 */
