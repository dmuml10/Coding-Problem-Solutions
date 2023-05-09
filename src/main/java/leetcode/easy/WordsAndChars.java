package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class WordsAndChars {

    public static int countCharacters(String[] words, String chars) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i=0; i<chars.length() ;i++) {
            map.put(chars.charAt(i), map.getOrDefault(chars.charAt(i), 0)+1);
        }

        int result = 0;
        for (int i=0; i<words.length; i++) {
            Map<Character, Integer> temp = new HashMap<>(map);
            result += words[i].length();
            for (int j=0; j<words[i].length(); j++) {
                if (!temp.containsKey(words[i].charAt(j))) {
                    result -= words[i].length();
                    break;
                }

                temp.put(words[i].charAt(j), temp.get(words[i].charAt(j))-1);
                if (temp.get(words[i].charAt(j)) <= 0) {
                    temp.remove(words[i].charAt(j));
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] arr = new String[]{"cat","bt","hat","tree"};
        String[] arr2 = new String[]{"hello","world","leetcode"};
        System.out.println(countCharacters(arr, "atach"));
        System.out.println(countCharacters(arr2, "welldonehoneyr"));
    }

}
