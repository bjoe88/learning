/*
 * @lc app=leetcode id=89 lang=java
 *
 * [89] Gray Code
 */

// @lc code=start
public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        result.add(0);

        for (int i = 1; i <= n; i++) {
            int previousSequenceLength = result.size();
            int mask = 1 << (i - 1);
            for (int j = previousSequenceLength - 1; j >= 0; j--) {
                result.add(mask + result.get(j));
            }
        }
        return result;
    }
}
// @lc code=end
/*
 * 16/16 cases passed (5 ms)
 * Your runtime beats 65.74 % of java submissions
 * Your memory usage beats 32.45 % of java submissions (46.7 MB)
 */