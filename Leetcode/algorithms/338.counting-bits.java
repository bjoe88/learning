import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; ++i)
            ans[i] = ans[i & (i - 1)] + 1;
        return ans;
    }
}
// @lc code=end
/*
 * 15/15 cases passed (1 ms) 
 * Your runtime beats 99.9 % of java submissions 
 * Your memory usage beats 61.03 % of java submissions (43.1 MB)
 */
