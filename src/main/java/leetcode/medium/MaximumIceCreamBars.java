package leetcode.medium;

import java.util.Arrays;

class MaximumIceCreamBars {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;
        for (int i=0; i<costs.length; i++) {
            coins -= costs[i];
            if (coins < 0) {
                break;
            } else if (coins == 0) {
                count ++;
                break;
            } else {
                count ++;
            }
        }
        return count;
    }
}
