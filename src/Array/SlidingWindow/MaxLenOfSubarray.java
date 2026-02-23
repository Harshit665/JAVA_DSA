package Array.SlidingWindow;
import  Utility.*;
import java.util.Scanner;

public class MaxLenOfSubarray {

    static int maximumLenghtOfSubArray(int[] arr, int k){
        int i=0;
        int j=0;
        int maxLenght = 0;
        int sum = 0;

        while (j < arr.length){
            sum = sum + arr[j];

            while (sum > k){
                sum = sum - arr[i];
                i++;
            }
            if (sum == k){
                maxLenght = Math.max(maxLenght,j-i+1);
            }
            j++;
        }
        return maxLenght;
    }

    public static void main(String[] args) {
        int[] arr = InputArray.inputArray();
        System.out.println("enter sum");
        Scanner sc = new Scanner((System.in));
        int k = sc.nextInt();
        int ans = maximumLenghtOfSubArray(arr,k);
        System.out.println(ans);
    }
}
