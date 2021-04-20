import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CountLine {
  public static void main(String[] args) {

    // Write a function that takes a filename as string as a parameter
    // and returns the number of lines the file contains.
    // It should return zero if it can't open the file
    // and should not raise any error.

    System.out.println(count("src/my-file.txt"));
  }
  public static int count (String filename){
    Path filePath = Paths.get(filename);
    try{
      List<String> list = Files.readAllLines(filePath);
      int size = list.size();
      return size;
    }catch (IOException e){
      return 0;
    }

  }
}
