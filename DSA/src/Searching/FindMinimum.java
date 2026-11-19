package Searching;

import java.util.Arrays;

public class FindMinimum {
    static void main() {
        int[] array = {18,2,7,9,6,4,3,1,8,5};
        int result = findMinimum(array);
        System.out.println(Arrays.toString(array));
        System.out.println(result);
    }

    static int findMinimum(int[] arr){
        int min = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
