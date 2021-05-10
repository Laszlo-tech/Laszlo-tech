package com.gfa.exam;

import java.util.Arrays;

public class DoubleItems {
  public static void main(String[] args) {
    int[] numberList = {3, 4, 5, 6, 7};
    for (int i = 0; i < numberList.length; i++) {
      numberList[i] = numberList[i] * 2;
    }
    System.out.println(Arrays.toString(numberList));
  }
}
