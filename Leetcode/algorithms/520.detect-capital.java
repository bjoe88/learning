/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start
class Solution {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        boolean allIsCapital = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                if (i > 1 && allIsCapital)
                    return false;
                allIsCapital = false;
            } else {
                if (!allIsCapital)
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end
/*
 * 550/550 cases passed (1 ms)
 * Your runtime beats 99.28 % of java submissions
 * Your memory usage beats 55.22 % of java submissions (37.5 MB)
 */
