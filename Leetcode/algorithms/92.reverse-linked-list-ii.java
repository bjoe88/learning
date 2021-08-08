/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode preHead = new ListNode(0, head);
        ListNode prevLeft = preHead;
        ListNode prevHead = preHead;
        int countNode = 0;
        while( head != null) {
            countNode++;
            if(countNode == left - 1) {
                prevLeft = head;
                head = head.next;
                prevHead = prevHead.next;
            }
            else if( countNode >= left && countNode <= right) {
                ListNode tmp = head;
                head = head.next;
                if (prevLeft.next != tmp) {
                    tmp.next = prevLeft.next;
                    prevLeft.next = tmp;
                    prevHead.next = head;
                }
                else {
                    prevHead = prevHead.next;
                }
            }
            else {
                head = head.next;
                prevHead = prevHead.next;
            }
        }
        return preHead.next;
    }
}
// @lc code=end
/*
 * 44/44 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 49.87 % of java submissions (36.7 MB)
 */
