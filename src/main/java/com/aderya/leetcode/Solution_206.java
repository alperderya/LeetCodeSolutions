package com.aderya.leetcode;

//LeetCode 206 Reverse Linked List
public class Solution_206 {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            if(next==null){
                return val+"";
            }else{
                return val+ " " + next;
            }
        }
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(4, null);
        ListNode third = new ListNode(3, tail);
        ListNode second = new ListNode(2, third);
        ListNode head = new ListNode(1, second);
        Solution_206 sol = new Solution_206();
        System.out.println(sol.reverseList(head));
        //System.out.println(sol.reverseListRecursive(head));
    }

    public ListNode reverseList(ListNode head) {
        ListNode reverseNode = null;
        while(head!=null){
            ListNode prev = head.next;
            head.next = reverseNode;
            reverseNode = head;
            head=prev;
        }

        return reverseNode;
    }

    private ListNode reverseListRecursive(ListNode head) {

        return recursiveReverse(head, null);

    }

    private ListNode recursiveReverse(ListNode head, ListNode newHead) {
        if(head==null){
            return newHead;
        }
        ListNode next = head.next;
        head.next = newHead;
        return recursiveReverse(next, head);
    }
}
