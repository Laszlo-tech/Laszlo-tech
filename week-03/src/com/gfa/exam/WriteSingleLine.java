package com.gfa.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    List<String>adjustedFile = new ArrayList<>();
    String name = "Laszlo";
   adjustedFile = writeLine("src/com/gfa/exam/my-file.txt",name);


  }
  public static List<String> writeLine (String fileName,String name){
    List<String> content = new ArrayList<>();
    Path file = Paths.get(fileName);
   content.add(name);
    try {
      Files.write(file,content);
    } catch (IOException e) {
      System.out.println("Uh-oh, could not write the file!");
    }
    return content;
  }
}
