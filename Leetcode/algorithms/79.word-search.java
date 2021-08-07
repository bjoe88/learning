/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i< board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backTracking(board, word, word.length() - 1, i, j, new boolean[board.length][board[0].length])) return true;
            }
        }
        return false;
    }

    private boolean backTracking(char[][] board, String word, int wordIndex, int i, int j, boolean[][] visited ) {
        if ( wordIndex < 0) return true;
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) return false;
        if (visited[i][j] || board[i][j] != word.charAt(wordIndex)) return false;
        visited[i][j] = true;
        boolean match = backTracking(board, word, wordIndex - 1, i, j + 1, visited);
        match |= backTracking(board, word, wordIndex - 1, i + 1, j, visited);
        match |= backTracking(board, word, wordIndex - 1, i, j - 1, visited);
        match |= backTracking(board, word, wordIndex - 1, i - 1, j, visited);
        return match;
    }
}
// @lc code=end
/*
 * 54/54 cases passed (1 ms)
 * Your runtime beats 98.86 % of java submissions
 * Your memory usage beats 27.63 % of java submissions (38.7 MB)
 */

