package leetcode.medium;

public class StrictlyPalindromicNumber {
    public boolean isStrictlyPalindromic(int n) {
        for (int b = 2; b <= n - 2; b++) {
            int num = n;
            StringBuilder sb = new StringBuilder();
            while (num > 0) {
                sb.append(num % b);
                num /= b;
            }
            String str = sb.reverse().toString();
            if (!isPalindrome(str)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
