package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        int a = 0;
        int b = 0;
        while(a < nums1.length && b < nums2.length) {
            if (nums1[a] == nums2[b]) {
                result.add(nums1[a]);
                a++;
                b++;
            } else if (nums1[a] > nums2[b]) {
                b++;
            } else {
                a++;
            }
        }


        int[] array = new int[result.size()];
        for (int i=0; i<result.size(); i++) {
            array[i] = result.get(i);
        }

        return array;
    }

}