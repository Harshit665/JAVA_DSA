package Array.Prefix_Sufffix;
import Utility.*;

import java.util.Scanner;

public class Queries {

    static int[] prefSum(int[] arr){
        for (int i =1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int [] arr = new int[n+1];
        for (int i = 1;i<=n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("enter number of queries");
        int q = sc.nextInt();
        int[] arr1 = prefSum(arr);
        while (q-- > 0){
            System.out.println("enter range");
            int l = sc.nextInt();
            int r = sc.nextInt();

            int ans = arr1[r] - arr1[l-1];
            System.out.println(ans);
        }
    }
}
