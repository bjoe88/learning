/*
 * @lc app=leetcode id=96 lang=java
 *
 * [96] Unique Binary Search Trees
 */

// @lc code=start
class Solution {
    int[] answer;
    public int numTrees(int n) {
        this.answer = new int[n + 1];
        return callTreeNum(n);
    }
    private int callTreeNum(int n) {
        int count = 0;
        if (this.answer[n] != 0) {
            return this.answer[n];
        }

        for (int i = 1; i <= n; i++) {
            count += (callTreeNum( i - 1) * callTreeNum( n - i));
        }
        this.answer[n] = count == 0? 1 : count;
        return this.answer[n];
    }
}
// @lc code=end
/*
 * 19/19 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 48.78 % of java submissions (35.8 MB)
 */

