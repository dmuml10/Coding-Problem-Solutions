package hackerrank.implementation.easy;

public class TwoDArrayDS {

  static int hourglassSum(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int i=1; i<arr.length-1; i++) {
      for (int j=1; j<arr[0].length-1; j++) {
        int sum = hourglassSum(i, j, arr);
        if (max < sum) {
          max = sum;
        }
      }
    }
    return max;
  }

  static int hourglassSum(int i, int j, int[][] arr) {
    int sum = 0;
    sum += arr[i-1][j-1];
    sum += arr[i-1][j];
    sum += arr[i-1][j+1];
    sum += arr[i][j];
    sum += arr[i+1][j+1];
    sum += arr[i+1][j];
    sum += arr[i+1][j-1];
    return sum;
  }

}
