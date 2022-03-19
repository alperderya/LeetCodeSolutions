package com.aderya.leetcode;

//LeetCode Maximum Number of Words Found in Sentences Problem Solution 2114
public class Solution_2114 {

    public static void main(String[] args) {
        String[] sentences = new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        Solution_2114 sol = new Solution_2114();
        System.out.println(sol.mostWordsFound(sentences));
    }

    public int mostWordsFound(String[] sentences) {
        int maxValue = -1;
        for(String s:sentences){
            int numberOfWords = s.split(" ").length;
            if(numberOfWords>maxValue) maxValue=numberOfWords;
        }
        return maxValue;
    }
}
