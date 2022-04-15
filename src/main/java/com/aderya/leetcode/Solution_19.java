package com.aderya.leetcode;


//LeetCode - 19. Remove Nth Node From End of List
public class Solution_19 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(2);
        ListNode third = new ListNode(1, tail);
        ListNode x = new ListNode(1, third);

        ListNode y = new ListNode(3, x);
        ListNode second = new ListNode(2, y);
        ListNode head = new ListNode(1, second);
        Solution_19 sol = new Solution_19();
        System.out.println(sol.removeNthFromEnd(third, 2));

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode result = head;
        ListNode fast = head;
        ListNode slow = head;

        while(n-- != 0){
            fast = fast.next;
        }

        if(fast==null) return result.next;

        while(fast!=null){
            head = slow;
            fast = fast.next;
            slow = slow.next;
        }
        head.next = slow.next;
        return result;
    }
}