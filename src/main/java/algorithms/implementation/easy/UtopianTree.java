package algorithms.implementation.easy;

public class UtopianTree {

    static int utopianTree(int n) {
        int result = 1;
        for (int i=1; i<=n; i++) {
            if (i % 2 == 1) {
                result *= 2;
            } else {
                result ++;
            }
        }
        return result;
    }

}
