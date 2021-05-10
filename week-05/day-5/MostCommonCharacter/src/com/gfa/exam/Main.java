package com.gfa.exam;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    try {
      System.out.println(getMostCommonCharacters("src/com/gfa/exam/input.txt"));
    } catch (NoSuchFieldException e) {
      e.printStackTrace();
    }
  }

  public static Map<Character, Integer> getMostCommonCharacters(String fileName)
      throws NoSuchFieldException {
    // Read the file.
    // If file not exist throw exception:"File does not exist!"
    List<String> fileContent = readFile(fileName);
    Map<Character, Integer> occurrences = getLetters(fileContent);
    Map<Character, Integer> twoMostCommon = new HashMap<>();
    for (int i = 0; i < 2; i++) {
      Map.Entry<Character, Integer> nextEntry = theMostCommon(occurrences);
      twoMostCommon.put(nextEntry.getKey(), nextEntry.getValue());
      occurrences.remove(nextEntry.getKey());
    }

    // take the string array and break it down to char list
    // iterate through the list
    // put result to a hashMap
    return twoMostCommon;
  }

  private static Map.Entry<Character, Integer> theMostCommon(Map<Character, Integer> occurrences) {
    Map.Entry<Character, Integer> maxEntry = null;
    for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
      if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
        maxEntry = entry;
      }
    }
    return maxEntry;
  }

  private static Map<Character, Integer> getLetters(List<String> fileContent) {
    Map<Character, Integer> occurrences = new HashMap<>();
    for (String line : fileContent) {
      char[] charArray = line.toCharArray();
      for (char singleChar : charArray) {
        if (!occurrences.containsKey(singleChar)) {
          occurrences.put(singleChar, 1);
        } else {
          occurrences.put(singleChar, occurrences.get(singleChar) + 1);
        }
      }
    }
    return occurrences;
  }

  private static List<String> readFile(String fileName) throws NoSuchFieldException {
    Path file = Paths.get(fileName);
    List<String> content;
    if (Files.notExists(file)) {
      throw new NoSuchFieldException("File does not exist!");
    }
    try {
      content = Files.readAllLines(file);
    } catch (IOException e) {
      System.err.println("Couldn't read file!");
      return null;
    }
    return content;
  }
}
