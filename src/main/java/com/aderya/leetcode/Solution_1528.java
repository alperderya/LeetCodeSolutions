package com.aderya.leetcode;

//LeetCode 1528 Shuffle String
public class Solution_1528 {

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        Solution_1528 sol = new Solution_1528();
        System.out.println(sol.restoreString(s, indices));
    }

    public String restoreString(String s, int[] indices) {
        char[] newString = new char[s.length()];
        for(int i=0; i<s.length(); i++){
            newString[indices[i]] = s.charAt(i);
        }
        return String.valueOf(newString);
    }
}
