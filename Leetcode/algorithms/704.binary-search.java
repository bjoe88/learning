/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int ptr1 = 0;
        int ptr2 =  nums.length - 1;
        while(ptr1 <= ptr2) {
            int mid = ptr1 + (ptr2 - ptr1) / 2;
            if(nums[mid] == target) return mid;
            else if (nums[mid] > target) ptr2 = mid - 1;
            else ptr1 = mid + 1;

        }
        return -1;
    }
}
// @lc code=end
/*
 * 46/46 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 54.64 % of java submissions (40 MB)
 */