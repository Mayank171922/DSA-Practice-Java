package collectionframework;

import java.util.SortedSet;
import java.util.TreeSet;

public class SSortedSet {

    static void main() {

        SortedSet<Integer> ss = new TreeSet<Integer>((a,b)->b-a);

        ss.add(1);
        ss.add(25);
        ss.add(50);
        ss.add(75);
        ss.add(100);

        System.out.println(ss);


    }
}
