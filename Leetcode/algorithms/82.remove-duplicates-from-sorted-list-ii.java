/*
 * @lc app=leetcode id=82 lang=java
 *
 * [82] Remove Duplicates from Sorted List II
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev = new ListNode(0,head);
        ListNode oriPrevHead = prev;
        boolean removeCurrHead = false;
        while (head != null && head.next != null) {
            if( head.next.val == head.val) {
                head.next = head.next.next;
                removeCurrHead = true;
                continue;
            }
            if(removeCurrHead) {
                head = head.next;
                prev.next = head;
                removeCurrHead = false;
                continue;
            }
            head = head.next;
            prev = prev.next;
        }
        if(removeCurrHead) {
            head = head.next;
            prev.next = head;
        }
        return oriPrevHead.next;
    }
}
// @lc code=end
/*
 * 166/166 cases passed (0 ms)
 * Your runtime beats 100 % of java submissions
 * Your memory usage beats 21.54 % of java submissions (38.7 MB)
 */

