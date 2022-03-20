package com.aderya.leetcode;

//LeetCode 6 Zigzag Conversion
public class Solution_6 {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 1;
        Solution_6 sol = new Solution_6();
        System.out.println(sol.convert(s, numRows));
    }

    public String convert(String s, int numRows) {

        if(numRows <= 1) return s;

        int modVal = numRows*2 - 2;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++)
            sb[i] = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            int modResult = i%modVal;
            if(modResult<=numRows-1){
                sb[modResult].append(s.charAt(i));
            }else{
                sb[modVal-modResult].append(s.charAt(i));
            }
        }

        StringBuilder res = new StringBuilder();
        for (StringBuilder k : sb) res.append(k);
        return res.toString();
    }

}
