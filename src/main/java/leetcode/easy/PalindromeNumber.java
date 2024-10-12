package leetcode.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        var s = String.valueOf(x);
        int j=s.length()-1;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }
}
