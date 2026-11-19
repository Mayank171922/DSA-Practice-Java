package collectionframework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HHashSet {
    static void main() {

        List<StudentsMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentsMarks(70,45));
        stMarks.add(new StudentsMarks(80,55));
        stMarks.add(new StudentsMarks(50,65));
        stMarks.add(new StudentsMarks(80,75));
        stMarks.add(new StudentsMarks(90,85));

        Set<StudentsMarks> s1 = new HashSet<StudentsMarks>(stMarks);

        System.out.println(s1);
        System.out.println(s1.contains(new StudentsMarks(70,45)));
        Set<StudentsMarks> s3 = new HashSet<StudentsMarks>(s1);

        //s1.removeAll(s2);
        //System.out.println(s1);
        //System.out.println(s3);
    }
}
