/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            long sum = 0, count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while(!queue.isEmpty()) {
                TreeNode cur = queue.remove();
                sum += cur.val;
                count++;
                if (cur.left != null)
                    temp.add(cur.left);
                if (cur.right != null)
                    temp.add(cur.right);
            }
            queue = temp;
            ans.add(sum * 1.0 / count);

        }
        return ans;
    }
}
// @lc code=end
/*
 * 66/66 cases passed (2 ms)
 * Your runtime beats 82.73 % of java submissions
 * Your memory usage beats 78.95 % of java submissions (40.9 MB)
 */