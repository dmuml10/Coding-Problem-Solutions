package leetcode.medium;

public class SortArray {

    public static int[] sort(int[] array) {
        for (int i=0; i<array.length; i++) {
            int min = array[i];
            int index = -1;
            for (int j=i; j<array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (index >= 0) swap(array, i, index);
        }
        return array;
    }

    private static void swap(int[] array, int i, int j) {
        int value = array[i];
        array[i] = array[j];
        array[j] = value;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 4, 2, 7, 12, 5, 24, 100, 99, 98};
        int[] b = new int[] {5, 4, 3, 2, 1};
        int[] c = new int[] {-1, 12, -4, 4, -3, 22, 100};
        sort(a);
        sort(b);
        sort(c);
        printArray(a);
        printArray(b);
        printArray(c);

    }

    private static void printArray(int[] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i]+ ", ");
        }
        System.out.println("");
    }

}
