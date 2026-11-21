package Arrays.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDArrayList {
    static void main() {
        Scanner sc  = new Scanner(System.in);

        ArrayList<ArrayList<Integer>>list = new ArrayList<>();

        //INITIALIZATION OF ARRAYLISTS IS ARRAYLIST
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }

        //ADDING ELEMENTS IN EACH ARRAYLIST
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(sc.nextInt());
            }

        }

        System.out.println(list);
    }
}
