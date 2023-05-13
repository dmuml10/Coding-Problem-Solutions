package leetcode.easy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximizeMinimums {

    public static void main(String[] args) {
        System.out.println("aaa");
    }

    public int arrayPairSum(int[] nums) {
        var list = Arrays.stream(nums).boxed().sorted().toList();
        return IntStream.range(0, list.size())
                .filter(i -> i % 2 == 0)
                .mapToObj(list::get).reduce(0, Integer::sum);
    }

}
