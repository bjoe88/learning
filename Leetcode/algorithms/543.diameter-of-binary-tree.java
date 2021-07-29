/*
 * @lc app=leetcode id=543 lang=java
 *
 * [543] Diameter of Binary Tree
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
    int maxValue;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int leftMax = diameterOfBinaryTreeBranch(root.left);
        int rightMax = diameterOfBinaryTreeBranch(root.right);
        return Math.max(this.maxValue, leftMax + rightMax);
    }

    public int diameterOfBinaryTreeBranch(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;
        int leftMax = diameterOfBinaryTreeBranch(root.left);
        int rightMax = diameterOfBinaryTreeBranch(root.right);
        this.maxValue = Math.max(this.maxValue, leftMax + rightMax);
        return Math.max(leftMax, rightMax) + 1;
    }
    
}
// @lc code=end
/*
 * 104/104 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 55.8 % of java submissions (39 MB)
 */
