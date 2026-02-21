package Sorting;
import Utility.SwapArray;
import Utility.PrintArray;


public class quickSort {

    static int Partition(int[] arr,int st,int end){
        int pivot = arr[st];
        int el_less_than_pivot = 0;
        for (int i=st+1;i<=end;i++){
            if (arr[i]<=pivot){
                el_less_than_pivot ++;
            }
        }
        int pivot_idx = st + el_less_than_pivot;
        SwapArray.swapArray(arr,st,pivot_idx);

        int i = st;
        int j= end;
        while (i<pivot_idx && j> pivot_idx){
            while (arr[i] <= pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if (i < pivot_idx && j> pivot_idx){
                SwapArray.swapArray(arr,i,j);
                i++;
                j--;
            }
        }
        return pivot_idx;
    }

    static void QuickSort(int[] arr, int st, int end){
        if (st>=end){
            return;
        }
        int partition_idx = Partition(arr,st,end);
        QuickSort(arr,st,partition_idx -1);
        QuickSort(arr,partition_idx+1,end);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,0,8,6,3,4,7,2,9,1,6,3,0};
        System.out.println("before");
        PrintArray.printArray(arr);
        QuickSort(arr,0,arr.length-1);
        System.out.println("after");
        PrintArray.printArray(arr);
    }
}
