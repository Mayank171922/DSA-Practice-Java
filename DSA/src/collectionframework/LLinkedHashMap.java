package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LLinkedHashMap {

    static void main() {

        Map<Integer,String> lhm = new LinkedHashMap<>();

        lhm.put(1,"Mango");
        lhm.put(3,"Apple");
        lhm.put(10,"Kiwi");
        lhm.put(5,"Watermelon");
        lhm.put(4,"Banana");



        Set<Map.Entry<Integer,String>> entrySet = lhm.entrySet();
        for(Map.Entry<Integer,String> entry : entrySet){
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }
    }
}
