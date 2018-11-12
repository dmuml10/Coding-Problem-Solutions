package algorithms.implementation.easy;

public class CountingValleys {

  static int countingValleys(int n, String s) {
    int level = 0;
    int count = 0;
    boolean down = false;
    for (int i=0; i<s.length(); i++) {
      if (s.charAt(i) == 'D') {
        level--;
        down = false;
      } else {
        down = true;
        level++;
      }

      if (level == 0 && down) {
        down = false;
        count++;
      }
    }
    return count;
  }

}
