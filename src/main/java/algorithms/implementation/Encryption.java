package algorithms.implementation;

public class Encryption {

    // Complete the encryption function below.
    static String encryption(String s) {
        String text = s.replace(" ", "");
        Double root = Math.sqrt(text.length());
        int rowNum = (int)Math.floor(root);
        int colNum = (int)Math.ceil(root);

        String result = "";
        int index = 0;
        for (int i=0; i<colNum; i++) {
            for (int j=0; j<rowNum; j++) {
                result +=text.charAt(index);
                index++;
            }
            result += " ";
        }
        return result;

    }
}
