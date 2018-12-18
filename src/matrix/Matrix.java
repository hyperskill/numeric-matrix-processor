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
        //constant
        int consT = scan.nextInt();

        //loop for constant multiplication of Matrix
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println();
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print((matrixA[i][j] * consT) + " ");
            }
        }
    }
}
