package leetcode.easy;

public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int empty = 1000;
        int i = 0;
        int j = 1;
        while(j < nums.length) {
            if (nums[i] == nums[j]) {
                nums[j] = empty;
            } else {
                i++;
            }
            j++;

            while(i< nums.length && nums[i]== empty) {
                i++;
            }
        }

        int count = 0;
        for (int num : nums) {
            if (num != empty)
                count++;
        }
        return count;
    }

}
