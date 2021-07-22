/*
 * @lc app=leetcode id=303 lang=java
 *
 * [303] Range Sum Query - Immutable
 */

// @lc code=start
class NumArray {
    int[] sums;

    public NumArray(int[] nums) {
        this.sums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            this.sums[i] = nums[i - 1] + this.sums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        return this.sums[right + 1] - this.sums[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such: NumArray obj =
 * new NumArray(nums); int param_1 = obj.sumRange(left,right);
 */
// @lc code=end
/*
 * 15/15 cases passed (6 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 67.4 % of java submissions (43.1 MB)
 */
