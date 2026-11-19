package collectionframework;

import java.util.ArrayList;
import java.util.List;

public class AArrayList {

    static void main() {
        List<Integer> alist = new ArrayList<>();

        alist.add(1);
        alist.add(2);
        alist.add(3);
        alist.add(4);
        alist.add(5);

        //System.out.println(alist.set(0,45));

        List<Integer> alist2 = new ArrayList<>(alist);

        //List<Integer> alist3 = new ArrayList<>(alist.subList(1,4));
        List<Integer> alist3 = alist.subList(1,5);
        alist3.set(2,53);
        alist3.add(25);

        Integer [] arr = alist.toArray(new Integer[0]);

        for(int x : arr){
            System.out.print(x+",");
        }


        //System.out.println(alist);
        //System.out.println(alist2);
        //System.out.println(alist3);




    }
}
