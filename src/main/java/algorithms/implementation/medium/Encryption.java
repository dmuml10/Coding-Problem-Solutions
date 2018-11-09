package algorithms.implementation.medium;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        String text = s.replace(" ", "");
        Double root = Math.sqrt(text.length());
        int rowNum = (int)Math.floor(root);
        int colNum = (int)Math.ceil(root);

        if (rowNum * colNum < text.length()) {
            rowNum++;
        }

        Character[][] array = new Character[rowNum][colNum];
        int index = 0;
        for (int i=0; i<rowNum; i++) {
            for (int j=0; j<colNum; j++) {

                if (index < text.length()) {
                    array[i][j] = text.charAt(index);
                }
                index++;
            }
        }

        String result = "";
        for (int i=0; i<colNum; i++) {
            for (int j=0; j<rowNum; j++) {
                if (array[j][i] != null) {
                    result += array[j][i];
                }
            }
            result += " ";
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));
        System.out.println(encryption("feedthedog"));
        System.out.println(encryption("chillout"));
    }
}
