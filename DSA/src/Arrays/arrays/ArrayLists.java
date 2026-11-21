package Arrays.arrays;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayLists{

    static void main() {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList();

//        list.add(4);
//        list.add(5);
//        list.add(89);
//        list.add(45);
//        list.add(47);
//        list.add(56);
//        list.add(87);
//        list.add(43);

//        System.out.println(list.size());

        //INPUT USING SCANNER CLASS
        for (int i = 0; i < 8; i++) {
            list.add(sc.nextInt());
            
        }
        
        

       System.out.println(list);

//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//
//        }

    }
}
