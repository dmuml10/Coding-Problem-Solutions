package leetcode.easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
        }

        int expected= n*(n+1)/2;
        return expected - sum;
    }

}
