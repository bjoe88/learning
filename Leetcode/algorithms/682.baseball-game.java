/*
 * @lc app=leetcode id=682 lang=java
 *
 * [682] Baseball Game
 */

// @lc code=start
class Solution {
    public int calPoints(String[] ops) {
        Deque<Integer> score = new ArrayDeque<>();
        score.push(Integer.parseInt(ops[0]));
        for( int i = 1; i < ops.length; i++) {
            if( ops[i].charAt(0) == 'D') {
                score.push(score.peek() * 2);
            }
            else if( ops[i].charAt(0) == 'C') {
                score.pop();
            }
            else if( ops[i].charAt(0) == '+') {
                int latest1 = score.pop();
                int latest2 = score.peek();
                score.push(latest1);
                score.push(latest1 + latest2);
            }
            else {
                score.push(Integer.parseInt(ops[i]));
            }
        }
        int sum = 0;
        while (!score.isEmpty()) {
            sum += score.pop();
        }
        return sum;
    }
}
// @lc code=end
/*
 * 39/39 cases passed (2 ms)
 * Your runtime beats 90.69 % of java submissions
 * Your memory usage beats 36.46 % of java submissions (38.6 MB)
 */