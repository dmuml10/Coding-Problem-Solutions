package hackerrank.warmup;

public class ReverseArrayInPlace {

    public static void reverse (int[] array) {
        int li = array.length - 1;
        for (int i=0; i<array.length/2; i++) {
            int tmp = array[li];
            array[li] = array[i];
            array[i] = tmp;
            li--;
        }

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2};
        int[] c = {100, 99, 98, 97, 96, 95, 94};
        int[] d = {1};
        int[] e = {100, 99, 98, 97, 96, 95, 94, 93};
        reverse(a);
        reverse(b);
        reverse(c);
        reverse(d);
        reverse(e);
    }

}
