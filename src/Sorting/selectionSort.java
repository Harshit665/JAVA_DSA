package Sorting;
import Utility.SwapArray;
import Utility.PrintArray;

public class selectionSort {

    static void SelectionSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            int min_idx = i;
            for (int j=i+1;j<arr.length;j++){
                if (arr[j]<arr[min_idx]){
                    min_idx = j;
                }
            }
            if (min_idx != i){
                SwapArray.swapArray(arr,i,min_idx);
            }
        }
        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {-2,6,9,-6,1,0,5,6};
        SelectionSort(arr);
    }
}
