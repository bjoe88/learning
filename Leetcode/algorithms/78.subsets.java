/*
 * @lc app=leetcode id=78 lang=java
 *
 * [78] Subsets
 */

// @lc code=start
class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> comb = new LinkedList<>();
        perm(nums, comb, 0);
        return answer;

    }

    public void perm(int[] nums, LinkedList<Integer> comb, int startFrom) {
        this.answer.add(new ArrayList(comb));
        for (int i = startFrom; i < nums.length; i++) {
            comb.add(nums[i]);
            perm(nums, comb, i+1);
            comb.removeLast();
        }
    }
}
// @lc code=end
/*
 * 10/10 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 96.28 % of java submissions (38.8 MB)
 */