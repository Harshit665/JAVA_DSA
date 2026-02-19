package hashmap;

import java.util.*;

public class maxFrequency {
    public static void main(String[] args) {
        Map<Integer,Integer> freq = new HashMap<>();
        int[] arr = {1,2,3,1,2,1,4,4,4,4,3,9,5,4,6,4,3,6,4,2};
        for (int el: arr){
            if (!freq.containsKey(el)){
                freq.put(el,1);
            }
            else {
                freq.put(el,freq.get(el) + 1);
            }
        }
        System.out.println("frequency of each element is ");
        System.out.println(freq.entrySet());
        int maxFreq = 0;
        int ansKey = 0;
        for (var e: freq.entrySet()){
            if (e.getValue() > maxFreq){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }
        System.out.println("the max freq key is " + ansKey);
        System.out.println("the freq is " + maxFreq);
    }
}
