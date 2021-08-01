/*
 * @lc app=leetcode id=709 lang=java
 *
 * [709] To Lower Case
 */

// @lc code=start
class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char newChar = s.charAt(i);
            if (newChar >= 'A' && newChar <= 'Z') {
                char a = 'a';
                a += (newChar - 'A');
                newChar = a;
            }
            ans.append(newChar);
        }
        return ans.toString();
    }
}
// @lc code=end
/*
 * 114/114 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 32.53 % of java submissions (37.6 MB)
 */
