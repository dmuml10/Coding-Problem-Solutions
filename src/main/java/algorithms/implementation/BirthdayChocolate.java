package algorithms.implementation;

import java.util.List;

public class BirthdayChocolate {

    public static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        for (int i=0; i <= s.size() - m; i++) {
            int temp = 0;
            for (int j=i; j < i + m; j++) {
                temp += s.get(j);
            }
            if (temp == d) counter += 1;
        }

        return counter;
    }

}
