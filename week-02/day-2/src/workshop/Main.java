package workshop;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
  }

  public static String findUniqueItems(int[] numbers) {
    List<Integer> result = new ArrayList<>();
    for (int numb : numbers) {
      if (!result.contains(numb)) {
        result.add(numb);
      }
    }
    return Arrays.toString(result.toArray());
  }
}
