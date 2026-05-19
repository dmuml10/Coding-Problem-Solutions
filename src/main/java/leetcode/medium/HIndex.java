package leetcode.medium;

import java.util.Arrays;

public class HIndex {

    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;
        for (int i=0;i<citations.length;i++) {
            int value = citations[i];
            if (value > citations.length - i) {
                value = citations.length - i;
            }
            if (hIndex< value) {
                hIndex = value;
            }
        }
        return hIndex;
    }

    public static void main(String[] args) {
        HIndex hIndex = new HIndex();
        System.out.println(hIndex.hIndex(new int[]{11, 10}));
    }

}
