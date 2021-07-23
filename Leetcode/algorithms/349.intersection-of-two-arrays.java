import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length < nums2.length)
            return intersection(nums2, nums1);

        HashSet<Integer> nums2Int = new HashSet<Integer>();
        List<Integer> answer = new ArrayList<Integer>();
        for (int i = 0; i < nums2.length; i++) {
            nums2Int.add(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {
            if (nums2Int.contains(nums1[i])) {
                answer.add(nums1[i]);
                nums2Int.remove(nums1[i]);
            }
        }
        int[] ans = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            ans[i] = answer.get(i);
        }
        return ans;
    }
}
// @lc code=end
/*
 * 55/55 cases passed (2 ms)
 * Your runtime beats 95.31 % of java submissions
 * Your memory usage beats 92.88 % of java submissions (38.9 MB)
 */