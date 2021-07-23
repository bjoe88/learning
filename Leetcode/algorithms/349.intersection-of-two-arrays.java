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
      HashSet<Integer> set1 = new HashSet<Integer>();
      for (Integer n : nums1) set1.add(n);
      HashSet<Integer> set2 = new HashSet<Integer>();
      for (Integer n : nums2) set2.add(n);
  
      set1.retainAll(set2);
  
      int [] output = new int[set1.size()];
      int idx = 0;
      for (int s : set1) output[idx++] = s;
      return output;
    }
  }
// @lc code=end
/*
 * 55/55 cases passed (2 ms)
 * Your runtime beats 95.31 % of java submissions
 * Your memory usage beats 92.88 % of java submissions (38.9 MB)
 */