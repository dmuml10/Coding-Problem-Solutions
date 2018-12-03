package leetcode.medium;

public class KeepCitySkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] side = new int[grid.length];
        int[] top = new int[grid[0].length];
        for (int i=0; i<grid.length; i++) {
            int max = -1;
            for (int j=0; j<grid[0].length; j++) {
                if (max < grid[i][j]) {
                    max = grid[i][j];
                    side[i] = max;
                }
            }
        }

        for (int i=0; i<grid[0].length; i++) {
            int max = -1;
            for (int j=0; j<grid.length; j++) {
                if (max < grid[j][i]) {
                    max = grid[j][i];
                    top[i] = max;
                }
            }
        }


        for (int i=0; i<side.length; i++) {
            System.out.print(side[i] + " ");
        }
        System.out.println();

        for (int i=0; i<top.length; i++) {
            System.out.print(top[i] + " ");
        }

        int sum = 0;
        for (int i=0; i<grid.length; i++) {
            for (int j=0; j<grid[0].length; j++) {
                int min = Math.min(side[i], top[j]);
                sum+= min - grid[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] x = {{3,0,8,4},
                     {2,4,5,7},
                     {9,2,6,3},
                     {0,3,1,0}};
        KeepCitySkyline k = new KeepCitySkyline();
        System.out.println(k.maxIncreaseKeepingSkyline(x));
    }


}
