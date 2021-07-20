/*
 * @lc app=leetcode id=25 lang=java
 *
 * [25] Reverse Nodes in k-Group
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Get len for ListNode
        int len = 0;
        ListNode curr = head;
        while (curr != null) {
            len++;
            curr = curr.next;
        }
        int repeatCount = len / k;
        ListNode pre = new ListNode();
        pre.next = head;
        curr = head;
        for (int i = 0; i < repeatCount; i++) {
            curr = reverseNextK(curr, k);
            pre.next = curr;
            if (i == 0)
                head = curr;
            for (int j = 0; j < k; j++) {
                pre = pre.next;
                curr = curr.next;
            }
        }
        return head;
    }

    public ListNode reverseNextK(ListNode node, int k) {
        ListNode prev = node;
        ListNode next = null;
        for (int i = 0; i < k - 1; i++) {
            next = node.next;
            node.next = next.next;
            next.next = prev;
            prev = next;
        }
        node = prev;
        return node;
    }
}
// @lc code=end
/*
 * 62/62 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 82.74 % of java submissions (39.1 MB)
 */
