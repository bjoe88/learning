/*
 * @lc app=leetcode id=495 lang=java
 *
 * [495] Teemo Attacking
 */

// @lc code=start
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int totalTime = duration;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            totalTime += Math.min((timeSeries[i + 1] - timeSeries[i]), duration);
        }
        return totalTime;

    }
}
// @lc code=end
/*
 * 38/38 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 29.32 % of java submissions (41.6 MB)
 */