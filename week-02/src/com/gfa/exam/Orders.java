package com.gfa.exam;

import java.util.Arrays;

public class Orders {
  public static void main(String[] args) {
    String[]orders = {"first","second","third"};
    String third = orders[0];
    orders[0]=orders[2];
    orders[2] = third;
    System.out.println(Arrays.toString(orders));
  }

}
