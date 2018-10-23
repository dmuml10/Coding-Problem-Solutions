package algorithms.implementation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumIntegerDigits {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        System.out.println(sumIntegerDigits(input));
    }

    public static int sumIntegerDigits(String input) {
        int result = 0;
        for (int i=0; i<input.length(); i++) {
            result += Integer.parseInt(input.substring(i, i+1));
        }
        return result;
    }

}
