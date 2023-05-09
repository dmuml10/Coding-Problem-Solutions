package leetcode.easy;

public class GcdOfStrings {

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
        System.out.println(gcdOfStrings("AAAAAAAAA", "AAACCC"));
    }

    public static String gcdOfStrings(String str1, String str2) {


        String large = str1.length() > str2.length() ? str1 : str2;
        String small = str1.length() > str2.length() ? str2 : str1;

        int gdv = 1;
        for (int i=small.length(); i>=1; i--) {
            if (str1.length()% i ==0 && str2.length() % i == 0) {
                gdv = i;
                break;
            }
        }

        String result = small.substring(0, gdv);

        String concatLarge = "";
        for (int i=0; i<large.length()/gdv; i++) {
            concatLarge += result;
        }

        String concatSmall = "";
        for (int i=0; i<small.length()/gdv; i++) {
            concatSmall += result;
        }
        if (concatLarge.equals(large) && concatSmall.equals(small)) {
            return result;
        } else {
            return "";
        }
    }

}
