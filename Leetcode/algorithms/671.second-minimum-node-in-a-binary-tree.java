/*
 * @lc app=leetcode id=671 lang=java
 *
 * [671] Second Minimum Node In a Binary Tree
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int min1 = 0;
    long min2 = Long.MAX_VALUE;
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        helper(root);
        return min2 < Long.MAX_VALUE ? (int)min2 : -1;
        
    }

    public void helper(TreeNode root) {
        if(root != null){
            if(min1 < root.val && root.val < min2) {
                min2 = root.val;
            }
            else {
                helper(root.left);
                helper(root.right);
            }
        }
    }
}
// @lc code=end
/*
 * 39/39 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 88.51 % of java submissions (36.1 MB)
 */
