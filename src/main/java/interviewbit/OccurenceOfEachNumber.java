package interviewbit;

import jdk.nashorn.internal.objects.ArrayBufferView;

import java.util.*;

public class OccurenceOfEachNumber {

    public static void main(String[] args) {

    }

    public Map<Integer, Integer> map = new HashMap<>();

    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        for (int i: A) {
            if (map.containsKey(i)) {
                int value = map.get(i);
                map.put(i, ++value);
            } else {
                map.put(i, 1);
            }
        }

        List<Integer> list = new ArrayList(map.keySet());
        Collections.sort(list);

        ArrayList<Integer> result = new ArrayList<>();
        for (int i: list) {
            result.add(map.get(i));
        }
        return result;
    }

}
