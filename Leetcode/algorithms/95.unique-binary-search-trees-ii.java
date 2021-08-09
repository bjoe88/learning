/*
 * @lc app=leetcode id=95 lang=java
 *
 * [95] Unique Binary Search Trees II
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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new ArrayList<TreeNode>();

        return perm(1,n);
    }

    private List<TreeNode> perm(int start, int end) {
        List<TreeNode> allTree = new ArrayList<>();
        if(start > end) {
            allTree.add(null);
            return allTree;
        }
        for ( int i = start; i <= end; i++) {
            List<TreeNode> lefts = perm(start, i - 1);
            List<TreeNode> rights = perm(i + 1, end);
            for(TreeNode left: lefts) {
                for (TreeNode right: rights) {
                    TreeNode root = new TreeNode(i, left, right);
                    allTree.add(root);
                }
            }
        }
        return allTree;     
    }
}
// @lc code=end
/*
 * 8/8 cases passed (1 ms)
 * Your runtime beats 92.03 % of java submissions
 * Your memory usage beats 14.38 % of java submissions (40 MB)
 */

