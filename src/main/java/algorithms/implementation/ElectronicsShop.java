package algorithms.implementation;

public class ElectronicsShop {

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max = -1;
        for (int i=0; i<keyboards.length; i++) {
            for (int j=0; j<drives.length; j++) {
                int sum = keyboards[i] + drives[j];
                if (sum > max && sum <= b) {
                    max = sum;
                }
            }
        }

        return max;
    }

}
