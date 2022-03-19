package com.aderya.leetcode;

//LeetCode 1108 Defanging an IP Address
public class Solution_1108 {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        Solution_1108 sol = new Solution_1108();
        System.out.println(sol.defangIPaddr(address));
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
