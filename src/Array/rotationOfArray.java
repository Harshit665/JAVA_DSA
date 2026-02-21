package Array;
import Utility.PrintArray;
import Utility.ReverseArray;

public class rotationOfArray {

    static int[] rotateByKtimes(int[] arr,int k){
        PrintArray.printArray(arr);
        System.out.println();
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i=n-k;i<n;i++){
            ans[j] = arr[i];
            j++;
        }
        for (int i=0;i<n-k;i++){
            ans[j] = arr[i];
            j++;
        }
        PrintArray.printArray(ans);
        return ans;
    }

    static void rotateUsingSwap(int[] arr,int k){
        int n = arr.length;
        k = k % n;
        PrintArray.printArray(arr);
        System.out.println();
        ReverseArray.reverseArray(arr,0,n-k-1);
        ReverseArray.reverseArray(arr,n-k,n-1);
        ReverseArray.reverseArray(arr,0,n-1);
        PrintArray.printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // rotation using another array
        // rotateByKtimes(arr,2);

        // In place rotation
        rotateUsingSwap(arr,2);
    }
}
