/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        int[] charCount = new int[26];
        for (int i = 0; i < s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
// @lc code=end
/*
 * 104/104 cases passed (7 ms)
 * Your runtime beats 89.11 % of java submissions
 * Your memory usage beats 85.97 % of java submissions (39.3 MB)
 */