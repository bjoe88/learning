import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=559 lang=java
 *
 * [559] Maximum Depth of N-ary Tree
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
    public int maxDepth(Node root) {
        if(root == null) return 0;
        int maxDepthChildren = 0;
        for(int i = 0; i < root.children.size(); i++) {
            maxDepthChildren = Math.max(maxDepthChildren, maxDepth(root.children.get(i)));
        }
        return maxDepthChildren + 1;
    }
}
// @lc code=end
/*
 * 38/38 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 66.03 % of java submissions (39.1 MB)
 */
