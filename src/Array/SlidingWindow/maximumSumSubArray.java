package Array.SlidingWindow;
import Utility.*;
import java.util.Scanner;

public class maximumSumSubArray {

    static int maxSubarraySum(int[] arr, int k){
        int i=0;
        int j=0;
        int sum = 0;
        int mx = Integer.MIN_VALUE;

        while (j < arr.length){
            sum = sum + arr[j];
            if (j - i + 1 < k){
                j++;
            } else if (j -i +1 == k) {
                mx = Math.max(sum,mx);
                sum = sum - arr[i];
                j++;
                i++;
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] arr = InputArray.inputArray();
        System.out.println("enter the window size");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int ans = maxSubarraySum(arr,k);
        System.out.println(ans);
    }
}
