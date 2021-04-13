public class Main {

  public static int sum(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }

  public static int calculateFactorial(int fact) {
    int calc = 1;
    for (int i = 0; i <= calc; i++) {
      calc *= fact;
    }


  // public static void main(String[] args) {

    System.out.println(calculateFactorial(20));
    System.out.println(sum(20));

    // Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given
    // parameter

    // String typo = "Chinchill";

    // System.out.println(appendA(typo));

    // public static int doubleNumber(int num){
    //   return num*2;
    // }

    // public static String  greet(String anyName){
    // return "Greeting dear "+ anyName;
    // }

    // int baseNumber = 123;
    // System.out.println(doubleNumber(baseNumber));

    // String al = "Green Fox";
    // System.out.println(greet(al));

    // write your code here
    // - Create an array variable named `numbers`
    //   with the following content: `[4, 5, 6, 7]`
    // - Print the third element of `numbers`
    /* public class Arrays {
         public static void main(String[] args) {
             int[] numbers = {1, 2, 3, 6};

             // Print the second element of the array
             System.out.println("The second element is " + numbers[1]);

             // Print all elements of the array
             for (int i = 0; i < numbers.length; i++) {
                 System.out.println(numbers[i] + " ");
             }
         }
     }

    int[] numbers = {4, 5, 6, 7};
     System.out.println("The third element is "+numbers[2]);

     */
    // - Create an array variable named `firstArrayOfNumbers`
    //   with the following content: `[1, 2, 3]`
    // - Create an array variable named `secondArrayOfNumbers`
    //   with the following content: `[4, 5]`
    // - Print "secondArrayOfNumbers is longer" if `secondArrayOfNumbers` has more
    //   elements than `firstArrayOfNumbers`
    // - Otherwise print: "firstArrayOfNumbers is the longer one"

    /*

    int[] firstArrayOfNumbers = { 1, 2, 3};
    int[] secondArrayOfNumbers = {4, 5};

    if (firstArrayOfNumbers.length < secondArrayOfNumbers.length){
        System.out.println("secondArrayOfNumber is longer");
    }else{
        System.out.println("firstArrayOfNumber is the longer");
    }
    */

    // int[] numbers = {54, 23, 66, 12};

    // System.out.println(numbers[1]+numbers[2]);
    //  int[] numbers = {1, 2, 3, 8, 5, 6};
    // int dest = numbers[4];

    // numbers[4] = numbers[3];
    // numbers[3] = dest;
    /*
    int[] numbers = {1, 2, 3, 4, 5};

    numbers[3] = numbers[3] + 5;
    System.out.println(numbers[3]);

    int[] num = {4, 5, 6, 7};

    for (int i = 0; i < num.length; i++) {
        System.out.println(num[i]);
    }

    String[][]dimension = {{"lime","forest green","olive","pale green","spring green",},{"orange red","red","tomato"},{"orchid","violet","pink","hot pink"}};

    System.out.println(Arrays.toString(dimension[0]));
    System.out.println(Arrays.toString(dimension[1]));
    System.out.println(Arrays.toString(dimension[2]));

    //   1 0 0 0
    //   0 0 0 0
    //   0 0 0 0
    //   0 0 0 0

    int[][] matrix = new int[4][4];
    for (int i=0; i< matrix.length; i++){
        for ( int j =0; j< matrix.length; j++){
            if (i==j){
                matrix[i][j] = 1;
            }else{
                matrix[i][j] = 0;
            }
        }
        System.out.println(Arrays.toString(matrix[i]));
    }
    */

  }
}
