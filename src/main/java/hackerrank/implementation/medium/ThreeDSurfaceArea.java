package hackerrank.implementation.medium;

public class ThreeDSurfaceArea {

  static int surfaceArea(int[][] A) {
    int area = 0;
    for (int i=0; i<A.length; i++) {
      for (int j=0; j<A[0].length; j++) {
        int height = A[i][j];
        area += 2;
        area += getNeighbourHeight(A, i - 1, j, height);
        area += getNeighbourHeight(A, i + 1, j, height);
        area += getNeighbourHeight(A, i, j + 1, height);
        area += getNeighbourHeight(A, i, j - 1, height);
      }
    }
    return area;
  }

  static int getNeighbourHeight(int[][] A,int i,int j, int originalHeight) {
    if (i >=0 && i <A.length && j >=0 && j<A[0].length) {
      return A[i][j] > originalHeight ? 0 : originalHeight - A[i][j];
    }

    return originalHeight;
  }

}
