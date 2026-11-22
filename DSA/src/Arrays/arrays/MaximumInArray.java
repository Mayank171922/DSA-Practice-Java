package Arrays.arrays;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MaximumInArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Maximum element in the array is "+maximum(array));
        System.out.println("Maximum element in the array between given range is "+maxInRange(array,0,2));
    }

    //MAXIMUM ELEMENT IN ARRAY BETWEEN A RANGE
    static int maxInRange(int[] arr,int start,int end){
        if(start>end){
            return -1;
        }
        if(arr == null){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }

    //MAXIMUM ELEMENT IN A ARRAY
    static int maximum(int[] arr){
        if(arr.length==0){
            return -1;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
