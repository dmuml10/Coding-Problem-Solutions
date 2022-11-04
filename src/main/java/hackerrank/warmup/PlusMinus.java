package hackerrank.warmup;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PlusMinus {

    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i=0; i<arr.length ; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                zero ++;
            }
        }

        double p = (double)positive/arr.length;
        double n = (double)negative/arr.length;
        double z = (double)zero/arr.length;

        Double pa = BigDecimal.valueOf(p)
                .setScale(6, RoundingMode.HALF_UP)
                .doubleValue();
        Double na = BigDecimal.valueOf(n)
                .setScale(6, RoundingMode.HALF_UP)
                .doubleValue();
        Double za = BigDecimal.valueOf(z)
                .setScale(6, RoundingMode.HALF_UP)
                .doubleValue();

        System.out.println(pa);
        System.out.println(na);
        System.out.println(za);

    }

}
