/*
 * @lc app=leetcode id=661 lang=java
 *
 * [661] Image Smoother
 */

// @lc code=start
class Solution {
    public int[][] imageSmoother(int[][] img) {
        int m = img.length;
        int n = img[0].length;
        int[][] ans = new int[m][n];
        for (int x = 0; x < m; x++) {
            for (int y = 0; y < n; y++) {
                int sum = helperSum(img, x - 1, y - 1) +
                helperSum(img, x - 1, y) +
                helperSum(img, x - 1, y +  1) +
                helperSum(img, x, y - 1) +
                helperSum(img, x, y) +
                helperSum(img, x, y +  1) +
                helperSum(img, x + 1, y - 1) +
                helperSum(img, x + 1, y) +
                helperSum(img, x + 1, y +  1);
                ans[x][y] = sum / helperCount(img, x ,y);
            }
        }
        return ans;
    }

    public int helperSum(int[][] img, int x, int y) {
        if( x < 0 || x >= img.length) return 0;
        if( y < 0 || y >= img[0].length) return 0;
        return img[x][y];
    }

    public int helperCount(int[][] img, int x, int y) {
        int m = 3;
        int n = 3;
        if (x == 0) m--;
        if (x == img.length - 1) m--;
        if (y == 0) n--;
        if (y == img[0].length - 1) n--;
        return m*n;
    }
}
// @lc code=end
/*
 * 203/203 cases passed (7 ms)
 * Your runtime beats 63.45 % of java submissions
 * Your memory usage beats 62.92 % of java submissions (39.9 MB)
 */

