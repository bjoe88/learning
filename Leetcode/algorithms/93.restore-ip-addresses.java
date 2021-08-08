/*
 * @lc app=leetcode id=93 lang=java
 *
 * [93] Restore IP Addresses
 */




// @lc code=start
class Solution {
    List<String> answer = new ArrayList<>();
    public List<String> restoreIpAddresses(String s) {
        LinkedList<String> comb = new LinkedList<>();
        perm(s,0,comb);
        return answer;
    }

    private void perm(String s, int startAt, LinkedList<String> comb) {
        if( comb.size() == 4 ) {
            if( startAt != s.length()) return;
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < comb.size();i++) {
                if(i>0) {
                    ans.append(".");
                }
                ans.append(comb.get(i));
            }
            this.answer.add(ans.toString());
            return;
        }
        triggerNextPerm(s, startAt, 0, comb);
        triggerNextPerm(s, startAt, 1, comb);
        triggerNextPerm(s, startAt, 2, comb); 
    }

    private void triggerNextPerm(String s, int startAt, int newSLen, LinkedList<String> comb) {
        if( startAt + newSLen >= s.length()) return;
        String ipEle = s.substring(startAt, startAt + 1 + newSLen);
        if (isValid(ipEle)) {
            comb.add(ipEle);
            perm(s,startAt + 1 + newSLen, comb);
            comb.removeLast();
        }   
    }

    private boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') return false;
        int n = Integer.parseInt(s);
        return n >= 0 && n <= 255;
    }
}
// @lc code=end
/*
 * 147/147 cases passed (1 ms)
 * Your runtime beats 99.24 % of java submissions
 * Your memory usage beats 49.88 % of java submissions (39.2 MB)
 */
