package Utility;
import Utility.PrintArray;

import java.util.Scanner;

public class InputArray {

    public static int[] inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = inputArray();
        PrintArray.printArray(arr);
    }
}
