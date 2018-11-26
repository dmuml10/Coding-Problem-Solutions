package algorithms.implementation.easy;

public class BeautifulDays {

    static int beautifulDays(int i, int j, int k) {
        int count = 0;
        for (int x=i; x<=j; x++) {
            StringBuilder s = new StringBuilder(Integer.toString(x));
            int value = Math.abs(x - Integer.parseInt(s.reverse().toString()));
            if (value % k == 0) {
                count++;
            }
        }
        return count;
    }

}
