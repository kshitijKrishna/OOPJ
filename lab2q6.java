import java.util.Scanner;

public class lab2q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for a 3x3 matrix
        int[][] matrix = new int[3][3];
        System.out.println("Enter the elements of the 3x3 matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculating the sum of left and right diagonals
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;

        for (int i = 0; i < 3; i++) {
            // Left diagonal (top-left to bottom-right)
            leftDiagonalSum += matrix[i][i];

            // Right diagonal (top-right to bottom-left)
            rightDiagonalSum += matrix[i][2 - i];
        }

        // Displaying the matrix
        System.out.println("\nEntered Matrix:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Displaying the sum of diagonals
        System.out.println("\nSum of Left Diagonal: " + leftDiagonalSum);
        System.out.println("Sum of Right Diagonal: " + rightDiagonalSum);

        scanner.close();
    }
}