/*
 * @lc app=leetcode id=589 lang=java
 *
 * [589] N-ary Tree Preorder Traversal
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> preorder(Node root) {
        preorderTraversal(root);
        return this.ans;    
    }

    public void preorderTraversal(Node root) {
        if (root ==  null) return;
        this.ans.add(root.val);
        for (int i = 0; i < root.children.size(); i++) {
            preorderTraversal(root.children.get(i));
        }
        return;
    }
}
// @lc code=end
/*
 * 38/38 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 70.5 % of java submissions (39.6 MB)
 */

