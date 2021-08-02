/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        LinkedList<Integer> comb = new LinkedList<>();
        helper(nums,comb, 0);

        return answer;
    }

    public void helper(int[] nums, LinkedList<Integer> comb, int len) {
        if( nums.length == len) {
            answer.add(new ArrayList<Integer>(comb));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < -10) continue;
            comb.add(nums[i]);
            int tmp = nums[i];
            nums[i] = -11;
            helper(nums, comb, len + 1);
            nums[i] = tmp;
            comb.removeLast();
        }

    }
}
// @lc code=end
/*
 * 26/26 cases passed (1 ms)
 * Your runtime beats 92.91 % of java submissions
 * Your memory usage beats 81.18 % of java submissions (39.1 MB)
 */