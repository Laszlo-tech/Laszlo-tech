package SymetricMatrix;

public class Main {

  public static void main(String[] args) {
    int[][] matrix = new int[4][5];
    boolean check = symmetricMatrix(matrix);
    System.out.println(check);
  }

  public static boolean symmetricMatrix(int[][] matrix) {
    boolean symmetric = false;
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (i != j) {
          System.out.println("It's not symmetric");
        } else {
          symmetric = true;
          for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
              if (matrix[i][j] != matrix[j][i]) {
                symmetric = false;
              }
            }
          }
        }
      }
    }
    return symmetric;
  }
}
