import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=350 lang=java
 *
 * [350] Intersection of Two Arrays II
 */

// @lc code=start
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int ptr1 = 0, ptr2 = 0, k = 0;
        while (ptr1 < nums1.length && ptr2 < nums2.length) {
            if (nums1[ptr1] == nums2[ptr2]) {
                nums1[k++] = nums2[ptr2];
                ptr1++;
                ptr2++;
            } else if (nums1[ptr1] > nums2[ptr2]) {
                ptr2++;
            } else {
                ptr1++;
            }
        }
        return Arrays.copyOfRange(nums1, 0, k);
    }
}
// @lc code=end
/*
 * 55/55 cases passed (2 ms)
 * Your runtime beats 93.8 % of java submissions
 * Your memory usage beats 96.99 % of java submissions (38.8 MB)
 */