/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letters = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            letters[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int li = ransomNote.charAt(i) - 'a';
            if (letters[li] == 0)
                return false;
            letters[li]--;
        }

        return true;
    }
}
// @lc code=end
/*
 * 126/126 cases passed (3 ms)
 * Your runtime beats 80.03 % of java submissions
 * Your memory usage beats 94.83 % of java submissions (38.9 MB)
 */
