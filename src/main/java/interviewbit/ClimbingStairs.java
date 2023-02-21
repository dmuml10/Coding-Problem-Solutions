package interviewbit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ClimbingStairs {

    public static Set<Integer> set = new HashSet<>();

    public int solve(ArrayList<Integer> A) {
        step(A, 0, 0);


        int min =  Integer.MAX_VALUE;
        for (Integer i: set) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int step(ArrayList<Integer> A, int index, int cost) {
        if (index == A.size()-1) {
            cost += A.get(index);
            set.add(cost);
            return cost;
        } else if (index >= A.size()) {
            return cost = 0;
        }

        cost += A.get(index);
        step(A, ++index, cost);
        step(A, ++index, cost);
        return cost;
    }

}