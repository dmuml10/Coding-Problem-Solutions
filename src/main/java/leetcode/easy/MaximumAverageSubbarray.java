package leetcode.easy;

public class MaximumAverageSubbarray {
        public double findMaxAverage(int[] nums, int k) {
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i=0; i<k; i++) {
                sum+=nums[i];
            }
            if (sum> max) {
                max = sum;
            }
            int j = 0;
            for (int i=k; i<nums.length; i++) {
                sum+=nums[i];
                sum-=nums[j];
                j++;
                if (sum > max) {
                    max = sum;
                }
            }
            return (double)max/k;
        }
}
