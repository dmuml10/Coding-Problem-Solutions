package leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabel {

    public List<Integer> partitionLabels(String S) {
        Map<Character, Integer> maps = new HashMap<>();
        for (int i=0 ; i<S.length(); i++) {
            maps.put(S.charAt(i), i);
        }


        List<Integer> result = new ArrayList<>();
        for (int i=0; i<S.length();) {
            int max = maps.get(S.charAt(i));
            for (int j=i; j<max; j++) {
                if (maps.get(S.charAt(j)) > max) {
                    max = maps.get(S.charAt(j));
                }
            }

            result.add(max + 1 - i);
            i = max + 1;
        }
        return result;
    }

}
