package leetcode.medium;

public class MinimumAmountOfTimeToCollectGarbage {
    public int garbageCollection(String[] garbage, int[] travel) {
        int time = 0;
        int tm = 0;
        int tp = 0;
        int tg = 0;
        for (int i=0; i<garbage.length; i++) {
            if (i != 0) {
                tm += travel[i - 1];
                tp += travel[i - 1];
                tg += travel[i - 1];
            }
            if (garbage[i].contains("M")) {
                time += numLetter(garbage[i], 'M');
                time += tm;
                tm = 0;
            }
            if (garbage[i].contains("P")) {
                time += numLetter(garbage[i], 'P');
                time += tp;
                tp = 0;
            }
            if (garbage[i].contains("G")) {
                time += numLetter(garbage[i], 'G');
                time += tg;
                tg = 0;
            }
        }
        return time;
    }

    private int numLetter(String str, char c) {
        int num = 0;
        for (int i=0; i< str.length(); i++) {
            if (str.charAt(i) == c) num++;
        }
        return num;
    }

    public static void main(String[] args) {
        MinimumAmountOfTimeToCollectGarbage c = new MinimumAmountOfTimeToCollectGarbage();
        String[] s = new String[]{"G","P","GP","GG"};
        int[] i = new int[] {2,4,3};
        System.out.println(c.garbageCollection(s, i));
    }

}
