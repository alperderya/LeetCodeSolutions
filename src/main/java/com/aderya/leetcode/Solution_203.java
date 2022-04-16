package com.aderya.leetcode;

//LeetCode - 203. Remove Linked List Elements
public class Solution_203 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(1);
        ListNode third = new ListNode(1, tail);
        ListNode x = new ListNode(3, third);

        ListNode y = new ListNode(1, x);
        ListNode second = new ListNode(1,y);
        ListNode head = new ListNode(1, second);
        Solution_203 sol = new Solution_203();
        System.out.println(sol.removeElements(head,1));

    }
    public ListNode removeElements(ListNode head, int val) {

        ListNode newNode = new ListNode(-1, head);
        ListNode result = newNode;

        while(newNode != null && newNode.next != null){
            if(newNode.next.val == val){
                newNode.next = newNode.next.next;
            }else{
                newNode = newNode.next;
            }

        }
        return result.next;
    }
}