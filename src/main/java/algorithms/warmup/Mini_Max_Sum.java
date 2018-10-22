package algorithms.warmup;

import java.util.Scanner;

public class Mini_Max_Sum {
    /*
        Mini-Max Sum
        Complete the miniMaxSum function below.
      */
    static void miniMaxSum(int[] arr) {
        long arraySum = 0l;
        for (int i=0; i<arr.length; i++) {
            arraySum += arr[i];
        }

        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            long sum = arraySum - arr[i];
            if (sum < min) min = sum;
            if (sum > max) max = sum;
        }

        System.out.println(min + " " + max);
    }

}
