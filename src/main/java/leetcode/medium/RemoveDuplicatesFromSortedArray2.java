package leetcode.medium;

public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int index1 = 0;
        int index2 = 0;
        int count = 0;
        while (index2 < nums.length) {
            if (nums[index1] == nums[index2]) {
                count++;
            } else {
                count = 1;
                index1 = index2;
            }

            if (count >= 3) {
                nums[index2] = Integer.MAX_VALUE;
            }

            index2++;
        }


        int write = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != Integer.MAX_VALUE) {
                nums[write++] = nums[i];
            }
        }

        return write;
    }
}
