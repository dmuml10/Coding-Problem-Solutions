package hackerrank.implementation.easy;

public class FindDigits {

  static int findDigits(int n) {
    String digit = Integer.toString(n);

    int count = 0;
    for (int i=0; i<digit.length(); i++) {
      int d = Integer.parseInt(digit.substring(i, i+1));
      if (d != 0 && n%d == 0) {
        count++;
      }
    }

    return count;
  }

}
