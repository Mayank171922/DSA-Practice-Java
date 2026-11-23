package Searching;

import java.util.Arrays;

public class SearchIn2DArray {
    static void main() {
        int[][] array = {
                {1, 5, 7, 9, 6},
                {2, 8, 45, 63},
                {44, 57},
                {19, 37, 53, 28}
        };
        int target = 58;
        int[] ans = searchIn2D(array,target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchIn2D(int[][] arr, int target){

        if(arr.length==0){
            return new int[]{-1,-1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }

        return new int[]{-1,-1};
    }
}