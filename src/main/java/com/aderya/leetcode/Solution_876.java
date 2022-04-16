package com.aderya.leetcode;

//LeetCode - 876. Middle of the Linked List
public class Solution_876 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(6);
        ListNode third = new ListNode(5, tail);
        ListNode x = new ListNode(4, third);

        ListNode y = new ListNode(3, x);
        ListNode second = new ListNode(2, y);
        ListNode head = new ListNode(1, second);
        Solution_876 sol = new Solution_876();
        System.out.println(sol.middleNode(head));

    }
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}