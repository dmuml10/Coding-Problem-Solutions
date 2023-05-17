package leetcode.medium;

import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache2 extends LinkedHashMap<Integer, Integer> {
    private final int capacity;

    public LRUCache2(int capacity) {
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    public Integer get(Integer key) {
        Integer value = super.get(key);
        if (value != null) return value;
        return -1;
    }

    public static void main(String[] args) {
        LRUCache2 cache = new LRUCache2(3);
        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);
        System.out.println(cache); // Output: {1=One, 2=Two, 3=Three}
        cache.put(4, 4); // Adding a new element will evict the least recently used element
        System.out.println(cache); // Output: {2=Two, 3=Three, 4=Four}
        cache.get(2); // Accessing an existing element will make it the most recently used
        System.out.println(cache); // Output: {3=Three, 4=Four, 2=Two}
    }
}
