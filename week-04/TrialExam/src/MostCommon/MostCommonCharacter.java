package MostCommon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

public class MostCommonCharacter {

  Path filePath = new Paths("src/MostCommon/countchar.txt");

  public char mostCommonChar(Path path) {
    int count = 0;
    char character = ' ';
    try {
      List<String> characterList =
          Files.readAllLines(filePath); // Make a list of strings from the file.
      for (int i = 0; i < characterList.size(); i++) {}

      HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    } catch (IOException e) {
      System.out.println("File does not exist!");
    }
  }return x;
}
