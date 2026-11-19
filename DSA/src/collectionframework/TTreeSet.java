package collectionframework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TTreeSet {
    static void main() {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(1);
        ts.add(23);
        ts.add(47);
        ts.add(56);
        ts.add(78);
        ts.add(99);

        System.out.println(ts.lower(56));
        System.out.println(ts.higher(1));
        System.out.println(ts.floor(77));
        System.out.println(ts.ceiling(48));

    }
}
