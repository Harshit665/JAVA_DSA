package Array.TwoPointer;
import Utility.InputArray;
import Utility.PrintArray;
import Utility.SwapArray;

public class TwoPointers {

    static int[] sortZeroAndOnes(int[] arr){
        int noOfZeroes = 0;
        int n = arr.length;
        for (int i=0;i<n;i++){
            if (arr[i]==0){
                noOfZeroes++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < noOfZeroes) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        return arr;
    }

    static int[] zeroOnes(int[] arr){
        int left =0;
        int right = arr.length-1;
        while (left < right){
            if (arr[left] == 1 && arr[right] == 0){
                SwapArray.swapArray(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] == 0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        // first method
       int[] arr = InputArray.inputArray();
//        sortZeroAndOnes(arr);
//        PrintArray.printArray(arr);

        // second method
        zeroOnes(arr);
        PrintArray.printArray(arr);
    }
}
