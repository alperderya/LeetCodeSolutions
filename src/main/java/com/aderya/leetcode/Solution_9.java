package com.aderya.leetcode;

//LeetCode - 9 Palindrome Number
public class Solution_9 {
    public static void main(String[] args) {
        int x = 123321;
        Solution_9 sol = new Solution_9();
        System.out.println(sol.isPalindrome(x));

    }

    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int copy_x = x;
        int result = 0;
        while(copy_x != 0) {
            result = result * 10 + copy_x % 10;
            copy_x /= 10;
        }
        return result==x;
     }
}
