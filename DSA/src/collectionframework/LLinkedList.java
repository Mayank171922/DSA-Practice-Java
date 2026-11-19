package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LLinkedList{
    static void main() {

        LinkedList<Integer> lk = new LinkedList<>();

        lk.add(1);
        lk.add(2);
        lk.add(3);
        lk.add(4);

        ListIterator<Integer> listIt = lk.listIterator();


        System.out.println(listIt.next());
        System.out.println(listIt.next());
        System.out.println(listIt.previous());

    }
}
