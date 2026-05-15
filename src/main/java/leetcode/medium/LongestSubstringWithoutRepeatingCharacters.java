package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> charMap = new HashMap();
        int size = 0;
        int maxSize = 0;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (charMap.containsKey(c)) {
                int index = charMap.get(c);
                charMap.clear();
                i = index;
                if (maxSize<size) {
                    maxSize = size;
                }
                size = 0;
            } else {
                charMap.put(c, i);
                size++;
            }
        }
        if (maxSize<size) {
            maxSize = size;
        }
        return maxSize;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("dvdf"));
    }

}
