package Searching;

import java.util.Arrays;

public class FindMaxIn2DArray {
    static void main() {
        int[][] array = {
                {1,5,7,9,6},
                {2,8,45,63},
                {44,57},
                {19,37,88,96}
        };
        int ans = maxIn2DArray(array);
        System.out.print("The maximum element in Array = " + ans);
    }

    static int maxIn2DArray(int[][] arr ){
        int max = Integer.MIN_VALUE;
        if(arr.length==0){
            return max;
        }

        for(int[] array : arr){
            for(int element : array){
                if(element>max){
                    max = element;
                }
            }
        }
        return max;
    }


    }

