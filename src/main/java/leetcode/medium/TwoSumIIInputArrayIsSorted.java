package leetcode.medium;

public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int[] result = new int[2];
        for (int i=0; i<numbers.length; i++) {
            int sum = numbers[start]+numbers[end];
            if (sum == target) {
                result[0] = start+1;
                result[1] = end+1;
                return result;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return null;
    }

}
