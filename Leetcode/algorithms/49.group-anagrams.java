/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>  answer = new ArrayList<>();
        HashMap<String, Integer> sortedAnagrams = new HashMap<>();
        for (int i = 0; i  < strs.length; i++) {
            char[] key = strs[i].toCharArray();
            Arrays.sort(key);
            String sortedKey = String.valueOf(key);
            if(!sortedAnagrams.containsKey(sortedKey)) {
                sortedAnagrams.put(sortedKey, answer.size());
                answer.add(new ArrayList<String>());
            }
            List<String> group = answer.get(sortedAnagrams.get(sortedKey));
            group.add(strs[i]);
            answer.set(sortedAnagrams.get(sortedKey), group);
        }

        return answer;
    }
}
// @lc code=end
/*
 * 114/114 cases passed (6 ms)
 * Your runtime beats 79.13 % of java submissions
 * Your memory usage beats 61.93 % of java submissions (42.1 MB)
 */

