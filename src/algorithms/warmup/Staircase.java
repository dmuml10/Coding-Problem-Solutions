package algorithms.warmup;

import java.util.Scanner;

public class Staircase {
    //Staircase
    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i=1; i<=n; i++) {
            for(int j=0; j<n-i; j++) {
                System.out.print(" ");
            }
            for(int y=0; y<i; y++) {
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }

}
