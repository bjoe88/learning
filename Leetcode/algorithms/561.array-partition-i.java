import java.util.Arrays;

/*
 * @lc app=leetcode id=561 lang=java
 *
 * [561] Array Partition I
 */

// @lc code=start
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int total = 0;
        for (int i = 0; i < nums.length; i += 2) {
            total += nums[i];
        }
        return total;
    }
}
// @lc code=end
/*
 * 83/83 cases passed (10 ms)
 * Your runtime beats 96.33 % of java submissions
 * Your memory usage beats 51.78 % of java submissions (41.2 MB)
 */