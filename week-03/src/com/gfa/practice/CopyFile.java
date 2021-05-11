package com.gfa.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    boolean pelda = copyFile("src/com/gfa/exam/my-file.txt", "src/com/gfa/exam/my-filethree.txt");
    System.out.println(pelda);
  }

  public static boolean copyFile(String fileName, String otherFileName) {
    Path file = Paths.get(fileName);
    List<String> sourceFile = new ArrayList<>();
    try {
      sourceFile = Files.readAllLines(file);
    } catch (IOException e) {
      e.printStackTrace();
    }
    List<String> fileToFillWithContent = new ArrayList<>();
    for (String content : sourceFile) {
      fileToFillWithContent.add(content);
    }
    Path otherFile = Paths.get(otherFileName);
    try {
      Files.write(otherFile, fileToFillWithContent);
    } catch (IOException e) {
      e.printStackTrace();
    }
    boolean equalCheck =
        sourceFile.size() == fileToFillWithContent.size()
            && fileToFillWithContent.containsAll(sourceFile);
    return equalCheck;
  }
}
