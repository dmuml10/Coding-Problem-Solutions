package leetcode.easy;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int index = digits.length-1;
        while(index >= 0 && digits[index]==9) {
            digits[index] = 0;
            index--;
        }
        if (index == -1) {
            digits = new int[digits.length+1];
            digits[0] = 1;
        } else {
            digits[index]++;
        }
        return digits;
    }

}
