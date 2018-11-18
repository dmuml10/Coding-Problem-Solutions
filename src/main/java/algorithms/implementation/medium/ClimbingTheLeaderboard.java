package algorithms.implementation.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        int lastScore = -1;
        int index = 0;
        for (int i=0; i<scores.length; i++) {
            int currScore = scores[i];
            if (currScore != lastScore) {
                scores[index] = currScore;
                index++;
            }
            lastScore = currScore;
        }

        int i = index - 1;
        List<Integer> result = new ArrayList<>();
        for (int aliceScore : alice) {
            while (i >= 0) {
                if (aliceScore < scores[i]) {
                    result.add(i+2);
                    break;
                }
                i--;
            }
            if (i < 0) {
                result.add(1);
            }
        }

        return result.stream().mapToInt(x->x).toArray();
    }

}