package leetcode.medium;

import java.util.HashMap;

public class ContiguousArray {

    public int findMaxLength(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];

        // Transform 0s to -1s
        for (int i = 0; i < n; i++) {
            nums[i] = (nums[i] == 0) ? -1 : 1;
        }

        // Build prefix sum array
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
        }

        // Map to store first occurrence of a particular prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;

        for (int i = 0; i <= n; i++) {
            int sum = prefixSum[i];
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

}
