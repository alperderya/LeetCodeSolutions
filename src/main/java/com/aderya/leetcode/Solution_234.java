package com.aderya.leetcode;

//LeetCode 234 Palindrome Linked List
public class Solution_234 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(1);
        //ListNode third = new ListNode(2, tail);
        ListNode second = new ListNode(2, tail);
        ListNode head = new ListNode(1, second);
        Solution_234 sol = new Solution_234();
        System.out.println(sol.isPalindrome(head));

    }

    //It is the solution which has the most votes in LeetCode discussion platform.
    //see the original answer: https://leetcode.com/problems/palindrome-linked-list/discuss/64501/Java-easy-to-understand
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) { // odd nodes: let right half smaller
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;

        while (slow != null) {
            if (fast.val != slow.val) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }

}



