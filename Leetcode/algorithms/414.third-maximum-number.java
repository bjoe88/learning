/*
 * @lc app=leetcode id=414 lang=java
 *
 * [414] Third Maximum Number
 */

// @lc code=start
class Solution {
    public int thirdMax(int[] nums) {
        Integer first = null, second = null, third = null, temp;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            if (temp.equals(first) || temp.equals(second) || temp.equals(third))
                continue;
            if (first == null || temp > first) {
                third = second;
                second = first;
                first = temp;
            } else if (second == null || temp > second) {
                third = second;
                second = temp;
            } else if (third == null || temp > third) {
                third = temp;
            }

        }
        return third == null ? first : third;
    }
}
// @lc code=end
/*
 * 29/29 cases passed (2 ms)
 * Your runtime beats 68.67 % of java submissions
 * Your memory usage beats 85.74 % of java submissions (38.5 MB)
 */
