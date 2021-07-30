/*
 * @lc app=leetcode id=590 lang=java
 *
 * [590] N-ary Tree Postorder Traversal
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
    List<Integer> answer = new ArrayList<Integer>();
    public List<Integer> postorder(Node root) {
        postorderTraversal(root);
        return this.answer;    
    }

    public void postorderTraversal(Node root) {
        if (root == null) return;
        for (int i = 0; i < root.children.size(); i++) {
            postorderTraversal(root.children.get(i));
        }
        this.answer.add(root.val);
        return;
    }

}
// @lc code=end
/*
 * 38/38 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 91.85 % of java submissions (39.5 MB)
 */

