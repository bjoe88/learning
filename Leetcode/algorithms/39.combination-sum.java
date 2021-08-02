/*
 * @lc app=leetcode id=39 lang=java
 *
 * [39] Combination Sum
 */

// @lc code=start
class Solution {
    int[] candidatesArray;
    List<List<Integer>> results;
    LinkedList<Integer> comb;
    protected void backtrack(int remain, int startingPoint) {
        if (remain == 0) this.results.add(new ArrayList<Integer>(this.comb));
        if (remain <= 0) return; 

        for (int i = startingPoint; i < this.candidatesArray.length; ++i) {
            this.comb.add(this.candidatesArray[i]);
            this.backtrack(remain - this.candidatesArray[i], i);
            this.comb.removeLast();
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.comb = new LinkedList<Integer>();
        this.results = new ArrayList<List<Integer>>();
        this.candidatesArray = candidates;
        this.backtrack(target,0);
        return this.results;
    }
}
// @lc code=end
/*
 * 170/170 cases passed (3 ms)
 * Your runtime beats 77.27 % of java submissions
 * Your memory usage beats 34.93 % of java submissions (39.6 MB)
 */