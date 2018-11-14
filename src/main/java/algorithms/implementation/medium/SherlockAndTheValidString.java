package algorithms.implementation.medium;

import java.util.*;

public class SherlockAndTheValidString {

  static String isValid(String s) {
    Map<Character, Integer> map = new HashMap<>();
    for (int i=0; i<s.length(); i++) {
      if (map.containsKey(s.charAt(i))) {
        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
      } else {
        map.put(s.charAt(i), 1);
      }
    }

    Map<Integer, Integer> data = new HashMap<>();
    for (Character key : map.keySet()) {
        if (data.containsKey(map.get(key))) {
          data.put(map.get(key), data.get(map.get(key)) + 1);
        } else {
          data.put(map.get(key), 1);
        }
    }

    if (data.keySet().size() > 2 || data.keySet().size() < 1) {
      return "NO";
    } else if (data.keySet().size() == 2) {
      List<Integer> list = new ArrayList<>(data.values());
      if (!(list.get(0) == 1 || list.get(1) == 1)) {
        return "NO";
      }
    }

    return "YES";
  }

}
