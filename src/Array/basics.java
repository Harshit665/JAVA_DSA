package Array;
import Utility.PrintArray;

import java.util.Scanner;

public class basics {

    static int noOfPair(int[] arr){
        System.out.println("enter the target");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] + arr[j] == x){
                    count++;
                }
            }
        }
        System.out.println(x);
        return x;
    }

    static int unique(int[] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i] == arr[j]){
                    arr[i] = arr[j] = Integer.MIN_VALUE;
                }
            }
        }
        int ans = Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            ans = arr[i];
        }
        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {

       int[] array = {1,3,9,3,0,4,0,3,7,9,25};
        //basics
//      noOfPair(array);

        // unique
//      unique(array);
    }
}
