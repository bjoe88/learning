/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        if(s.length() == 1) return s;
        char output[] = s.toCharArray();

        int ptr1 = 0, ptr2 = s.length() - 1;
        while (ptr1 < ptr2) {
            if (!isVowel(output[ptr1])) {
                ptr1++;
                continue;
            }
            if (!isVowel(output[ptr2])) {
                ptr2--;
                continue;
            }
            output[ptr1] = s.charAt(ptr2);
            output[ptr2] = s.charAt(ptr1);
            ptr1++;
            ptr2--;
        }
        return new String(output);
    }

    public boolean isVowel(char a) {
        return a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U';
    }
}
// @lc code=end
/*
 * 480/480 cases passed (2 ms)
 * Your runtime beats 99.17 % of java submissions
 * Your memory usage beats 94.22 % of java submissions (38.7 MB)
 */
