//Andrew Magarelli
package ball;
import java.util.Scanner;

public class matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the first matrix
        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();

        // Initialize the first matrix
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the numbers of the first matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input dimensions of the second matrix
        int rows2, cols2;
        while (true) {
            System.out.print("Enter the number of rows for the second matrix: ");
            rows2 = scanner.nextInt();
            System.out.print("Enter the number of columns for the second matrix: ");
            cols2 = scanner.nextInt();

            // Check if dimensions match
            if (rows1 == rows2 && cols1 == cols2) {
                break; // Exit loop if dimensions match
            } else {
                System.out.println("Dimensions do not match. Please enter again.");
            }
        }

        // Initialize the second matrix
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the numbers of the second matrix:");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Add the matrices
        int[][] resultMatrix = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Display the result
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}