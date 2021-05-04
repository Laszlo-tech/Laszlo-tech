package Loops;

public class Main {
  public static void main(String[] args) {
    // triangle(4)
    // %%%%%
    // %%  %
    // % % %
    // %  %%
    // %%%%%
  }
  //  public static void triangle(int input) {
  //    for (int i = 1; i <= input; i++) {
  //      for (int j = 1; j <= i; j++) {
  //        System.out.print("*");
  //      }
  //      System.out.println();
  //    }
  //  }
  public static void diagonal(int input) {
    for (int i = 0; i < input ; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("%");
      }
    }
    System.out.println("");
  }
}
