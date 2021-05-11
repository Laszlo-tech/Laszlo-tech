package com.gfa.exam;

public class DivideByZero {
  public static void main(String[] args) {
    int num = 11;
    divideBy(num);
  }

  public static void divideBy(int num) {
    int result = 10 / num;
    if (num <= 10) {
      System.out.println(result);
    } else {
      System.out.println("fail");
    }
  }
}
