/*
 * @lc app=leetcode id=278 lang=java
 *
 * [278] First Bad Version
 */

// @lc code=start
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while( low < high) {
            int mid = (low + (high - low) / 2);
            if( isBadVersion(mid) ){
                high = mid;
            }
            else {
                low = mid + 1;
            }
        }
        return low;
    }
}
// @lc code=end
/*
 * 22/22 cases passed (12 ms)
 * Your runtime beats 98.44 % of java submissions
 * Your memory usage beats 52.03 % of java submissions (35.8 MB)
 */
