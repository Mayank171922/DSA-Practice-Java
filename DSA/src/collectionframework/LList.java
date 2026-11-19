package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class LList {
    static void main() {

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        System.out.println(list1);
        List<Integer> list2 = list1.subList(1,4);
        list2.add(3,47);
        System.out.println(list2);
        System.out.println(list1);

    }


}
