package Array.Array2D;

import Utility.Input2dArray;
import Utility.Print2dArray;

public class ArrayMultiplication {

    static int[][] multiply(int[][] a,int r1,int c1,int[][] b,int r2,int c2){
        if (c1 != r2){
            System.out.println("multiplication not possible");
            return null;
        }
        int[][] ans = new int[r1][c2];

        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                //multiplication here
                for (int k =0;k<c1;k++){
                ans[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("first matrix");
        int[][] arr1 = Input2dArray.input2dArray();
        Print2dArray.print2dArray(arr1);
        System.out.println("second array");
        int[][] arr2 = Input2dArray.input2dArray();
        Print2dArray.print2dArray(arr2);

        int[][] ans = multiply(arr1,2,3,arr2,3,2);
        Print2dArray.print2dArray(ans);
    }
}
