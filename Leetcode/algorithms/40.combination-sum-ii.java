/*
 * @lc app=leetcode id=40 lang=java
 *
 * [40] Combination Sum II
 */

// @lc code=start
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        Arrays.sort(candidates);

        backtrack(candidates, comb, target, 0, results);
        return results;
    }

    private void backtrack(int[] candidates, LinkedList<Integer> comb,
                           Integer remain, Integer curr,
                           List<List<Integer>> results) {
        if (remain == 0) {
            // copy the current combination to the final list.
            results.add(new ArrayList<Integer>(comb));
            return;
        }

        for (int nextCurr = curr; nextCurr < candidates.length; ++nextCurr) {
            if (nextCurr > curr && candidates[nextCurr] == candidates[nextCurr - 1])
                continue;

            Integer pick = candidates[nextCurr];
            // optimization: early stopping
            if (remain - pick < 0)
                break;

            comb.addLast(pick);
            backtrack(candidates, comb, remain - pick, nextCurr + 1, results);
            comb.removeLast();
        }
    }
}
// @lc code=end
/*
 * 175/175 cases passed (2 ms)
 * Your runtime beats 98.91 % of java submissions
 * Your memory usage beats 62.09 % of java submissions (39.3 MB)
 */

