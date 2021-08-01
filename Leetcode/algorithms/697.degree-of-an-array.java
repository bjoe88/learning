/*
 * @lc app=leetcode id=697 lang=java
 *
 * [697] Degree of an Array
 */

// @lc code=start
class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] countNumElement = new int[50000];
        HashMap<Integer, Integer> firstIndexForElement = new HashMap<>();
        int maxDegree = -1;
        int minLength = 1;
        for (int i = 0; i < nums.length; i++) {
            countNumElement[nums[i]]++;
            if (!firstIndexForElement.containsKey(nums[i])) {
                firstIndexForElement.put(nums[i], i);
            }
            else if(countNumElement[nums[i]] > maxDegree) {
                maxDegree = countNumElement[nums[i]];
                minLength = i - firstIndexForElement.get(nums[i]) + 1;

            }
            else if(countNumElement[nums[i]] == maxDegree) {
                minLength = Math.min(minLength, i - firstIndexForElement.get(nums[i]) + 1 );
            }
        }
        return minLength;
    }
}
// @lc code=end
/*
 * 89/89 cases passed (7 ms)
 * Your runtime beats 96.46 % of java submissions
 * Your memory usage beats 91.4 % of java submissions (42.1 MB)
 */
