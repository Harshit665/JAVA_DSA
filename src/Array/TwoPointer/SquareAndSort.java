package Array.TwoPointer;
import Utility.*;

public class SquareAndSort {

    static int[] squareAndSort(int[] arr){
        int left=0;
        int right = arr.length-1;
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;
        while (arr[left] <= arr[right]){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k] = arr[left] * arr[left];
                k++;
                left++;
            }
            else {
                ans[k] = arr[right] * arr[right];
                k++;
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = InputArray.inputArray();
        PrintArray.printArray(arr);
        System.out.println();
        int[] ans = squareAndSort(arr);
        int st = 0;
        int end = ans.length-1;
        ReverseArray.reverseArray(ans,st,end);
        PrintArray.printArray(ans);
    }
}
