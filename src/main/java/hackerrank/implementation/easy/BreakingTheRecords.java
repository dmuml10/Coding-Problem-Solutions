package hackerrank.implementation.easy;

public class BreakingTheRecords {

    static int[] breakingRecords(int[] scores) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min_change = 0;
        int max_change = 0;
        for (int i=0; i<scores.length; i++) {
            if (max == Integer.MIN_VALUE) {
                min = scores[i];
                max = scores[i];
            } else {
                if (scores[i] < min) {
                    min = scores[i];
                    min_change++;
                }
                if (scores[i] > max) {
                    max = scores[i];
                    max_change++;
                }
            }
        }
        System.out.println(max_change + " " + min_change);
        return new int[]{max_change, min_change};
    }

}
