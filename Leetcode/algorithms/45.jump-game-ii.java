/*
 * @lc app=leetcode id=45 lang=java
 *
 * [45] Jump Game II
 */

// @lc code=start
class Solution {
    public int jump(int[] nums) {
        if (nums.length == 0) return 0;
        int farthest = 0;
        int jump = 0;
        int currentIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            farthest =  Math.max(farthest, i + nums[i]);
            if (i == currentIndex) {
                jump++;
                currentIndex = farthest;
            }
        }
        return jump;
    }
}
// @lc code=end
/*
 * 106/106 cases passed (1 ms)
 * Your runtime beats 99.35 % of java submissions
 * Your memory usage beats 62.67 % of java submissions (39.7 MB)
 */

