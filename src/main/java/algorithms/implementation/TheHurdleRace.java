package algorithms.implementation;

public class TheHurdleRace {

    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int i=0; i<height.length; i++) {
            if (max < height[i]) {
                max = height[i];
            }
        }

        return max - k > 0 ? max - k : 0 ;
    }

}
