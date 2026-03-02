package Array.SlidingWindow;

public class MaximumSubArraySum {

    static int maximumSumSubArray(int[] arr){
        int maxsum = Integer.MIN_VALUE;

        for (int st=0;st<arr.length;st++){
            int currrentSum = 0;
            for (int end = st;end<arr.length;end++){
                currrentSum += arr[end];
                maxsum = Integer.max(maxsum,currrentSum);
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int ans = maximumSumSubArray(arr);
        System.out.println(ans);
    }
}
