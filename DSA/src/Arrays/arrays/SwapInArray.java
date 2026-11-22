package Arrays.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SwapInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i]=sc.nextInt();

        }

        System.out.println(Arrays.toString(array));

        swap(array,1,5);

        System.out.println(Arrays.toString(array));
    }

    static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
