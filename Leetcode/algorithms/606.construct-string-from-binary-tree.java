/*
 * @lc app=leetcode id=606 lang=java
 *
 * [606] Construct String from Binary Tree
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
    public String tree2str(TreeNode root) {
        if(root == null) return "";
        StringBuilder sb = new StringBuilder();
        tree2strHelper(root, sb);
        return sb.toString();

    }

    public void tree2strHelper(TreeNode root, StringBuilder sb) {
        sb.append(root.val);
        if (root.left != null) {
            sb.append('(');
            tree2strHelper(root.left, sb);
            sb.append(')');
        }
        if (root.right != null) {
            if (root.left == null) { 
                sb.append("()");
            }
            sb.append('(');
            tree2strHelper(root.right, sb);
            sb.append(')');
        }
    }

}
// @lc code=end
/*
 * 160/160 cases passed (1 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 89.32 % of java submissions (38.8 MB)
 */

