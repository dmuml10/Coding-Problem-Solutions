package hackerrank.implementation.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {

    public static int substring(String s) {
        char[] chars = s.toCharArray();

        int L = 0; int R = 0;

        Map<Character, Integer> map = new HashMap<>();


        int max = 0;
        while (R < chars.length) {
            map.put(chars[R], map.getOrDefault(chars[R], 0) + 1);
            while(map.size() > 2) {
                map.put(chars[L], map.get(chars[L]) - 1);
                if (map.get(chars[L]) == 0) {
                    map.remove(chars[L]);
                }
                L++;
            }

            max = Math.max(max, R - L + 1);
            R++;
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(substring("eceba"));
        System.out.println(substring("ccaabbb"));
    }

}
