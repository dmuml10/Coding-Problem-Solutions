package algorithms.implementation.medium;

import java.util.ArrayList;
import java.util.List;

public class BiggerIsGreater {

    static String biggerIsGreater(String w) {
        List<String> variations = new ArrayList<>();
        variations = rec(variations, "", w);

        int original = calculateTotal(w);
        int min = Integer.MAX_VALUE;
        String result = "no answer";
        for (int i=0; i <variations.size(); i++) {
            int temp = calculateTotal(variations.get(i));
            if (temp > original && temp < min) {
                min = temp;
                result = variations.get(i);
            }
        }
        return result;
    }

    static List<String> rec(List<String> list, String r, String w) {
        if (w.length() == 1) {
            list.add(r + w);
            return list;
        }
        for (int i=0; i<w.length(); i++) {
            StringBuilder sb = new StringBuilder(w);
            sb.deleteCharAt(i);
            rec(list,r + w.charAt(i), sb.toString());
        }

        return list;
    }

    static int calculateTotal(String w) {
        int result = 0;
        for (int i=0; i<w.length(); i++) {
            result += ((int)w.charAt(i) - 96) * Math.pow(10, w.length() - 1 - i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(biggerIsGreater("abcd"));
    }

}
