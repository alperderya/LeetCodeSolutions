package com.aderya.leetcode;

import java.util.List;

//LeetCode 2 Add Two Numbers
public class Solution_2 {

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
        ListNode third1 = new ListNode(3);
        ListNode second1 = new ListNode(4, third1);
        ListNode head1 = new ListNode(2, second1);

        ListNode third2 = new ListNode(4);
        ListNode second2 = new ListNode(6, third2);
        ListNode head2 = new ListNode(5, second2);

        Solution_2 main = new Solution_2();
        System.out.println(head1);
        System.out.println(head2);
        System.out.println(main.addTwoNumbers(head1, head2));

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum = 0;
        ListNode result = null;
        boolean hasCarry = false;
        boolean isL1Ended = false;
        boolean isL2Ended = false;
        while(!isL1Ended || !isL2Ended){
            sum=0;
            sum = l1.val + l2.val;
            if(hasCarry) sum +=1;
            hasCarry = false;
            if(sum>=10){
                sum = sum-10;
                hasCarry = true;
            }
            l1 = l1.next;
            if(l1 == null)
            {
                l1 = new ListNode(0);
                isL1Ended = true;
            }
            l2 = l2.next;
            if(l2 == null)
            {
                l2 = new ListNode(0);
                isL2Ended = true;
            }
            ListNode ln = new ListNode(sum);
            if(result == null) {
                result = ln;
            }else{
                ln.next = result;
                result = ln;
            }

        }

        if(hasCarry){
            result = new ListNode(1, result);
        }
        return reverse(result);
    }

    private ListNode reverse(ListNode head) {
        ListNode reverse = null;
        while(head != null){
            ListNode copy = head.next;
            head.next = reverse;
            reverse = head;
            head = copy;
        }
        return reverse;
    }
}
