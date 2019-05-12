package com.epam.javacore2019.solutions.arrays_and_strings.matrix_to_zero;

// Task 1.8

public class MatrixToZero {

    public static void setToZero (int[][] matrix, int m, int n) {
        if (matrix[m][n] == 0) {
            for (int i = 0, k = matrix[m].length; i < k; i++) {
                matrix[m][i] = 0;
            }

            for (int j = 0, k = matrix.length; j < k; j++) {
                matrix[j][n] = 0;
            }
        }
    }
}
