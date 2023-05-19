package leetcode.easy;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int li = nums.length-1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 0 && i < li) {
                shift(nums, i);
                li--;
                i--;
            }

        }
    }

    private void shift(int[] array, int index) {
        for (int i=index; i< array.length - 1; i++) {
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
    }

}
