package com.aderya.leetcode;

//LeetCode - 83. Remove Duplicates from Sorted List
public class Solution_83 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(4);
        ListNode third = new ListNode(3, tail);
        ListNode x = new ListNode(3, third);

        ListNode y = new ListNode(1, x);
        ListNode second = new ListNode(1,y);
        ListNode head = new ListNode(1, second);
        Solution_83 sol = new Solution_83();
        System.out.println(sol.deleteDuplicates(head));

    }
    public ListNode deleteDuplicates(ListNode head) {

        ListNode result = head;
        while(head != null && head.next != null){
            if(head.val == head.next.val){
                head.next = head.next.next;
            }else{
                head = head.next;
            }
        }
        return result;
    }
}