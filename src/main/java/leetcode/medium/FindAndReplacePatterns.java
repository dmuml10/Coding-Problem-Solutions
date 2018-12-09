package leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAndReplacePatterns {

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int p = patter(pattern);

        List<Integer> list = new ArrayList<>();
        for (String s: words) {
            list.add(patter(s));
        }

        List<String> result = new ArrayList<>();
        for (int i=0; i<list.size(); i++) {
            if (p == list.get(i)){
                result.add(words[i]);
            }
        }
        return result;
    }

    private int patter(String word) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        int x = 0;
        String result = "";
        for (int i=0 ;i<sorted.length()-1; i++) {
            result += x;
            if (sorted.charAt(i) != sorted.charAt(i+1)) {
                x++;
            }
        }
        result += x;
        System.out.println(sorted + " " +result);
        return Integer.parseInt(result);
    }

}
