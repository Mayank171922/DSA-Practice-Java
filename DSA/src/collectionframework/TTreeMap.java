package collectionframework;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TTreeMap {
    static void main() {

        NavigableMap<Integer,String> map = new TreeMap<>();

//        NavigableMap<String,Integer> map1 = new TreeMap<>();
//        map1.put("Mayank",1);
//        map1.put("Abahy",2);
//        map1.put("Vivek",3);
//        map1.put("Sourabh",4);
//        map1.put("Yogendra",5);
//
//        System.out.println(map1);



        map.put(1,"Mayank");
        map.put(5,"Abahy");
        map.put(3,"Vivek");
        map.put(2,"Mayank");
        map.put(4,"Yogendra");



        Set<Map.Entry<Integer,String>> set = map.entrySet();
        for(Map.Entry<Integer,String> entry : set){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }

//        System.out.println(map.descendingMap());

        //System.out.println(map);

//        System.out.println(map.firstEntry());
//
//        System.out.println(map.lastEntry());
//
//        System.out.println(map.ceilingEntry(3).getValue());
//
//        System.out.println(map);

    }
}
