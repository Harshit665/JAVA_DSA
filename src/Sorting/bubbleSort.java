package Sorting;
import Utility.SwapArray;
import Utility.PrintArray;

public class bubbleSort {

    static void BubbleSort(int[] arr){
        for (int i = 0;i<arr.length - 1; i++){
            for (int j = 0; j< arr.length-i-1;j++){
                if (arr[j]> arr[j+1]){
                    SwapArray.swapArray(arr,j,j+1);
                }
            }
        }
        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] a = {1,8,6,7,9,31,6,};
        BubbleSort(a);
    }
}
