package Sorting;
import Utility.SwapArray;
import Utility.PrintArray;

public class insertionSort {
    static void InserstionSort(int[] arr){
        for (int i=1;i<arr.length;i++){
            int j = i;
            while (j>0 && arr[j]<arr[j-1]){
                SwapArray.swapArray(arr,j,j-1);
                j--;
            }
        }
        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,9,6,3,0,4,8,3,6,9,6,34,89};
        InserstionSort(arr);
    }
}
