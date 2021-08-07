/*
 * @lc app=leetcode id=86 lang=java
 *
 * [86] Partition List
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
    public ListNode partition(ListNode head, int x) {
        ListNode preHead =  new ListNode(0, head);
        ListNode lastBeforeX = preHead;
        while(head != null && head.val < x) {
            head = head.next;
            lastBeforeX = lastBeforeX.next;
        }
        if(head == null) return preHead.next;
        ListNode prev = lastBeforeX;
        while(head != null) {
            if(head.val < x) {
                prev.next = head.next;
                head.next = lastBeforeX.next;
                lastBeforeX.next = head;
                lastBeforeX = lastBeforeX.next;
                head = prev.next;
                continue;
            }
            head = head.next;
            prev = prev.next;
        }
        return preHead.next;
    }
}
// @lc code=end
/*
 * 168/168 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 15.67 % of java submissions (38.7 MB)
 */
