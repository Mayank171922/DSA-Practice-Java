package collectionframework;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityComparator {

    static void main() {
        List<StudentsMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentsMarks(70,45));
        stMarks.add(new StudentsMarks(80,55));
        stMarks.add(new StudentsMarks(50,65));
        stMarks.add(new StudentsMarks(80,75));
        stMarks.add(new StudentsMarks(90,85));

        //Here we used custom comparator using lambda function
        PriorityQueue<StudentsMarks> spq = new PriorityQueue<StudentsMarks>((s1,s2)->
        {
            System.out.println("Compare() is called");
            return s2.getPhysics() - s1.getPhysics();
        });
        for(StudentsMarks sm : stMarks){
            spq.add(sm);
        }

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
