/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> comb = new LinkedList<>();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        perm(nums, 0, comb, k);
        return answer;
    }

    public void perm(int[] nums, int startI, LinkedList comb, int k) {
        if (comb.size() == k) {
            this.answer.add(new ArrayList(comb));
            return;
        }
        for (int i = startI; i < nums.length; i++) {
            comb.add(nums[i]);
            perm(nums, i  + 1, comb, k);
            comb.removeLast();
        }

    }
}
// @lc code=end
/*
 * 27/27 cases passed (15 ms)
 * Your runtime beats 76.91 % of java submissions
 * Your memory usage beats 94.47 % of java submissions (40 MB)
 */