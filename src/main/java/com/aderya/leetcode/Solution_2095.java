package com.aderya.leetcode;

//LeetCode - 2095. Delete the Middle Node of a Linked List
public class Solution_2095 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(6);
        ListNode third = new ListNode(5, tail);
        ListNode x = new ListNode(4, third);

        ListNode y = new ListNode(3, x);
        ListNode second = new ListNode(2, y);
        ListNode head = new ListNode(1, second);
        Solution_2095 sol = new Solution_2095();
        System.out.println(sol.deleteMiddle(head));

    }
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null){
            return null;
        }
        ListNode result = head;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null ){
            head = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        head.next = slow.next;

        return result;
    }
}