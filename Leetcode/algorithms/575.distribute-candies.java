import java.util.HashSet;

/*
 * @lc app=leetcode id=575 lang=java
 *
 * [575] Distribute Candies
 */

// @lc code=start
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> eaten = new HashSet<Integer>();
        for(int i = 0; i < candyType.length; i++) {
            eaten.add(candyType[i]);
        }
        return Math.min(eaten.size(), candyType.length / 2);
    }
}
// @lc code=end
/*
 *206/206 cases passed (32 ms)
 *Your runtime beats 78.31 % of java submissions
 *Your memory usage beats 40.82 % of java submissions (41.2 MB)
 */

