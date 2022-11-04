package hackerrank.implementation.easy;

public class DesignerPdfViewer {

    static int designerPdfViewer(int[] h, String word) {
        int max = 1;
        for (int i=0; i<word.length(); i++) {
            if (max < h[(int)word.charAt(i) - 97]) {
                max = h[(int)word.charAt(i) - 97];
            }
        }

        return max * word.length();
    }

}
