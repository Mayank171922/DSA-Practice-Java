package Arrays.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        //INPUT IN ARRAYS
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        //OUTPUT

        //NORMAL FOR LOOP
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]+" ");
//        }

        //toString METHOD
        //System.out.println(Arrays.toString(array));

        //FOR EACH LOOP
        for(int element:array){
            System.out.print(element+" ");
        }


    }
}
