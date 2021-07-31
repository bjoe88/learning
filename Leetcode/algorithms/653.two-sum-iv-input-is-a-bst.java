/*
 * @lc app=leetcode id=653 lang=java
 *
 * [653] Two Sum IV - Input is a BST
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
    List<Integer> inOrder = new ArrayList<>();
    public boolean findTarget(TreeNode root, int k) {
        helper(root);
        int ptr1 = 0;
        int ptr2 = inOrder.size() - 1;
        while (ptr1 < ptr2) {
            int sum = inOrder.get(ptr1) + inOrder.get(ptr2);
            if (sum == k) return true;
            if (sum < k) ptr1++;
            else ptr2--;
        }
        return false;
    }

    public void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        inOrder.add(root.val);
        helper(root.right);
    }
}
// @lc code=end
/*
 * 422/422 cases passed (2 ms)
 * Your runtime beats 97.6 % of java submissions
 * Your memory usage beats 63.57 % of java submissions (40.1 MB)
 */

