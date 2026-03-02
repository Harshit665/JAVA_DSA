package Array.SlidingWindow;

public class KadaneAlgo {

    static int kadaneAlgo(int[] arr){
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i<arr.length;i++){
            currentSum += arr[i];
            maxSum = Integer.max(currentSum,maxSum);
            if (currentSum < 0){
                currentSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
         int[] arr = {1,2,3,4,5,};
         int ans = kadaneAlgo(arr);
        System.out.println(ans);
    }
}
