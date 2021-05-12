package workshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(logIP("log.txt"));
    // logIP("log.txt");
    // ratio("log.txt");
  }

//  public static String ratio(String fileName) {
//    List<String> content = new ArrayList<>();
//    int count1 = 0;
//    int count2 = 0;
//    String ratios = "";
//    for (String line : content) {
//      String[] splittedLine = line.split("   ");
//      if (splittedLine[2].contains("GET /")) {
//        count1++;
//      } else {
//        count2++;
//      }
//    }
//
//    ratios = "GET " + count1 + " : " + "POST " + count2;
//    return ratios;
//  }

  public static List<String> logIP(String fileName) {
    List<String> fileContent = new ArrayList<>();
    List<String> ipAddressList = new ArrayList<>();
    fileContent = readFile(fileName);
    ipAddressList = takesIpAddress(fileContent);

    return ipAddressList;
  }

  private static List<String> takesIpAddress(List<String> fileContent) {
    List<String> ipAddressList = new ArrayList<>();
    for (String line : fileContent) {
      String[] temp = line.split("   ");
      ipAddressList.add(temp[1]);
    }
    return ipAddressList;
  }

  private static List<String> readFile(String fileName) {
    Path file = Paths.get("src/workshop/" + fileName);
    List<String> lines = new ArrayList<>();
    try {
      lines = Files.readAllLines(file);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return lines;
  }
}
