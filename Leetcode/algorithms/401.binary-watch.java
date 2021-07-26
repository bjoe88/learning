/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 */

// @lc code=start
class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> times = new ArrayList<>();
        for (int h = 0; h < 12; h++)
            for (int m = 0; m < 60; m++)
                if (Integer.bitCount(h * 64 + m) == num)
                    times.add(String.format("%d:%02d", h, m));
        return times;
    }
}
// @lc code=end
/*
 * 11/11 cases passed (15 ms)
 * Your runtime beats 29.11 % of java submissions
 * Your memory usage beats 44.61 % of java submissions (39.3 MB)
 */
