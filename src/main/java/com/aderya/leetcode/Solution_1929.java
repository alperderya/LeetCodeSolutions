package com.aderya.leetcode;

import java.util.Arrays;

//LeetCode 1929. Concatenation of Array
public class Solution_1929 {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,2,1,3};
        Solution_1929 sol = new Solution_1929();
        Arrays.stream(sol.getConcatenation(nums)).forEach(System.out::print);
        Arrays.stream(sol.getConcatenation_betterSolution(nums)).forEach(System.out::print);
    }

    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
        int[] ans = new int[numsLength*2];
        for(int i=0; i<ans.length; i++){
            ans[i] = nums[i%numsLength];
        }
        return ans;
    }
    public int[] getConcatenation_betterSolution(int[] nums) {
        int[] res = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            res[i] = res[i + nums.length] = nums[i];
        }
        return res;
    }
}
