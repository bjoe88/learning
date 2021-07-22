package Leetcode.algorithms;
/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

import java.util.HashMap;

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String, Character> wordMapping = new HashMap<String, Character>();
        boolean[] charUsed = new boolean[26];
        // using simple for-loop
        StringBuilder word = new StringBuilder();
        int patternCount = 0;
        for (int i = 0; i < s.length() && patternCount < pattern.length(); i++) {
            if (s.charAt(i) != ' ') {
                word.append(s.charAt(i));
            }
            else {
                if(wordMapping.containsKey(word.toString())) {
                    if(wordMapping.get(word.toString()) != pattern.charAt(patternCount)) {
                        return false;
                    }
                }
                else {
                    if(charUsed[pattern.charAt(patternCount) - 'a']) {
                        return false;
                    }
                    charUsed[pattern.charAt(patternCount) - 'a'] = true;
                    wordMapping.put(word.toString(), pattern.charAt(patternCount));
                }
                patternCount++;
                word.setLength(0);
            }
        }
        if(patternCount != pattern.length() - 1) return false;
        if(wordMapping.containsKey(word.toString())) {
            if(wordMapping.get(word.toString()) != pattern.charAt(patternCount)) {
                return false;
            }
        }
        else {
            if(charUsed[pattern.charAt(patternCount) - 'a']) {
                return false;
            }
            charUsed[pattern.charAt(patternCount) - 'a'] = true;
            wordMapping.put(word.toString(), pattern.charAt(patternCount));
        }
        return true;
    }
}
// @lc code=end
/*
 * 36/36 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 54.15 % of java submissions (37.1 MB)
 */

