package algorithms.implementation.easy;

public class AngryProfessor {

    static String angryProfessor(int k, int[] a) {
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (a[i] > 0) {
                count ++;
            }
        }
        return a.length - count >= k ? "NO" : "YES";
    }

}
