package collectionframework;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class StudentsMarks implements Comparable<StudentsMarks> {

    private int math;
    private int physics;

    public String toString(){
        return "StudentMarks[maths="+ math +", physics=" + physics + "]";
    }

    public int getMath(){
        return math;
    }

    public int getPhysics(){
        return physics;
    }

    public StudentsMarks(int mahtMarks,int physicsMarks){
        this.math=mahtMarks;
        this.physics=physicsMarks;
    }


    @Override
    public int compareTo(@NotNull StudentsMarks o) {

        System.out.println("Compareto() is called");
        return o.math - this.math;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentsMarks that = (StudentsMarks) o;
        return math == that.math && physics == that.physics;
    }

    @Override
    public int hashCode() {
        return Objects.hash(math, physics);
    }
}
