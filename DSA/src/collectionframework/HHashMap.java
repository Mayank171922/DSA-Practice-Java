package collectionframework;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HHashMap {

    static void main() {

        Map<String,Integer> hsm  = new HashMap<>();
        hsm.put("Mayank",1);
        hsm.put("Abhay",2);
        hsm.put("Vivek",3);
        hsm.put("Sourabh",4);
        hsm.put("Yogendra",5);

        System.out.println(hsm.getOrDefault("Aman",8));

         //Create new Entry
         hsm.computeIfAbsent("Akshay",Key-> 5);

         //Updates existing Entry
         hsm.computeIfPresent("Akshay",(k,v)-> v + 5);

        //Combination of computeIfAbsent() & computeIfPresent();
        hsm.compute("Ayush", (k, v) -> v == null ? 7 : v + 1);

        //Iterating over HashMap using Set
        Set<Map.Entry<String,Integer>> entrySet  = hsm.entrySet();
        for(Map.Entry<String,Integer> entry : entrySet){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        //Another way of iterating over set using KeySet
//        Set<String> keySet = hsm.keySet();
//        for(String key : keySet){
//            System.out.println(key+","+hsm.get(key));
//        }

        //System.out.println(hsm.size());

        //System.out.println(entrySet);


        //System.out.println(hsm);
    }
}
