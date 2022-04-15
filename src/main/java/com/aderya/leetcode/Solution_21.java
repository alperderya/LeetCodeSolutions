package com.aderya.leetcode;

import org.w3c.dom.Node;

//LeetCode - 21. Merge Two Sorted Lists
public class Solution_21 {
    public static void main(String[] args) {
        ListNode tail = new ListNode(6);
        ListNode third = new ListNode(2, tail);
        ListNode x = new ListNode(1, third);

        ListNode y = new ListNode(3);
        ListNode second = new ListNode(2, y);
        ListNode head = new ListNode(1, second);
        Solution_21 sol = new Solution_21();
        System.out.println(sol.mergeTwoLists(x, head));

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mySortedListNode = new ListNode(0);
        ListNode headOfSortedList = mySortedListNode;

        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                mySortedListNode.next = list1;
                list1 = list1.next;
            }else{
                mySortedListNode.next = list2;
                list2 = list2.next;
            }
            mySortedListNode = mySortedListNode.next;
        }
        if(list1==null){
            mySortedListNode.next = list2;
        }else{
            mySortedListNode.next = list1;
        }

        return headOfSortedList.next;
    }
}