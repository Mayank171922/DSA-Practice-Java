package collectionframework;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityComperable {

    static void main() {
        List<StudentsMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentsMarks(70,45));
        stMarks.add(new StudentsMarks(80,55));
        stMarks.add(new StudentsMarks(50,65));
        stMarks.add(new StudentsMarks(80,75));
        stMarks.add(new StudentsMarks(90,85));

        //here we used StudentsMarks class implementing Comparable interface for custom ordering
        PriorityQueue<StudentsMarks> spq = new PriorityQueue<>(stMarks);

        List<StudentsMarks> top3 = new ArrayList<>();
        int count = 0;
        while(!spq.isEmpty()){
            if(count==3){
                break;
            }
            top3.add(spq.poll());
            count++;
        }

        System.out.println(top3);

    }
}
