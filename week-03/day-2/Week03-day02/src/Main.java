import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    // Create a function that divides number 10
    // by a number that's passed as a paramater and prints the result.
    // It should print "fail" if the parameter is 0
    Scanner scan = new Scanner(System.in);
    System.out.println("Pass me a number dude! :");
    int user = scan.nextInt();
    divide(user);
  }

  public static void divide(int userAdd) {
    int number = 0;
    try {
      number = 10 / userAdd;
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
    System.out.println("Your result is: " + number);
  }
}
