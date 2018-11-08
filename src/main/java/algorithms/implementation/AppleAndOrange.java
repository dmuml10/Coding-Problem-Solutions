package algorithms.implementation;

public class AppleAndOrange {

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int num_apples = 0;
        for (int i=0; i<apples.length; i++) {
            if (apples[i] + a >= s && apples[i] + a <= t) {
                num_apples++;
            }
        }

        int num_oranges = 0;
        for (int i=0; i<oranges.length; i++) {
            if (b + oranges[i] >= s && b + oranges[i] <= t) {
                num_oranges++;
            }
        }

        System.out.println(num_apples);
        System.out.println(num_oranges);
    }

}
