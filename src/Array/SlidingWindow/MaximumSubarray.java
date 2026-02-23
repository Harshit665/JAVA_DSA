package Array.SlidingWindow;
import Utility.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubarray {

    // this algo is working for all condition but not working for strictly increasing order array.
    static ArrayList<Integer> maximumElementOfSubArray(int [] arr, int k){
        int i=0;
        int j=0;
        //ArrayList<Integer> maximum = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int max= 0;

        while (j < arr.length){

//            if (maximum.isEmpty()){
//                maximum.add(arr[j]);
//             }

            if (arr[j] > max){
                max = arr[j];
            }

            if (j-i+1 < k){
                j++;
            }

            if (j-i+1 == k){
                ans.add(max);
                i++;
                j++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = InputArray.inputArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("window size");
        int k = sc.nextInt();
        ArrayList<Integer> ans = maximumElementOfSubArray(arr,k);
        System.out.println(ans);
    }
}
