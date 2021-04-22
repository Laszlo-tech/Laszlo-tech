package Workshop;

public class Main {

  public static void main(String[] args) {
    // String typo = "Chinchill";
    // String monkey = "gorill";
    // System.out.println(appendA(monkey));

    //int input = 6;
    //System.out.println(sum(input));

    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input

   int input = 5;

    System.out.println(calculateFactorial(input));
  }
  public static int calculateFactorial(int number){
    for (int i = number-1; i>= 1 ; i--) {
      number *= i;
    }return number;
  }
  //public static int sum(int a) {
   // int sum = 0;
    //for (int i = 0; i <= a; i++) {
      //sum += i;
    //}
    //return sum;
  //}
  // public static String appendA(String a){
  // return a+"a";
  }


