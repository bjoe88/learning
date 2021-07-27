/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {
        int carryOver = 0;
        StringBuilder sb = new StringBuilder();
        int maxN1 = num1.length();
        int maxN2 = num2.length();
        int maxLen = Math.max(maxN1, maxN2);
        for(int i = 1; i <= maxLen; i++) {
            int n1 = i  <= maxN1 ? num1.charAt(maxN1 - i) - '0' : 0;
            int n2 = i  <= maxN2 ? num2.charAt(maxN2 - i) - '0' : 0;
            n2 += n1 + carryOver;
            carryOver = 0;
            if ( n2 > 9 ) {
                n2 -= 10;
                carryOver = 1;
            }
            sb.append(n2);
        }
        if(carryOver == 1) sb.append("1");
        return sb.reverse().toString();
    }
}
// @lc code=end
/*
 * 317/317 cases passed (2 ms)
 * Your runtime beats 91.95 % of java submissions
 * Your memory usage beats 73.85 % of java submissions (39 MB)
 */

