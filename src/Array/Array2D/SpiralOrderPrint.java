package Array.Array2D;

import java.util.Scanner;

public class SpiralOrderPrint {

    static void spiralOrderPrint(int[][] matrix,int r ,int c){
        int topRow = 0;
        int bottomRow = r-1;
        int rightColumn = c-1;
        int leftColumn = 0;
        int totalEl = 0;

        while (totalEl < r*c){
            // top row => left column to right column
            for (int j=leftColumn;j<=rightColumn;j++){
                System.out.println(matrix[topRow][j] + "");
                totalEl++;
            }
            topRow++;

            // right column => top row to bottom row
            for (int i=topRow;i<=bottomRow;i++){
                System.out.println(matrix[i][rightColumn] + "");
                totalEl++;
            }
            rightColumn--;

            // bottom row => right column to left column
            for (int j=rightColumn;j>=leftColumn;j--){
                System.out.println(matrix[bottomRow][j] + "");
                totalEl++;
            }
            bottomRow--;

            // left column => bottom row to top row
            for (int i=bottomRow;i>=topRow;i--){
                System.out.println(matrix[i][leftColumn] + "");
                totalEl++;
            }
            leftColumn++;
        }
    }

    static void printMatrix(int[][] matrix){
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("enter" + totalElements + "elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Input Matrix");
        printMatrix(matrix);
        System.out.println("spiral order");
        spiralOrderPrint(matrix,r,c);
    }
}
