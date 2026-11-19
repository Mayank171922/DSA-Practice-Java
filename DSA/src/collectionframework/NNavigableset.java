package collectionframework;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NNavigableset {
    static void main() {

        NavigableSet<Integer> nvg = new TreeSet<>();

        nvg.add(1);
        nvg.add(23);
        nvg.add(47);
        nvg.add(56);
        nvg.add(78);
        nvg.add(99);

        System.out.println(nvg.lower(56));
        System.out.println(nvg.higher(1));
        System.out.println(nvg.floor(77));
        System.out.println(nvg.ceiling(48));

    }
}
