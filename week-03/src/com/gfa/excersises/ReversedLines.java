package com.gfa.excersises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
  public static void main(String[] args) {
    reverse("reversed-lines.txt");
  }

  public static void reverse(String fileName) {
    Path input = Paths.get("src/com/gfa/excersises/" + fileName);

    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(input);

    } catch (IOException e) {
      e.printStackTrace();
    }
    List<String> reversedLine = new ArrayList<>();
    for (String line : lines) {
      StringBuilder newLine = new StringBuilder();
      char[] chars = line.toCharArray();
      int length = chars.length;
      for (int i = length - 1; i >= 0; i--) {
        newLine.append(chars[i]);
      }
      reversedLine.add(newLine.toString());
      Path output = Paths.get("src/com/gfa/excersises/output.txt");
      try {
        Files.write(output, reversedLine);
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
