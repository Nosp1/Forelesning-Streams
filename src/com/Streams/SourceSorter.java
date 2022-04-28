package com.Streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class SourceSorter {
    public static void main(String[] args) throws IOException {
        List<String> sorted =
                Files.readAllLines(Path.of("src/input.txt")).stream().sorted().collect(Collectors.toList());
        try (PrintWriter writer = new PrintWriter(new FileWriter("src/output.txt", false))) {
            sorted.forEach(string -> writer.write(string + "\n"));
        } catch (IOException e) {
            // ... handle IO exception
            e.printStackTrace();
            System.out.println("Sorry you dont have access to that folder...");
        }
    }

}
