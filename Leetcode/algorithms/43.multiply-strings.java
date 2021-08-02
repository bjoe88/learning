/*
 * @lc app=leetcode id=43 lang=java
 *
 * [43] Multiply Strings
 */

// @lc code=start
class Solution {
    public String multiply(String num1, String num2) {
        int m = num1.length(), n = num2.length();
        int[] answer = new int[m-- + n--];
        for (int i = m; i >= 0; i--) {
            for (int j = n; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0') + answer[ i + j + 1];
                answer[i+j] += mul / 10;
                answer[i+j+1] = mul % 10;
            }
        }
        StringBuilder ans = new StringBuilder();
        for( int p : answer) if(!(ans.length() == 0 && p == 0)) ans.append(p);
        return ans.length() == 0 ? "0" : ans.toString();
    }
}
// @lc code=end
/*
 * 311/311 cases passed (3 ms)
 * Your runtime beats 91.53 % of java submissions
 * Your memory usage beats 98.83 % of java submissions (38.5 MB)
 */