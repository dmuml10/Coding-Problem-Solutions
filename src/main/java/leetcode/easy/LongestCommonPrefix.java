package leetcode.easy;

import java.util.Arrays;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String prefix = "";
        if (strs.length > 0) {
            var first = strs[0];
            var last = strs[strs.length - 1];

            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != last.charAt(i)) {
                    return prefix;
                }
                prefix += first.charAt(i);
            }
        }
        return prefix;

    }

}