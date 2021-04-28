package Workshop;

import java.util.ArrayList;

public class Sum {

  public int sumOfElements(ArrayList<Integer> arrayList){
    if (arrayList == null) {
      throw new IllegalArgumentException();
    }

    int sum = 0;
    for (int value : arrayList) {
      sum += value;
    }
    return sum;
  }
}
