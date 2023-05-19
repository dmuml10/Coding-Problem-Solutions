package leetcode.easy;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        int expected= n*(n+1)/2;
        return expected - sum;
    }

}
