package Leetcode.algorithms;

/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
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
    public boolean isPalindrome(ListNode head) {
        if ( head == null || head.next == null) {
            return true;
        }
        // find midpoint of List
        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        while (ptr2.next != null && ptr2.next.next != null) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next.next;
        }
        //Reverse second half of the list
        ListNode runner1 = head;
        ListNode runner2 = reverseList(ptr1.next);
        boolean result = true;

        while(result && runner2 != null) {
            if ( runner1.val != runner2.val) {
                result = false;
                break;
            }
            runner1 = runner1.next;
            runner2 = runner2.next;
        }

        reverseList(ptr2.next);

        return result;
        
    }

    ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
// @lc code=end
/*
 * 85/85 cases passed (5 ms)
 * Your runtime beats 76.99 % of java submissions
 * Your memory usage beats 86.48 % of java submissions (48.8 MB)
 */

