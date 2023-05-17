package leetcode.easy;

public class PowerOfThree {

    public boolean isPowerOfThree(int a) {
        if (a == 1) {
            return true;
        }
        double n = a;
        while(n > 1) {
            n = n/3;
            if (n == 1) {
                return true;
            }
            if (n < 1) {
                return false;
            }
        }
        return false;
    }

}
