package com.aderya.leetcode;

//LeetCode 1290 Convert Binary Number in a Linked List to Integer
public class Solution_1290 {

    public static void main(String[] args) {

        ListNode tail = new ListNode(1);
        ListNode third = new ListNode(0, tail);
        ListNode second = new ListNode(1, third);
        ListNode head = new ListNode(4, second); // 4-> 1-> 0-> 1

        Solution_1290 sol = new Solution_1290();
        System.out.println(sol.getDecimalValue(head));

    }

    public int getDecimalValue(ListNode head) {
        int sum=0;
        while(head != null){
            sum = sum*2; //if digit is available then multiply it with 2.
            sum += head.val;
            head = head.next;
        }
        return sum;
    }

}
