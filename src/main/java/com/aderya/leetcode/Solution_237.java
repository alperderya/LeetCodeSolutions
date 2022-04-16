package com.aderya.leetcode;

//LeetCode - 237. Delete Node in a Linked List
public class Solution_237 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(6);
        ListNode third = new ListNode(5, tail);
        ListNode x = new ListNode(4, third);

        ListNode y = new ListNode(3, x);
        ListNode second = new ListNode(2,y);
        ListNode head = new ListNode(1, second);
        Solution_237 sol = new Solution_237();
        System.out.println(head);
        sol.deleteNode(second);
        System.out.println(head);

    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}