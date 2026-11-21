package Arrays.arrays2D;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];

        //INPUT

        for (int row = 0; row < array.length ; row++) {
            for (int col = 0; col < array[row].length; col++) {
                array[row][col] = sc.nextInt();
            }

        }

        //OUTPUT

        //NORMAL LOOP
//        for (int row = 0; row < array.length; row++) {
//            for (int col = 0; col < array[row].length; col++) {
//                System.out.print(array[row][col]+" ");
//            }
//            System.out.println();
//
//        }

        //toString METHOD

//        for (int row = 0; row < array.length; row++) {
//            System.out.println(Arrays.toString(array[row]));
//        }

        //FOR EACH LOOP

//        for(int[] arr : array){
//            for(int element : arr){
//                System.out.print(element+" ");
//            }
//            System.out.println();
//        }

        //FOR EACH LOOP WITH toString METHOD
        for(int[] arr:array){
            System.out.println(Arrays.toString(arr));
        }


    }

}
