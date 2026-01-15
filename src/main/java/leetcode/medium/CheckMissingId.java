package leetcode.medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CheckMissingId {
    public static void main(String[] args) {
        String csvFilePath = "file.txt";       // CSV file with multiple columns
        String idListFilePath = "id_list.txt";     // File with UUIDs, one per line

        Set<String> thirdColumnValues = new HashSet<>();

        // Read 3rd column values from the CSV
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] columns = line.split(",", -1);
                if (columns.length > 2) {
                    thirdColumnValues.add(columns[2]);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading CSV file: " + e.getMessage());
            return;
        }

        // Check IDs in id_list.txt
        try (BufferedReader br = new BufferedReader(new FileReader(idListFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String trimmedId = line.trim();
                if (!trimmedId.isEmpty() && !thirdColumnValues.contains(trimmedId)) {
                    System.out.println(trimmedId);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading ID list file: " + e.getMessage());
        }
    }
}
