package algorithms.implementation.easy;

public class CatsAndMouse {

  static String catAndMouse(int x, int y, int z) {
    int a = Math.abs(z - x);
    int b = Math.abs(z - y);
    if (a < b) {
      return "Cat A";
    } else if (a > b) {
      return "Cat B";
    } else {
      return "Mouse C";
    }
  }

}
