package hackerrank.warmup;

public class Recursion {

    private static Integer sum = 0;

    public static int stepPerms(int n) {
        recursion(n, 0);
        int tmp = sum;
        sum = 0;
        return tmp;
    }

    public static int recursion(int n, int step) {
        if (step == n) {
            return ++sum;
        } else if (step > n) {
            return sum;
        }

        recursion(n, step+1);
        recursion(n, step+2);
        recursion(n, step+3);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(stepPerms(1));
        System.out.println(stepPerms(3));
        System.out.println(stepPerms(7));
    }

}
