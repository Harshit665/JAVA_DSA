package Array;

import java.util.HashMap;

public class MajorityElement {

    static int majorityElement(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0) + 1);

            if (hm.get(arr[i]) > (arr.length/2));{
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        System.out.println(majorityElement(arr));
    }
}
