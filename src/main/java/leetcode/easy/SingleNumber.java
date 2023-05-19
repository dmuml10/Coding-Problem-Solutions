package leetcode.easy;

import java.util.Arrays;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        Arrays.sort(nums);

        if (nums.length == 1) {
            return nums[0];
        }

        for (int i=0; i<nums.length-1;) {
            if (nums[i] != nums[i+1]) {
                return nums[i];
            }
            i+=2;
        }
        if (nums[nums.length-1] != nums[nums.length-2]) {
            return nums[nums.length-1];
        }

        return -1;
    }

}
