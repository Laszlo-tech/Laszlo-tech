package com.gfa.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
  public static void main(String[] args) {
    System.out.println(countLines("src/com/gfa/exam/my-file.txt"));
  }

  public static int countLines(String fileName) {
    Path file = Paths.get(fileName);
    int count = 0;
    try {
      List<String> lines = Files.readAllLines(file);
      for (int i = 0; i < lines.size(); i++) {
        count += i;
      }
    } catch (IOException e) {
    }
    return count;
  }
}
