/*
 * @lc app=leetcode id=605 lang=java
 *
 * [605] Can Place Flowers
 */

// @lc code=start
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countCanPlant = 0;
        for ( int i = 0; i< flowerbed.length; i++ ) {
            if (flowerbed[i] == 0 && 
               (i == 0 || flowerbed[i-1] == 0) && 
               (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                countCanPlant++;
                flowerbed[i] = 1;
            }
        }
        return countCanPlant >= n;
    }
}
// @lc code=end
/*
 * 124/124 cases passed (1 ms)
 * Your runtime beats 89.47 % of java submissions
 * Your memory usage beats 78.23 % of java submissions (40.4 MB)
 */
