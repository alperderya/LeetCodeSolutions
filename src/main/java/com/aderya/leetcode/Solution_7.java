package com.aderya.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//LeetCode 7 Reverse Integer
public class Solution_7 {

    public static void main(String[] args) {
        int x = -214748364; //-2147483648 Integer.MAX_VALUE->2147483647
        Solution_7 sol = new Solution_7();
        System.out.println(sol.reverse(x));
        System.out.println(sol.reverse_leetCodeSolution(x));
        System.out.println(sol.reverse_mostLikedSolution(x));
    }

    public int reverse(int x) {
        char sign = '+';
        if(x<0){
            sign = '-';
            x = -x;
        }
        List<Integer> list = new ArrayList<>();

        recursiveRevers(x, list);

        StringBuilder builder = new StringBuilder();
        builder.append(sign);
        list.forEach(builder::append);

        try{
            return Integer.parseInt(builder.toString());
        }catch(Exception e){
            return 0;
        }
    }

    private void recursiveRevers(int x, List<Integer> digitList) {
        int lastDigit = x%10;
        digitList.add(lastDigit);
        if((x/10)==0){
            return;
        }
        recursiveRevers(x/10,digitList);

    }

    public int reverse_leetCodeSolution(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
        }
        return rev;
    }

    public int reverse_mostLikedSolution(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }


}
