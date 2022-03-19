package com.aderya.leetcode;

//LeetCode 2011. Final Value of Variable After Performing Operations
public class Solution_2011 {

    public static void main(String[] args) {
        Solution_2011 solution = new Solution_2011();
        String[] operations = new String[]{"--X","X++","X++"};
        System.out.println(solution.finalValueAfterOperations(operations));
    }

    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String op:operations){
            if(op.contains("+")){
                result++;
            }else result--;
        }
        return result;
    }
}

