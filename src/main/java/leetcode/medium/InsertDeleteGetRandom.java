package leetcode.medium;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class InsertDeleteGetRandom {

    class RandomizedSet {

        private Set<Integer> set;
        Random rand;

        public RandomizedSet() {
            set = new HashSet<>();
            rand = new Random();
        }

        public boolean insert(int val) {
            return set.add(val);
        }

        public boolean remove(int val) {
            return set.remove(val);
        }

        public int getRandom() {
            return set.stream().toList().get(rand.nextInt(set.size()));
        }
    }

}
