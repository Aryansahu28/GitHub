import java.util.Scanner;

public class ass_c_4{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];

        // Method to choose how to fill the matrix
        System.out.println("Choose how to fill the matrix:");
        System.out.println("1. Enter matrix elements through keyboard");
        System.out.println("2. Initialize matrix in the program");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                // Input matrix elements through keyboard
                System.out.println("Enter matrix elements row by row:");
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        matrix[i][j] = scanner.nextInt();
                    }
                }
                break;
            case 2:
                // Initialize matrix in the program
                int[][] initializedMatrix = {
                        {1, 2, 3, 4, 5},
                        {6, 7, 8, 9, 10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20},
                        {21, 22, 23, 24, 25}
                };
                matrix = initializedMatrix;
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        // Display the matrix
        System.out.println("Matrix:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Calculate and display the determinant
        int determinant = calculateDeterminant(matrix);
        System.out.println("Determinant: " + determinant);
    }

    public static int calculateDeterminant(int[][] matrix) {
        int determinant = 0;
        for (int i = 0; i < 5; i++) {
            determinant += matrix[0][i] * cofactor(matrix, 0, i);
        }
        return determinant;
    }

    public static int cofactor(int[][] matrix, int row, int col) {
        int[][] minorMatrix = new int[4][4];
        int minorRow = 0;
        int minorCol = 0;
        for (int i = 0; i < 5; i++) {
            if (i != row) {
                minorCol = 0;
                for (int j = 0; j < 5; j++) {
                    if (j != col) {
                        minorMatrix[minorRow][minorCol] = matrix[i][j];
                        minorCol++;
                    }
                }
                minorRow++;
            }
        }
        return (int) Math.pow(-1, row + col) * calculateDeterminant(minorMatrix);
    }
}
