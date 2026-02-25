package Utility;

import java.util.Scanner;

public class Input2dArray {

    public static int[][] input2dArray() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter " + (row * col) + " elements row-wise:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] ans = input2dArray();
        Print2dArray.print2dArray(ans);
    }
}