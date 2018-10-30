package algorithms.implementation;

public class SaveThePrisoner {

    /*
    saveThePrisoner has the following parameter(s):

        n: an integer, the number of prisoners
        m: an integer, the number of sweets
        s: an integer, the chair number to begin passing out sweets from
     */
    public static int saveThePrisoner(int n, int m, int s) {
        int reminder = m % n;
        return (s + reminder - 1) % n == 0 ? n : (s + reminder - 1) % n;
    }

}
