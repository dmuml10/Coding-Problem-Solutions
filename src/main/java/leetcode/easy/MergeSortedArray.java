package leetcode.easy;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m - 1;
        int ptr2 = n - 1;
        int ptr = m + n - 1;

        while (ptr1 >= 0 && ptr2 >= 0) {
            if (nums1[ptr1] > nums2[ptr2]) {
                nums1[ptr] = nums1[ptr1];
                ptr1--;
            } else {
                nums1[ptr] = nums2[ptr2];
                ptr2--;
            }
            ptr--;
        }

        while (ptr2 >= 0) {
            nums1[ptr] = nums2[ptr2];
            ptr2--;
            ptr--;
        }
    }

    public static void main(String[] args) {
//        int[] a = new int[] {1,2,3,0,0,0};
//        int[] b = new int[] {2,5,6};

        int[] a = new int[] {4,5,6,0,0,0};
        int[] b = new int[] {1,2,3};

        MergeSortedArray m = new MergeSortedArray();
        m.merge(a, 3, b, 3);

        printArray(a);
    }

    private static void printArray(int[] a) {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i] +", ");
        }
    }

}
