/*
 * @lc app=leetcode id=700 lang=java
 *
 * [700] Search in a Binary Search Tree
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
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null) {
            if(root.val == val) {
                return root;
            }
            if(val < root.val) {
                root = root.left;
            }
            else {
                root = root.right;
            }
        }
        return null;
    }
}
// @lc code=end
/*
 * 36/36 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 34.27 % of java submissions (40.1 MB)
 */
