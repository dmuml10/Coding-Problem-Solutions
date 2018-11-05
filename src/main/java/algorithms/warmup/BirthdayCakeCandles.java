package algorithms.warmup;

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int[] ar) {

        int count = 0;
        int max = 0;
        for (int i=0; i<ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                count = 0;
            }
            if (ar[i] == max) {
                count ++;
            }
        }

        return count;
    }

}
