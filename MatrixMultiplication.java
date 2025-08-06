package oop;


public class MatrixMultiplication {
  void multiplyMatrices(int[][] a, int[][] b) {
        int rows1 = a.length;
        int cols1 = a[0].length;
        int cols2 = b[0].length;

        
        int[][] result = new int[rows1][cols2];

        // Multiply
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

      
        System.out.println("Matrix Multiplication Result:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixMultiplication m = new MatrixMultiplication();

        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

        m.multiplyMatrices(matrix1, matrix2);
    }
}