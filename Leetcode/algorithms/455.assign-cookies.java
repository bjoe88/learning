import java.util.Arrays;

/*
 * @lc app=leetcode id=455 lang=java
 *
 * [455] Assign Cookies
 */

// @lc code=start
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int ptr1 = g.length - 1;
        int ptr2 = s.length - 1;
        while (ptr1 >= 0 && ptr2 >= 0) {
            if (g[ptr1] <= s[ptr2]) {
                count++;
                ptr2--;
            }
            ptr1--;
        }
        return count;

    }
}
// @lc code=end
/*
 * 21/21 cases passed (6 ms)
 * Your runtime beats 98.65 % of java submissions
 * Your memory usage beats 93.99 % of java submissions (39.4 MB)
 */