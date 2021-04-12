
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        //  String x = scanner.nextLine();
        // System.out.println(x);
        /*
        System.out.println("Girl's enter: ");
        int girls = scanner.nextInt();

        System.out.println("Boy's enter: ");
        int boyz = scanner.nextInt();

        int total = boyz+girls;

        if (girls == 0){
            System.out.println("Sausage");
        }

        else if (total >= 20 && girls == boyz){
            System.out.println("The party is excellent!");
        }
        else if ( total >=20 &&  girls != boyz ){
            System.out.println("Quite a cool party!");
        }
        else if (total <=20){
            System.out.println("Average party");
        }
        */
        /*
        public class Conditionals {
  public static void main(String[] args) {
    int a = 0;
    while (a < 10) {
      System.out.println(a); // Prints the numbers from 0 to 9
      a += 1;
    }

    for (int i = 0; i < 100; i++) {
      System.out.println(i); // Prints the numbers from 0 to 99
    }
  }
}
          public class IWontCheatOnTheExams {
            public static void main(String[] args) {
                // Create a program that writes this line 100 times:
                // "I won't cheat on the exam!"
            }
        }


        for (int i = 0; i < 100; i++) {
            System.out.println("I wont cheat on the exam!");
        }

        // Create a program that prints all the even numbers between 0 and 500

        for(int even = 0; even <= 50; even+=2){
            System.out.println(even);
        }
        */

// Create a program that asks for a number and prints the multiplication table with that number
//
// Example:
// The number 15 should print:
//
// 1 * 15 = 15
// 2 * 15 = 30
// 3 * 15 = 45
// 4 * 15 = 60
// 5 * 15 = 75
// 6 * 15 = 90
// 7 * 15 = 105
// 8 * 15 = 120
// 9 * 15 = 135
// 10 * 15 = 150
/*
        System.out.println("Please give me a number:");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(i +" * "+ number+" = "+ i*number);
        }
*/
        // Create a program that asks for two numbers
// If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
        /*
        System.out.println("Give me a number");
        int num1 = scanner.nextInt();

        System.out.println("Giveme another number");
        int num2 = scanner.nextInt();

        if (num1 > num2){
            System.out.println("Second number should be bigger!");
        }else if(num1<num2){
            for (int i = num1; i <= num2; i++ ){
                System.out.println(i);
            }

        }
        */

        // Write a program that prints the numbers from 1 to 100
// but for multiples of three print “Fizz” instead of the number
// and for the multiples of five print “Buzz”.
// For numbers which are multiples of both three and five print “FizzBuzz”.
        /*
        for (int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
            }else if(i%3 == 0){
                System.out.println("Fizz");
            }else if(i%5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
        */
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
        /*
        int input = 3;

        for (int i = 1; i <= input; i++){

            for( int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
        System.out.println("Tell me a number: ");
        int side = scanner.nextInt();

        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (i == 0 || i == side - 1 || j == side - 1 || j == 0 || j == i) {
                    System.out.print("%");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}

