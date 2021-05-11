package com.gfa.practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {
  public static void main(String[] args) {
    printLines("src/com/gfa/exam/my-fi");
  }
  public static void printLines(String fileName){
    Path file = Paths.get(fileName);
    try {
      List<String> result = Files.readAllLines(file);
      System.out.println(result);
    } catch (IOException e) {
      System.out.println("unable to read");
    }
  }
}
