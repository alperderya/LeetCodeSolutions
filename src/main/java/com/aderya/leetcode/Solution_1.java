package com.aderya.leetcode;

import java.util.*;

//LeetCode 1 Two Sum
public class Solution_1 {

    public static void main(String[] args) {
        Solution_1 solution = new Solution_1();
        int[] nums = {2,7,11,15,18,34,35,36,37,38,39,40};
        int target = 79;

        int[] result = solution.twoSum(nums, target);
        System.out.println("["+result[0]+","+result[1]+"]");

        result = solution.twoSumAlternativeSolution(nums, target);
        System.out.println("["+result[0]+","+result[1]+"]");
    }

    public int[] twoSum(int[] nums, int target) {
        for(int first=0; first<nums.length; first++){
            for(int second=first+1; second<nums.length; second++){
                if(nums[first] + nums[second] == target){
                    return new int[]{first, second};
                }
            }
        }
        return null;

    }

    public int[] twoSumAlternativeSolution(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(numMap.containsKey(target - nums[i])){
                return new int[]{numMap.get(target - nums[i]), i};
            }

            numMap.put(nums[i], i);

        }
        return null;

    }
}
