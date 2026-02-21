package Sorting;
import Utility.PrintArray;

public class mergeSort {
    static void merge(int[] arr, int l, int mid, int r){
        int n1 = mid -l +1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        for (j=0;j<n2;j++){
            right[j] = arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while (i<n1 && j<n2){
            if (left[i]<= right[j]){
                arr[k] = left[i];
                i++;
                k++;
            }
            else {
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while (i < n1){
            arr[k] = left[i];
            k++;
            i++;
        }
        while (j < n2){
            arr[k] =right[j];
            k++;
            j++;
        }
    }

    static void MergeSort(int[] arr,int l,int r){
        if (l>=r){
            return;
        }
        int mid = (l+r)/2;
        MergeSort(arr,l,mid);
        MergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static void main(String[] args) {
        int[] arr = {1,9,3,0,2,4,8,3,6,37,};
        MergeSort(arr,0,arr.length-1);
        PrintArray.printArray(arr);
    }
}
