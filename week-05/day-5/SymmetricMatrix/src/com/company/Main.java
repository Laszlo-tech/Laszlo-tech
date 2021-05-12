package com.company;

public class Main {

  public static void main(String[] args) {
    // write your code here
    int[][] matrix = new int[][] {{1, 1, 1}, {1, 1, 1, 1}, {1, 1, 1, 1}};
    System.out.println(isSymmetric(matrix));
  }

  public static boolean isSymmetric(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        if (matrix[i].length != matrix[j].length || matrix[i][j] != matrix[j][i]) {
          return false;
        }
      }
    }
    return true;
  }
}
