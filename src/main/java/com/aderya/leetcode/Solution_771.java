package com.aderya.leetcode;

import java.util.HashSet;
import java.util.Set;

//LeetCode 771 Jewels and Stones
public class Solution_771 {

    public static void main(String[] args) {
        String jewels = "b";
        String stones = "aAAbbbb";
        Solution_771 sol = new Solution_771();
        System.out.println(sol.numJewelsInStones(jewels, stones));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<Character> charSet = new HashSet<>();
        for(char c:jewels.toCharArray()){
            charSet.add(c);
        }

        for(char c:stones.toCharArray()){
            if(charSet.contains(c)) count++;
        }

        return count;
    }

}
