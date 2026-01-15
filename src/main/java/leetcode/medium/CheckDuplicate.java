package leetcode.medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CheckDuplicate {
    public static void main(String[] args) {
        String filePath = "StationList.csv";  // Replace with your actual CSV file path
        Set<String> seen = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",", -1); // Use -1 to include trailing empty strings

                if (columns.length > 2) {
                    String thirdColumnValue = columns[2];

                    if (!seen.add(thirdColumnValue)) {
                        duplicates.add(thirdColumnValue);
                    }
                }
            }

            System.out.println("==== " + duplicates.size());

            if (duplicates.isEmpty()) {
                System.out.println("No duplicates found in the 3rd column.");
            } else {
                System.out.println("Duplicated values in the 3rd column:");
                for (String dup : duplicates) {
                    System.out.println(dup);
                }
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}