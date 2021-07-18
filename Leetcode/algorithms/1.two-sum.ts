/*
 * @lc app=leetcode id=1 lang=typescript
 *
 * [1] Two Sum
 */

// @lc code=start
function twoSum(nums: number[], target: number): number[] {
    var hash = {};
    for(var i = 0; true; i++) {
        var ele = nums[i];
        if(typeof hash[target-ele] !== 'undefined') {
            return [hash[target-ele], i];
        }
        hash[ele] = i;
    }
};
// @lc code=end
/*
    Accepted
    54/54 cases passed (80 ms)
    Your runtime beats 92.16 % of typescript submissions
    Your memory usage beats 72.83 % of typescript submissions (41 MB)
*/
