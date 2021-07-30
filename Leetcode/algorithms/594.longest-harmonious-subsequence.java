/*
 * @lc app=leetcode id=594 lang=java
 *
 * [594] Longest Harmonious Subsequence
 */

// @lc code=start
class Solution {
    public int findLHS(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> ans = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            ans.put(nums[i], ans.getOrDefault(nums[i], 0) + 1);
        }
        for (int key: ans.keySet()) {
            if(ans.containsKey(key + 1)) {
                answer = Math.max(ans.get(key) + ans.get(key + 1), answer);
            }
        }
        return answer;
    }
}
// @lc code=end
/*
 * 206/206 cases passed (15 ms)
 * Your runtime beats 89.06 % of java submissions
 * Your memory usage beats 56.34 % of java submissions (40.1 MB)
 */
