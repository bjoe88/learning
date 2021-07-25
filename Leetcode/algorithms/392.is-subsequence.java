import java.util.Arrays;

/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if( t.length() == 0 && s.length() > 0) return false;
        int[][] charCount = new int[26][t.length() + 1];
        for (int i = 0; i < t.length(); i++) {
            int[] ccTemp = charCount[t.charAt(i) - 'a'];
            ccTemp[0]++;
            ccTemp[ccTemp[0]] = i + 1;

        }
        for (int i = 0; i < 26; i++) {
            charCount[i][0] = 1;
        }
        int cfi = -1;
        for (int i = 0; i < s.length(); i++) {
            int ci = s.charAt(i) - 'a';
            int[] ccTemp = charCount[ci];
            int cci = ccTemp[0];
            while (ccTemp[cci] <= cfi) {
                cci++;
                if (cci >= ccTemp.length) {
                    return false;
                }
            }
            cfi = ccTemp[cci];
            if (ccTemp[cci] == 0)
                return false;
            ccTemp[0] = cci;
        }
        return true;
    }

}
// @lc code=end
/*
 * 17/17 cases passed (1 ms)
 * Your runtime beats 79.39 % of java submissions
 * Your memory usage beats 13.37 % of java submissions (38.9 MB)
 */
