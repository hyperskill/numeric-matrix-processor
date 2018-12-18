package matrix;

import java.util.*;

public class Matrix {

    public static void userInput() {
        Scanner scan = new Scanner(System.in);
        //input for rows and cols of matrix A
        int rowA = scan.nextInt();
        int colA = scan.nextInt();
        // matrix A
        int[][] matrixA = new int[rowA][colA];
        //loop for adding elements to first Matrix A from IO Stream.
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = scan.nextInt();
            }
        }

        int rowB = scan.nextInt();
        int colB = scan.nextInt();

        //matrixB
        int[][] matrixB = new int[rowB][colB];

        //loop for adding elements to Matrix B from IO Stream.
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = scan.nextInt();
            }
        }

        int sumOfMatrices = 0;
        if (rowA != rowB || colA != colB) {
            System.out.println("ERROR");
        } else {
            for (int i = 0; i < matrixA.length; i++) {
                System.out.println();
                for (int j = 0; j < matrixA[i].length; j++) {
                    sumOfMatrices += matrixA[i][j];
                    sumOfMatrices += matrixB[i][j];
                    System.out.print(sumOfMatrices + " ");
                    sumOfMatrices = 0;
                }
            }
        }
    }
}
