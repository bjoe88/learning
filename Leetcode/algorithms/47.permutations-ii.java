/*
 * @lc app=leetcode id=47 lang=java
 *
 * [47] Permutations II
 */

// @lc code=start
class Solution {
    List<List<Integer>> answer = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> numsCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numsCount.containsKey(nums[i])) {
                numsCount.put(nums[i], 0);
            }
            numsCount.put(nums[i], numsCount.get(nums[i]) + 1); 
        }
        LinkedList<Integer> comb = new LinkedList<>();
        backTrack(numsCount, comb, nums.length);
        return this.answer;
    }

    public void backTrack(HashMap<Integer, Integer> numsCount, LinkedList<Integer> comb, int numsSize) {
        if(comb.size() == numsSize) {
            this.answer.add(new ArrayList<Integer>(comb));
            return;
        }

        for (Map.Entry<Integer, Integer> entry : numsCount.entrySet()) { 
            int key = entry.getKey();
            int value = entry.getValue();
            if (value == 0) continue;
            numsCount.put(key, value - 1);
            comb.add(key);
            backTrack(numsCount, comb, numsSize);
            comb.removeLast();
            numsCount.put(key, value);
        }
    }

}
// @lc code=end
/*
 * 33/33 cases passed (3 ms)
 * Your runtime beats 46.53 % of java submissions
 * Your memory usage beats 76.52 % of java submissions (39.6 MB)
 */
