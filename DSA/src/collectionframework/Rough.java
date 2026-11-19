package collectionframework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Rough {
    static void main() {

        //LIST

        List<Integer> list = new ArrayList<>();
        list.add(45);
        list.add(57);
        list.add(89);
        list.add(54);
        list.add(78);
        list.add(99);


        Collections.sort(list);

//        System.out.println(list.reversed());
//        System.out.println(list);

        //HASHSET

        HashSet<Integer> hs = new HashSet<Integer>();

        hs.add(1);
        hs.add(2);
        hs.add(8);
        hs.add(10);
        System.out.println(hs);

        System.out.println(hs.contains(10));
        System.out.println(hs.remove(10));
        hs.clear();
        System.out.println(hs);


    }
}
