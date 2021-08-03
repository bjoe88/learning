/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution {
    public double myPow(double x, int n) { 
        long N = n;  
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        double ans = 1;
        double current_product = x; 
        for (long i = N; i > 0; i /= 2) {  
            if ((i % 2) == 1) {
                ans = ans * current_product;  
            }
            current_product = current_product * current_product;  
        }
        return ans;
    }
};
// @lc code=end
/* 
 * 304/304 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 55.74 % of java submissions (38.3 MB)
 */