package leetcode.easy;

import java.util.Arrays;

public class RomanToInteger {

    public int romanToInt(String s) {
        int sum = 0;
        for (int i=0; i<s.length(); i++) {
            var curValue = getValue(s.charAt(i));
            if (i+1 < s.length() && curValue < getValue(s.charAt(i+1))) {
                sum -= curValue;
            } else {
                sum+= curValue;
            }
        }
        return sum;
    }
    private int getValue(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }

    public static void main(String[] args) {
        String[] arr = {"abc", "abcd", "ab"};

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr)); // Output: [ab, abc, abcd]
    }

}