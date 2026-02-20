package Utility;

public class SwapArray {
    public static void swapArray(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
