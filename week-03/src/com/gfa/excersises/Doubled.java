package com.gfa.excersises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {
    decrypt("src/com/gfa/excersises/douplicated-chars.txt");
  }

  public static void decrypt(String fileName) {
    Path file = Paths.get(fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(file);

    } catch (IOException e) {
      e.printStackTrace();
    }
    List<String> content = new ArrayList<>();

    for (String line : lines) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < line.length() - 1; i += 2) {
        sb.append(line.charAt(i));
      }
      content.add(sb.toString());
    }
    Path filetwo = Paths.get("src/com/gfa/excersises/douplicated-charstwo.txt");
    try {
      Files.write(filetwo,content);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
