package illia.nebrat.homework.transpose;

import java.util.Random;

public class MatixTranspose {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;

        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[n][m];

        Random random = new Random();

        fillMatrix(matrix1, random);
        transposeMatrix(matrix1, matrix2);

        System.out.println("First Matrix:");
        printMatrix(matrix1);

        System.out.println("Second Matrix 2:");
        printMatrix(matrix2);
    }

    public static void fillMatrix(int[][] matrix, Random random) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = random.nextInt(10);
            }
        }
    }

    public static void transposeMatrix(int[][] source, int[][] destination) {
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < source[0].length; j++) {
                destination[j][i] = source[i][j];
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
