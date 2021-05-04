package Workshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Path filePath = Paths.get("src/my-file.txt");
    printLines(filePath);

    String file = "src/my-file.txt";


  }

  public static void printLines(Path filePath) {
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (int i = 0; i < lines.size(); i++) {
        System.out.println(lines.get(i));
      }
    } catch (IOException e) {
      System.out.println("Unable to read file:" + filePath);
    }
  }
}
