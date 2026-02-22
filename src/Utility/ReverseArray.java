package Utility;
import Utility.SwapArray;

public class ReverseArray {

   public static int[] reverseArray(int[] arr,int st,int end){
        while ( st <= end){
            SwapArray.swapArray(arr,st,end);
            st++;
            end--;
        }
        return arr;
    }
}
