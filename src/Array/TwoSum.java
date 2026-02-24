package Array;

import Utility.PrintArray;

import java.util.HashMap;

public class TwoSum {

    static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (mp.containsKey(complement)) {
                return new int[]{mp.get(complement), i};
            }

            mp.put(arr[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,7,5};
        int[] ans = twoSum(arr,12);
        PrintArray.printArray(ans);
    }
}
