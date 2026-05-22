package leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandomDuplicatesAllowed {

    class RandomizedCollection {

        Map<Integer, Integer> map;
        List<Integer> list;
        Random rand;
        public RandomizedCollection() {
            map = new HashMap<>();
            list = new ArrayList<>();
            rand = new Random();
        }

        public boolean insert(int val) {
            list.add(val);
            if (map.containsKey(val)) {
                map.put(val, map.getOrDefault(val, 0) + 1);
                return false;
            } else {
                map.put(val, 1);
                return true;
            }

        }


        public boolean remove(int val) {
                if (map.containsKey(val)) {
                    int count = map.get(val);
                    if (count == 1) {
                        map.remove(val);
                    } else {
                        map.put(val, count-1);
                    }
                    list.remove(Integer.valueOf(val));
                    return true;
                } else {
                    return false;
                }
        }

        public int getRandom() {
            return list.get((rand.nextInt(list.size())));
        }
    }

}
