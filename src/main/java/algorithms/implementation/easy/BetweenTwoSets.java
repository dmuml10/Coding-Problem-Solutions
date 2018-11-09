package algorithms.implementation.easy;

import java.util.ArrayList;
import java.util.List;

public class BetweenTwoSets {

    static int getTotalX(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();

        int max = 0;
        for (int i=0; i<b.length; i++) {
            if (max < b[i]) max = b[i];
        }

        for (int i=1; i<=max; i++) {
            boolean include = true;
            for (int j=0; j<b.length; j++) {
                if (b[j] % i != 0) {
                    include = false;
                }
            }
            if (include) {
                list.add(i);
            }
        }

        int count = 0;
        for (int i : list) {
            boolean include = true;
            for (int j=0; j<a.length; j++) {
                if (i < a[j] || i % a[j] !=0) {
                    include = false;
                }
            }
            if (include) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        int[] a = new int[]{2, 4};
        int[] b = new int[]{16, 32, 96};
        System.out.println(getTotalX(a, b));

        int[] a1 = new int[]{1};
        int[] b1 = new int[]{100};
        System.out.println(getTotalX(a1, b1));
    }
}
