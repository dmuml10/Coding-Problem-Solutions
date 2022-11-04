package hackerrank.implementation.easy;

import java.math.BigInteger;

public class ExtraLongFactorials {
    // Extra Long Factorials
    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        BigInteger result = BigInteger.valueOf(1);
        BigInteger counter = BigInteger.valueOf(n);
        for (int i=1; i<=n; i++) {
            result = result.multiply(counter);
            counter = counter.subtract(BigInteger.valueOf(1));
        }
        System.out.println(result);
    }

}
