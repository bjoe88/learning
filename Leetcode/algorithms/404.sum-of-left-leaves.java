/*
 * @lc app=leetcode id=404 lang=java
 *
 * [404] Sum of Left Leaves
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
    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root.left, false) + sumOfLeftLeaves(root.right, true);
    }

    public int sumOfLeftLeaves(TreeNode root, Boolean justTraverse) {
        if (root == null)
            return 0;
        if (!justTraverse && root.left == null && root.right == null)
            return root.val;
        return sumOfLeftLeaves(root.left, false) + sumOfLeftLeaves(root.right, true);
    }
}
// @lc code=end
/*
 * 100/100 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 37.3 % of java submissions (36.9 MB)
 */

