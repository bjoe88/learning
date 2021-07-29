/*
 * @lc app=leetcode id=557 lang=java
 *
 * [557] Reverse Words in a String III
 */

// @lc code=start
class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int wordStart = 0;
        for (int i = 0; i <= chars.length; i++) {
            if(i == chars.length || chars[i] == ' ') {
                int wordEnd = i - 1;
                while( wordStart < wordEnd) {
                    char tmp = chars[wordEnd];
                    chars[wordEnd] = chars[wordStart];
                    chars[wordStart] = tmp;
                    wordEnd--;
                    wordStart++;
                }
                wordStart = i + 1;
            }
        }

        return String.valueOf(chars);
    }
}
// @lc code=end
/*
 * 29/29 cases passed (2 ms)
 * Your runtime beats 99.94 % of java submissions
 * Your memory usage beats 77.13 % of java submissions (39.5 MB)
 */