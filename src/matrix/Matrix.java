package matrix;

import java.util.*;


@SuppressWarnings("ALL")
class Matrix {
    // Main menu for choosing operation
    static Scanner scan = new Scanner(System.in);

    //Main menu soubroutine for choosing operation on Matrix
    protected static void Menu() {
        System.out.println("1. Add matrices.");
        System.out.println("2. Multiply matrix to a constant");
        System.out.println("3. Multiply matrices");
        System.out.println("0. Exit");
        System.out.print("Your choice: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                MatrixAddition();
                break;
            case 2:
                MatrixConstatnt();
                break;
            case 3:
                MatrixMultiplication();
                break;
            case 0:
                System.exit(0);
                break;
        }

    }

    // subroutine for matrix addition
    protected static void MatrixAddition() {
        System.out.print("Enter size of first matrix: ");
        //rows and cols of matrix A
        int rowA = scan.nextInt();
        int colA = scan.nextInt();
        //Matrix A
        int[][] matrixA = new int[rowA][colA];
        //loop for adding elements to matrix A
        System.out.println("Enter first matrix: ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter size of second matrix: ");
        //rows and cols of matrix B
        int rowB = scan.nextInt();
        int colB = scan.nextInt();
        //Matrix B
        int[][] matrixB = new int[rowA][rowB];
        //loop for adding elements to matrix A
        System.out.println("Enter second matrix: ");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = scan.nextInt();
            }
        }
        if (rowA != rowB || colA != colB) {
            System.out.println("ERROR");
        } else {
            System.out.println("Addition result is: ");
            //loop for output addiction result
            for (int i = 0; i < matrixA.length; i++) {
                System.out.println();
                for (int j = 0; j < matrixA[i].length; j++) {
                    System.out.print((matrixA[i][j] + matrixB[i][j]) + " ");
                }
            }
        }
    }

    // subroutine for multiplication Matrix elements by constant
    protected static void MatrixConstatnt() {
        //rows and cols of matrix
        System.out.println("Enter size of matrix: ");
        int row = scan.nextInt();
        int col = scan.nextInt();
        //matrix
        int[][] matrix = new int[row][col];
        System.out.println("Enter matrix: ");
        //loop for adding elements to matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        //constant
        System.out.println("Please enter constant: ");
        int consT = scan.nextInt();
        System.out.println("Constant multiplication result is: ");
        //loop for matrix multiplication by constant
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print((matrix[i][j] * consT) + " ");
            }
        }
    }

    // subroutine for matrix multiplication
    protected static void MatrixMultiplication() {
        System.out.print("Enter size of first matrix: ");
        //rows and cols of matrix A
        int rowA = scan.nextInt();
        int colA = scan.nextInt();
        //Matrix A
        int[][] matrixA = new int[rowA][colA];
        //loop for adding elements to matrix A
        System.out.println("Enter first matrix: ");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter size of second matrix: ");
        //rows and cols of matrix B
        int rowB = scan.nextInt();
        int colB = scan.nextInt();
        //Matrix B
        int[][] matrixB = new int[rowA][rowB];
        //loop for adding elements to matrix A
        System.out.println("Enter second matrix: ");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixB[i][j] = scan.nextInt();
            }
        }
        int[][] multiply =new int[colA][rowB];
        int sum = 0;
        if (colA == rowB) {
            //loop for multiplication of matrices
            for (int i = 0; i < rowA; i++) {
                System.out.println();
                for (int j = 0; j < colB; j++) {
                    for (int z = 0; z < rowB; z++){
                       sum +=  matrixA[i][z] * matrixB[z][j];
                    }
                    multiply[i][j] = sum;
                    sum = 0;
                }
            }
        } else {
            System.out.println("ERROR");
        }
        System.out.println("Result of Matrices multiplication are: ");
        for (int i = 0; i < multiply.length; i++){
            System.out.println();
            for(int j = 0; j < multiply[i].length; j++){
                System.out.print(multiply[i][j] + " ");
            }
        }
    }

}
