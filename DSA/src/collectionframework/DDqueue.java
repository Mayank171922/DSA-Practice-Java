package collectionframework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class DDqueue {

    static void main() {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.offerFirst(1);
        dq.offerFirst(2);
        System.out.println(dq);

        System.out.println(dq.pollLast());


        System.out.println(dq);

    }

}
