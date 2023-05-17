package leetcode.easy;

public class sqrt {

    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int sqrt = 1;
        for (long i=1l; i<=(x/2)+1; i++) {
            if (i*i == x) {
                sqrt = (int)i;
                break;
            } else if (i*i > x) {
                sqrt = (int)--i;
                break;
            }
        }
        return sqrt;
    }

}
