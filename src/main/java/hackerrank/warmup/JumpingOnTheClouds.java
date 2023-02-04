package hackerrank.warmup;

import java.util.List;

public class JumpingOnTheClouds {

    public static int jumpingOnClouds(List<Integer> c) {
        int count = 0;
        for (int i=0; i<c.size()-1; i++) {
            if (i+2 < c.size() && c.get(i + 2) == 0) {
                i++;
            }
            count ++;
        }
        return count;
    }

}
