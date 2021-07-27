/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                if (nums[nums[i] - 1] > 0)
                    nums[nums[i] - 1] = -nums[nums[i] - 1];
            } else {
                if (nums[(-nums[i]) - 1] > 0)
                    nums[(-nums[i]) - 1] = -nums[(-nums[i]) - 1];
            }
        }

        List<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                ans.add(i + 1);
            }
            ;
        }
        return ans;
    }
}
// @lc code=end
/*
 * 33/33 cases passed (5 ms)
 * Your runtime beats 80.44 % of java submissions
 * Your memory usage beats 63.18 % of java submissions (48.1 MB)
 */
