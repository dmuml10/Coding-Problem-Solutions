package leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortCharactersByFrequency {

  public String frequencySort(String s) {
    Map<Integer, StringBuilder> map = new HashMap<>();
    for (int i=0; i<s.length(); i++) {
      int v = (int)s.charAt(i);
      if (map.containsKey(v)) {
        map.get(v).append(s.charAt(i));
      } else {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(i));
        map.put(v, sb);
      }
    }


    List<StringBuilder> list = new ArrayList<>(map.values());
    Collections.sort(list,Collections.reverseOrder(Comparator.comparing(StringBuilder::length)));

    String result = list.stream().collect(Collectors.joining());

    return result;
  }

}
