/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 */

// @lc code=start
class Solution {
    public int findComplement(int num) {
        long nextBiggest2 = 1;
        while(nextBiggest2 <= num) nextBiggest2 *=  2;
        nextBiggest2--;
        return (int)(num ^ nextBiggest2);
    }
}
// @lc code=end
/*
 * 149/149 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 56.98 % of java submissions (35.9 MB)
 */

