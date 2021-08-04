/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || k == 0) return head;

        int len = 1;
        ListNode tmp = head;
        ListNode tmp2 = head;
        while(tmp.next != null) {
            len++;
            tmp = tmp.next;
        }

        k = k % len;
        tmp = head;
        for (int i = 0; i < k; i++) {
            tmp2 = tmp2.next;
        } 
        while(tmp2.next != null) {
            tmp2  = tmp2.next;
            tmp = tmp.next;
        }

        tmp2.next = head;
        head = tmp.next;
        tmp.next = null;
        return head;

    }
}
// @lc code=end
/*
 * 231/231 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 63.44 % of java submissions (38.3 MB)
 */
