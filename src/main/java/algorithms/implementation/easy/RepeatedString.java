package algorithms.implementation.easy;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        int one = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 'a') {
                one++;
            }
        }

        long number = n / s.length();
        long rem = 0;
        for (int i=0; i<n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                rem++;
            }
        }
        return number * one + rem;
    }

}
