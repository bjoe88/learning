/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        int count = 0;
        Boolean found = false;
        Boolean notFirst = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                if (notFirst)
                    found = true;
            } else {
                notFirst = true;
                if (found) {
                    count++;
                    found = false;
                }
            }
        }
        if(notFirst) count++;
        return count;
    }
}
// @lc code=end
/*
 * 27/27 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 22.93 % of java submissions (37.3 MB)
 */
