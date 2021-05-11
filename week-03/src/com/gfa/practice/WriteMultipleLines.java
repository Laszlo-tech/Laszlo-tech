package com.gfa.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines {
  public static void main(String[] args){

  List<String> adjustedFile = new ArrayList<>();
  adjustedFile = writeLines("my-newFile.txt", "apple", 5);
    System.out.println(adjustedFile);
}

  public static List<String> writeLines(String filePath, String word, int number) {
    List<String> content = new ArrayList<>();
    Path fileSource = Paths.get(filePath);
    try {
      for (int i = 0; i < number; i++) {
        Files.write(fileSource, content);
        content.add(word);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return content;
  }
}

