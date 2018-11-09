package algorithms.implementation.easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MigratoryBirds {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");
        List<Integer> array = new ArrayList<>();
        for (int i=0; i<num; i++) {
            array.add(Integer.parseInt(data[i]));
        }

        System.out.println(findCommonBird(array));
    }

    public static int findCommonBird(List<Integer> arr) {
        int [] birds = new int[]{0,0,0,0,0};
        for (int i=0; i<arr.size(); i++) {
            birds[arr.get(i)-1]++;
        }

        int max = 0;
        int id = 0;
        for (int j=0; j<5; j++) {
            if (birds[j] > max) {
                max = birds[j];
                id = j+1;
            }
        }

        return id;
    }

}
