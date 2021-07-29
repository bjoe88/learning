/*
 * @lc app=leetcode id=541 lang=java
 *
 * [541] Reverse String II
 */

// @lc code=start
class Solution {
    public String reverseStr(String s, int k) {
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i += 2 * k) {
            int start = i, end = Math.min(i + k - 1, a.length - 1);
            while (start < end) {
                char tmp = a[start];
                a[start++] = a[end];
                a[end--] = tmp;
            }
        }
        return new String(a);
    }
}
// @lc code=end
/*
 * 60/60 cases passed (1 ms)
 * Your runtime beats 77.98 % of java submissions
 * Your memory usage beats 39.95 % of java submissions (39.2 MB)
 */
