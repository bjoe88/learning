/*
 * @lc app=leetcode id=551 lang=java
 *
 * [551] Student Attendance Record I
 */

// @lc code=start
class Solution {
    public boolean checkRecord(String s) {
        int absCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                absCount++;
                if (absCount == 2)
                    return false;
            } else if (i > 1 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L') {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
/*
 * 113/113 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 95.3 % of java submissions (36.9 MB)
 */
