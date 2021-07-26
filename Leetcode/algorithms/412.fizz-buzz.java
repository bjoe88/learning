import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            ans.add(String.valueOf(i));
        }
        for (int i = 2; i < n; i+= 3) {
            ans.set(i, "Fizz");
        }
        for (int i = 4; i < n; i+= 5) {
            ans.set(i, "Buzz");

        }
        for (int i = 14; i < n; i+= 15) {
            ans.set(i, "FizzBuzz");
        }
        return ans;

    }

}
// @lc code=end
/*
 * 8/8 cases passed (1 ms)
 * Your runtime beats 99.77 % of java submissions
 * Your memory usage beats 40.05 % of java submissions (40.3 MB)
 */