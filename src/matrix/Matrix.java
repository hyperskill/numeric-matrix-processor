package matrix;

import java.math.BigInteger;
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
        System.out.println("4. Transpose matrix");
        System.out.println("5. Calculate a determinant");
        System.out.println("6. Inverse matrix");
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
            case 4:
                MatrixTransposeMenu();
                break;
            case 5:
                determinantInputMatrix();
                break;
            case 6:
                InverseMatrix();
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
        int[][] multiply = new int[colA][rowB];
        int sum = 0;
        if (colA == rowB) {
            //loop for multiplication of matrices
            for (int i = 0; i < rowA; i++) {
                System.out.println();
                for (int j = 0; j < colB; j++) {
                    for (int z = 0; z < rowB; z++) {
                        sum += matrixA[i][z] * matrixB[z][j];
                    }
                    multiply[i][j] = sum;
                    sum = 0;
                }
            }
        } else {
            System.out.println("ERROR");
        }
        System.out.println("Result of Matrices multiplication are: ");
        for (int i = 0; i < multiply.length; i++) {
            System.out.println();
            for (int j = 0; j < multiply[i].length; j++) {
                System.out.print(multiply[i][j] + " ");
            }
        }
    }

    protected static void MatrixTransposeMenu() {
        System.out.println("1. Main diagonal");
        System.out.println("2. Side diagonal");
        System.out.println("3. Vertical line");
        System.out.println("4. Horizontal line");
        System.out.print("Your chouce: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                MatrixTransposeMain();
                break;
            case 2:
                MatrixTransposeSide();
                break;
            case 3:
                MatrixTransposeVertical();
                break;
            case 4:
                MatrixTransposeHorizontal();
                break;
        }
    }

    protected static void MatrixTransposeMain() {
        System.out.print("Enter size of matrix: ");
        //rows and cols of matrix
        int row = scan.nextInt();
        int col = scan.nextInt();
        //Matrix A
        int[][] matrix = new int[row][col];
        //loop for adding elements to matrix A
        System.out.println("Enter matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int[][] transposedMatrix = new int[col][row];
        //loop for transposing Matrix by Main diagonal
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(transposedMatrix[i][j] + " ");
            }
        }
    }

    //write this method !!!!!
    protected static void MatrixTransposeSide() {
        System.out.print("Enter size of matrix: ");
        //rows and cols of matrix
        int row = scan.nextInt();
        int col = scan.nextInt();
        //Matrix A
        int[][] matrix = new int[row][col];
        //loop for adding elements to matrix A
        System.out.println("Enter matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int[][] transposeSide = new int[row][col];
        //loop for transposing Matrix by Side diagonal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
            }
        }
    }

    protected static void MatrixTransposeVertical() {
        System.out.print("Enter size of matrix: ");
        //rows and cols of matrix
        int row = scan.nextInt();
        int col = scan.nextInt();
        //Matrix A
        Integer[][] matrix = new Integer[row][col];
        //loop for adding elements to matrix A
        System.out.println("Enter matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        //loop for transposing Matrix by  Vertical
        for (int i = 0; i < matrix.length; i++) {
            Arrays.sort(matrix[i], Collections.reverseOrder());
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

    }

    protected static void MatrixTransposeHorizontal() {
        System.out.print("Enter size of matrix: ");
        //rows and cols of matrix
        int row = scan.nextInt();
        int col = scan.nextInt();
        //Matrix A
        int[][] matrix = new int[row][col];
        //loop for adding elements to matrix A
        System.out.println("Enter matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        int[][] transposeHorisontal = new int[row][];
        //loop for transposing Matrix by  Horizontal
        int counter = 1;
        for (int i = 0; i < matrix.length; i++) {
            transposeHorisontal[matrix.length - counter] = matrix[i];
            if (counter < matrix.length) {
                counter++;
            }
        }
        for (int i = 0; i < transposeHorisontal.length; i++) {
            System.out.println();
            for (int j = 0; j < transposeHorisontal[i].length; j++) {
                System.out.print(transposeHorisontal[i][j] + " ");
            }
        }
    }

    //Method for calculation of determinant of Matrix.
    public static BigInteger determinant(final int[][] matr) {

        int n = matr.length;
        BigInteger[][] a = new BigInteger[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = BigInteger.valueOf(matr[i][j]);
            }
        }

        BigInteger prime = BigInteger.probablePrime(n + 4, new Random());

        BigInteger det = BigInteger.ONE;

        for (int row = 0; row < n; ++row) {
            int currentRow = row;
            while (currentRow < n && a[currentRow][row].equals(BigInteger.ZERO)) {
                ++currentRow;
            }
            if (currentRow == n) {
                return BigInteger.ZERO;
            }

            if (currentRow != row) {
                det = det.negate();
                BigInteger[] tmp = a[currentRow];
                a[currentRow] = a[row];
                a[row] = tmp;
            }

            BigInteger inverse = a[row][row].modInverse(prime);

            for (currentRow = row + 1; currentRow < n; ++currentRow) {
                if (a[currentRow][row].equals(BigInteger.ZERO)) {
                    continue;
                }
                BigInteger coefficient = a[currentRow][row].multiply(inverse).remainder(prime);
                for (int column = row; column < n; ++column) {
                    a[currentRow][column] = a[currentRow][column].subtract(a[row][column].multiply(coefficient).remainder(prime)).remainder(prime);
                }
            }

        }

        for (int i = 0; i < n; ++i) {
            det = det.multiply(a[i][i]).remainder(prime);
        }
        det = det.add(prime);
        det = det.remainder(prime);
        if (det.multiply(BigInteger.valueOf(2)).compareTo(prime) > 0) {
            det = prime.subtract(det).remainder(prime);
        }
        return det;
    }

    public static void determinantInputMatrix() {
        System.out.print("Enter size of matrix: ");
        //rows and cols of matrix
        int row = scan.nextInt();
        int col = scan.nextInt();
        //Matrix A
        int[][] matrix = new int[row][col];
        //loop for adding elements to matrix
        System.out.println("Enter matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        System.out.println(determinant(matrix));
    }

    public static void InverseMatrix() {
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the dimension of square matrix: ");
            int n = input.nextInt();
            double a[][] = new double[n][n];
            System.out.println("Enter the elements of matrix: ");
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    a[i][j] = input.nextDouble();

            double d[][] = invert(a);

            System.out.println("The inverse is: ");
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    System.out.print(d[i][j] + "  ");
                }
                System.out.println();
            }
            input.close();
        }
    }

    public static double[][] invert(double a[][]) {
        int n = a.length;
        double x[][] = new double[n][n];
        double b[][] = new double[n][n];
        int index[] = new int[n];
        for (int i = 0; i < n; ++i)
            b[i][i] = 1;

        // Transform the matrix into an upper triangle
        gaussian(a, index);

        // Update the matrix b[i][j] with the ratios stored
        for (int i = 0; i < n - 1; ++i)
            for (int j = i + 1; j < n; ++j)
                for (int k = 0; k < n; ++k)
                    b[index[j]][k]
                            -= a[index[j]][i] * b[index[i]][k];

        // Perform backward substitutions
        for (int i = 0; i < n; ++i) {
            x[n - 1][i] = b[index[n - 1]][i] / a[index[n - 1]][n - 1];
            for (int j = n - 2; j >= 0; --j) {
                x[j][i] = b[index[j]][i];
                for (int k = j + 1; k < n; ++k) {
                    x[j][i] -= a[index[j]][k] * x[k][i];
                }
                x[j][i] /= a[index[j]][j];
            }
        }
        return x;
    }

// Method to carry out the partial-pivoting Gaussian
// elimination.  Here index[] stores pivoting order.

    public static void gaussian(double a[][], int index[]) {
        int n = index.length;
        double c[] = new double[n];

        // Initialize the index
        for (int i = 0; i < n; ++i)
            index[i] = i;

        // Find the rescaling factors, one from each row
        for (int i = 0; i < n; ++i) {
            double c1 = 0;
            for (int j = 0; j < n; ++j) {
                double c0 = Math.abs(a[i][j]);
                if (c0 > c1) c1 = c0;
            }
            c[i] = c1;
        }

        // Search the pivoting element from each column
        int k = 0;
        for (int j = 0; j < n - 1; ++j) {
            double pi1 = 0;
            for (int i = j; i < n; ++i) {
                double pi0 = Math.abs(a[index[i]][j]);
                pi0 /= c[index[i]];
                if (pi0 > pi1) {
                    pi1 = pi0;
                    k = i;
                }
            }

            // Interchange rows according to the pivoting order
            int itmp = index[j];
            index[j] = index[k];
            index[k] = itmp;
            for (int i = j + 1; i < n; ++i) {
                double pj = a[index[i]][j] / a[index[j]][j];

                // Record pivoting ratios below the diagonal
                a[index[i]][j] = pj;

                // Modify other elements accordingly
                for (int l = j + 1; l < n; ++l)
                    a[index[i]][l] -= pj * a[index[j]][l];
            }
        }
    }
}
