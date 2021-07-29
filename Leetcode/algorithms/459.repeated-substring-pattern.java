/*
 * @lc app=leetcode id=459 lang=java
 *
 * [459] Repeated Substring Pattern
 */

// @lc code=start
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() == 1)
            return false;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.length() % (i + 1) == 0 && s.charAt(i) == s.charAt(s.length() - 1)
                    && s.charAt(i + 1) == s.charAt(0)) {
                if (isRepeatedSubstring(s, i + 1))
                    return true;
            }
        }
        return false;
    }

    public boolean isRepeatedSubstring(String s, int substringLength) {
        for (int i = substringLength; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - substringLength))
                return false;
        }
        return true;
    }
}
// @lc code=end
/*
 *128/128 cases passed (6 ms)
 *Your runtime beats 91.49 % of java submissions
 *Your memory usage beats 54.53 % of java submissions (39.5 MB)
 */