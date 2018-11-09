package algorithms.implementation.easy;

public class Kangaroo {

    static String kangaroo(int x1, int v1, int x2, int v2) {

        double result = (double)(x2 - x1)/(v1 - v2);
        int intResult = (int)result;
        if (result > 0 && Math.abs(result - intResult) == 0) {
            return "YES";
        } else {
            return "NO";
        }

    }

}
