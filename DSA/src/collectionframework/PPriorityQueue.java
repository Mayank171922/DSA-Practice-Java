package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PPriorityQueue {
    static void main() {

        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyCustomComparator());

        pq.offer(1);
        pq.offer(100);
        pq.offer(2);
        pq.offer(0);


        List<Integer> l = new ArrayList<>();
        int index =0;
        while(!pq.isEmpty()){
            if(index==2){
                break;
            }
            l.add(pq.poll());
            index++;

        }
        System.out.println(l);
        System.out.println(pq);
    }
}
