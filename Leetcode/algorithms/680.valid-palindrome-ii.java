/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution {
    public boolean validPalindrome(String s) {
        int ptr1 = 0;
        int ptr2 = s.length() - 1;
        while (ptr1 < ptr2) {
            if( s.charAt(ptr1) != s.charAt(ptr2)) {
                return isPalindromeSkip(s, ptr1 + 1, ptr2) || isPalindromeSkip(s, ptr1, ptr2 - 1);
            }
            ptr1++;
            ptr2--;
        }
        return true;
    }

    public boolean isPalindromeSkip(String s, int ptr1, int ptr2) {
        while (ptr1 < ptr2) {
            if( s.charAt(ptr1) != s.charAt(ptr2)) {
                return false;
            }
            ptr1++;
            ptr2--;
        }
        return true;
    }
}
// @lc code=end
/*
 * 467/467 cases passed (6 ms)
 * Your runtime beats 75.34 % of java submissions
 * Your memory usage beats 72.8 % of java submissions (39.5 MB)
 */

