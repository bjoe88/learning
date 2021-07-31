/*
 * @lc app=leetcode id=657 lang=java
 *
 * [657] Robot Return to Origin
 */

// @lc code=start
class Solution {
    public boolean judgeCircle(String moves) {
        if (moves.length() % 2 != 0) return false;
        int x = 0, y = 0;
        char [] chars = moves.toCharArray();
        for ( int i = 0; i < chars.length; i++) {
            if (chars[i] == 'D') y--;
            else if (chars[i] == 'U') y++;
            else if (chars[i] == 'L') x--;
            else x++;
        }
        return x == 0 && y == 0;
    }
}
// @lc code=end
/*
 * 72/72 cases passed (4 ms)
 * Your runtime beats 81.23 % of java submissions
 * Your memory usage beats 67.24 % of java submissions (39 MB)
 */
