/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        int[] charCount = new int[52];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                charCount[c - 'a' + 26]++;
            else if (c >= 'A' && c <= 'Z')
                charCount[c - 'A']++;
        }
        int maxLen = 0;
        boolean hasSingleMid = false;
        for (int i = 0; i < 52; i++) {
            maxLen += charCount[i] / 2 * 2;
            if (!hasSingleMid && (charCount[i] & 1) != 0) {
                maxLen++;
                hasSingleMid = true;
            }
        }
        return maxLen;
    }
}
// @lc code=end
/*
 * 95/95 cases passed (2 ms)
 * Your runtime beats 73.31 % of java submissions
 * Your memory usage beats 94.9 % of java submissions (37.1 MB)
 */
