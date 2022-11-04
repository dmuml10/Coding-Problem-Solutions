package hackerrank.warmup;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleArraySum {
    /*
     * Simple Array Sum
     * Complete the simpleArraySum function below.
     */
    static int simpleArraySum(int[] ar) {
        int result = 0;
        for (int i=0; i<ar.length; i++) {
            result += ar[i];
        }
        return result;
    }

}
