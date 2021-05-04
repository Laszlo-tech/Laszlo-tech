package Workshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {



  public static int countLine(String fileName){
    Path file = Paths.get(fileName);
    try {
      List<String> abc = Files.readAllLines(file);
      return abc.size();
    } catch (IOException e) {
      return 0;
    }
  }

public static void main(String[] args){

    System.out.println(countLine("src/my-file.txt"));
}
}
