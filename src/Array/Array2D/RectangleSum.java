package Array.Array2D;

import java.util.Scanner;

public class RectangleSum {

    static int findSum(int[][] matrix,int l1,int r1,int l2,int r2){
        int sum = 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number of rows and column");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalEl = r*c;
        System.out.println("enter" + totalEl + "elements");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println();
    }
}
