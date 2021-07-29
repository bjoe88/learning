/*
 * @lc app=leetcode id=563 lang=java
 *
 * [563] Binary Tree Tilt
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
    int tiltSum;
    public int findTilt(TreeNode root) {
        tiltSum = 0;
        processTilt(root);
        return tiltSum;
    }

    public int processTilt(TreeNode root) {
        if (root == null) return 0;
        int sumLeft= processTilt(root.left);
        int sumRight= processTilt(root.right);
        tiltSum += Math.abs(sumLeft - sumRight);
        return root.val + sumLeft + sumRight;
    }
}
// @lc code=end
/*
 * 77/77 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 98.57 % of java submissions (38.6 MB)
 */

