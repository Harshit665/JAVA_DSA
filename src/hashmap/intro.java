package hashmap;

import java.util.HashMap;
import java.util.Map;

public class intro {

    public static void hashMapMethods(){
        Map<String,Integer> mp = new HashMap<>();
        mp.put("harshit",21);
        mp.put("kesharwani",2000);

        System.out.println(mp.get("harshit"));
        System.out.println(mp.get("kesharwani"));
    }
    public static void main(String[] args) {
        hashMapMethods();
    }
}
