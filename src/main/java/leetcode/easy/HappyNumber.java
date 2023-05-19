package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while(n != 1) {
            String temp = Integer.toString(n);
            int result = 0;
            for (int i=0; i<temp.length(); i++) {
                int a = Character.getNumericValue(temp.charAt(i));

                result += a*a;
            }
            n = result;
            if (set.contains(n)) {
                break;
            }
            set.add(n);
        }
        return n==1;
    }

}
