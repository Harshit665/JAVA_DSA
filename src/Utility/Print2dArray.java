package Utility;

public class Print2dArray {

    public static void print2dArray(int[][] arr) {

        System.out.println("Matrix:");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}