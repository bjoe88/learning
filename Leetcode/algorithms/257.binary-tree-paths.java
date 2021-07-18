package Leetcode.algorithms;
/*
 * @lc app=leetcode id=257 lang=java
 *
 * [257] Binary Tree Paths
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
    LinkedList<String> answer = new LinkedList();
    public List<String> binaryTreePaths(TreeNode root) {
        traversePaths(root, "");
        return answer;
    }

    void traversePaths(TreeNode root, String path) {
        if(root == null) return;
        path += Integer.toString(root.val);
        if(root.left == null&& root.right == null) {
            this.answer.add(path);
            return;
        }
        path += "->";
        traversePaths(root.left, path);
        traversePaths(root.right, path);
    }
}
// @lc code=end
/*
 * 208/208 cases passed (1 ms)
 * Your runtime beats 99.88 % of java submissions
 * Your memory usage beats 43.82 % of java submissions (39.4 MB)
 */
