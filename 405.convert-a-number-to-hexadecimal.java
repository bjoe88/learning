/*
 * @lc app=leetcode id=405 lang=java
 *
 * [405] Convert a Number to Hexadecimal
 */

// @lc code=start
class Solution {
    public String toHex(int num) {
        if( num == 0 ) return "0";
        String charList = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        while(num != 0){
            sb.append(charList.charAt(num & 15)); 
            num = (num >>> 4);
        }
        return sb.reverse().toString();
    }
}
// @lc code=end
/*
 * 100/100 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 78.2 % of java submissions (36.2 MB)
 */