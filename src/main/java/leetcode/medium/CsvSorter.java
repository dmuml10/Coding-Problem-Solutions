package leetcode.medium;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CsvSorter {
    public static void main(String[] args) {
        // Hard-coded input file path
        String inputFile = "stationList.csv";

        List<String> dataLines = new ArrayList<>();
        String header;

        // Read file with BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            // First line is the header
            header = br.readLine();
            if (header == null) {
                System.err.println("Input file is empty or missing header.");
                return;
            }

            // Read remaining lines
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isBlank()) {
                    dataLines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file '" + inputFile + "': " + e.getMessage());
            return;
        }

        // Parse, sort by stop_id (column 0), and collect
        List<String[]> rows = dataLines.stream()
                .map(l -> l.split(";", -1))
                .sorted(Comparator.comparingLong(cols -> {
                    try {
                        return Long.parseLong(cols[0]);
                    } catch (NumberFormatException nfe) {
                        // In case of bad data, push to end
                        return Long.MAX_VALUE;
                    }
                }))
                .collect(Collectors.toList());

        // Output header + sorted rows
        System.out.println(header);
        for (String[] cols : rows) {
            System.out.println(String.join(";", cols));
        }
    }
}