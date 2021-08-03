/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[]> answer = new LinkedList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for (int i = 0; i < intervals.length; i++) {
            if (answer.isEmpty() || answer.getLast()[1] < intervals[i][0]) {
                answer.add(intervals[i]);
            }
            else {
                answer.getLast()[1] = Math.max(answer.getLast()[1], intervals[i][1]);
            }
        }

        return answer.toArray(new int[answer.size()][]);
    }
}
// @lc code=end
/*
 * 168/168 cases passed (7 ms)
 * Your runtime beats 33.11 % of java submissions
 * Your memory usage beats 84.44 % of java submissions (41.4 MB)
 */