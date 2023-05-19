package leetcode.easy;

public class NumberTo1Bits {

    public int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        int count = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '1') {
                count ++;
            }
        }
        return count;
    }

    public int hammingWeight2(int n) {
        int count = 1;
        while(n >= 1) {
            if (n % 2 == 1) {
                count++;
            }
            n /=2;
        }
        return count;
    }



}
