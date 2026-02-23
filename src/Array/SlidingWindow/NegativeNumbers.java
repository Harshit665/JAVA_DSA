package Array.SlidingWindow;

import Utility.InputArray;
import java.util.ArrayList;
import java.util.Scanner;

public class NegativeNumbers {

    static ArrayList<Integer> negativeNumbers(int[] arr, int k) {

        int i = 0;
        int j = 0;

        ArrayList<Integer> negatives = new ArrayList<>(); // stores negatives in window
        ArrayList<Integer> result = new ArrayList<>();    // stores answer

        while (j < arr.length) {

            // STEP 1: add negative number to helper list
            if (arr[j] < 0) {
                negatives.add(arr[j]);
            }

            // STEP 2: window size not reached
            if (j - i + 1 < k) {
                j++;
            }

            // STEP 3: window size reached
            else if (j - i + 1 == k) {

                // store first negative of current window
                if (negatives.size() == 0) {
                    result.add(0);
                } else {
                    result.add(negatives.get(0));
                }

                // STEP 4: remove element going out of window
                if (arr[i] < 0) {
                    negatives.remove(0);
                }

                // STEP 5: slide window
                i++;
                j++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = InputArray.inputArray();

        System.out.println("Enter window size:");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        ArrayList<Integer> ans = negativeNumbers(arr, k);

        System.out.println("First negative number in each window:");
        System.out.println(ans);
    }
}