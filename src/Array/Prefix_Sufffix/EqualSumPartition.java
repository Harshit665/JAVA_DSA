package Array.Prefix_Sufffix;

public class EqualSumPartition {

    static Boolean partition(int[] arr){
        int totalSum = 0;
        for (int i=0;i<arr.length;i++){
            totalSum = totalSum + arr[i];
        }
        int prefSum = 0;
        for (int i=0;i<arr.length;i++){
            prefSum = prefSum + arr[i];
            int suffixSum = totalSum - prefSum;
            if (prefSum == suffixSum){
                return true;
                 }
            }
        return false;
        }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1};
        Boolean bool = partition(arr);
        System.out.println(bool);
    }
}
