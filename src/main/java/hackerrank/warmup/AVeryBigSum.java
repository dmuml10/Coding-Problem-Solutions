package hackerrank.warmup;

public class AVeryBigSum {
    //A very big sum
    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum = 0l;
        for (int i=0; i<ar.length; i++) {
            sum += ar[i];
        }
        return sum;
    }
}
