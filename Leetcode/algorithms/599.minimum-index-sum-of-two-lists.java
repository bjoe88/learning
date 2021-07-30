/*
 * @lc app=leetcode id=599 lang=java
 *
 * [599] Minimum Index Sum of Two Lists
 */

// @lc code=start
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> answer = new ArrayList<>();
        int minSumIndex = Integer.MAX_VALUE;
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < list1.length; i++)  {
            map1.put(list1[i],i);
        }

        for (int i = 0; i < list2.length && i <= minSumIndex; i++) {
            if (map1.containsKey(list2[i])) {
                int newVal = map1.get(list2[i]) + i;
                if( newVal < minSumIndex) {
                    answer.clear();
                    minSumIndex = newVal;
                }
                if (newVal == minSumIndex) { 
                    answer.add(list2[i]);
                }
            }
        }
        return answer.toArray(new String[0]);
    }
}
// @lc code=end
/*
 * 136/136 cases passed (5 ms)
 * Your runtime beats 99.88 % of java submissions
 * Your memory usage beats 92.94 % of java submissions (39.4 MB)
 */

