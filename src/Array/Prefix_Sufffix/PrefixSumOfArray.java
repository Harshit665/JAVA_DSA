package Array.Prefix_Sufffix;
import Utility.*;

public class PrefixSumOfArray {

    static int[] prefixSum(int[] arr){
        for (int i=1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = InputArray.inputArray();
        System.out.println("before");
        PrintArray.printArray(arr);
        System.out.println("after");
        int[] ans = prefixSum(arr);
        PrintArray.printArray(ans);
    }
}
