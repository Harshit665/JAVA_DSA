package Array.Array2D;

import java.util.Scanner;

public class GenerateSpiralMatrix {

    static void printMatrix(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n-1;
        int rightColumn = n-1;
        int leftColumn = 0;
        int current = 1;

        while (current <= n*n){
            // top row => left column to right column
            for (int j=leftColumn;j<=rightColumn && current <= n*n;j++){
               matrix[topRow][j] = current++;
            }
            topRow++;

            // right column => top row to bottom row
            for (int i=topRow;i<=bottomRow && current <= n*n;i++){
                matrix[i][rightColumn] = current++;
            }
            rightColumn--;

            // bottom row => right column to left column
            for (int j=rightColumn;j>=leftColumn && current <= n*n;j--){
                matrix[bottomRow][j] = current++;
            }
            bottomRow--;

            // left column => bottom row to top row
            for (int i=bottomRow;i>=topRow && current <= n*n;i--){
                matrix[i][leftColumn] = current++;
            }
            leftColumn++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int[][] ans = generateSpiralMatrix(n);
        printMatrix(ans);
    }
}
