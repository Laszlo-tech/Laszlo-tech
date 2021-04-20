import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
  public static void main(String[] args) {
    // Write a function that is able to manipulate a file
    // by writing your name into it as a single line.
    // The file should be named "my-file.txt".
    // In case the program is unable to write the file,
    // it should print the following error message: "Unable to write file: my-file.txt".
    manipulate("src/my-file.txt");
  }

  public static void manipulate(String line){
    Path filePath = Paths.get(line);
    List<String> content = new ArrayList<>();
    content.add("Laszlo Hampl");
   try{
     Files.write(filePath,content);
   }catch (IOException e){
      System.out.println("Unable to write file: my-file.txt.");
   }
  }
}
