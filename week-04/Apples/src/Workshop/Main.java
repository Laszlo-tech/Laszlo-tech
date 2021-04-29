package Workshop;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    /*Apple alma = new Apple("apple");
        alma.getApple();
    System.out.println(alma);
    */

    ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(10, 20, 33, 44, 663));

    Sum number = new Sum();
    int a = number.sumOfElements(myList);
    System.out.println(a);

    String d = "listen";
    String b = "silent";

    Anagram ana = new Anagram();
    System.out.println(ana.anagram(d,b));
  }
}
