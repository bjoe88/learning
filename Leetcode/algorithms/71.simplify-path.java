/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<String>();
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == '/') continue;
            int stringStart = i;
            while(i < path.length() && path.charAt(i) != '/') i++;
            String currPath = path.substring(stringStart,i);
            if( currPath.equals(".")) continue;
            if( currPath.equals("..")) {
                    stack.pollLast();
            }
            else {
                stack.add(currPath);
            }
        }
        return "/" + String.join("/", stack);
    }
}
// @lc code=end
/*
 * 256/256 cases passed (4 ms)
 * Your runtime beats 76.67 % of java submissions
 * Your memory usage beats 94.84 % of java submissions (38.8 MB)
 */

