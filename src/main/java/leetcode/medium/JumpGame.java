package leetcode.medium;

public class JumpGame {

    public boolean canJump(int[] nums) {
        int index = nums.length - 1;
        int currentIndex = index;
        int lastIndex = index;
        while (index >= 0) {
            if (nums[index]+index >= lastIndex) {
                currentIndex = index;
            }
            index--;
            if (currentIndex == 0 ) {
                return true;
            } else if (index< 0) {
                return false;
            }
        }

        return false;
    }

}
