/*
 * @lc app=leetcode id=90 lang=java
 *
 * [90] Subsets II
 */

// @lc code=start
class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        LinkedList<Integer> comb = new LinkedList<>();
        perm(nums, comb, 0);
        return answer;
    }

    private void perm(int[] nums, LinkedList<Integer> comb, int start) {
        this.answer.add(new ArrayList(comb));
        for (int i = start; i < nums.length; i++) {
            if(i != start && nums[i] == nums[i - 1]) continue;
            comb.add(nums[i]);
            perm(nums, comb, i + 1);
            comb.removeLast();
        }
    }
}
// @lc code=end
/*
 * 19/19 cases passed (1 ms)
 * Your runtime beats 99.53 % of java submissions
 * Your memory usage beats 84.73 % of java submissions (39 MB)
 */

