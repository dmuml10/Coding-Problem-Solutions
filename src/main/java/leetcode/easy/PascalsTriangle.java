package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        list.add(one);


        for (int i=0; i<numRows-1; i++) {
            List<Integer> temp = new ArrayList<>();
            int size = list.get(i).size() + 1;

            for (int j =0; j<size; j++) {
                if (j == 0 || j == size-1) {
                    temp.add(1);
                } else {
                    temp.add(list.get(i).get(j) + list.get(i).get(j-1));
                }
            }
            list.add(temp);

        }
        return list;
    }

}
