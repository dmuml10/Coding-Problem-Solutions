package leetcode.easy;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String p = "";
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                p += s.charAt(i);
            }
        }

        String reverse = "";
        for (int i=p.length()-1; i>=0; i--) {
            reverse += p.charAt(i);
        }

        return reverse.equals(p);
    }

}
