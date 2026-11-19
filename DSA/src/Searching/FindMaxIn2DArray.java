package Searching;

import java.util.Arrays;

public class FindMaxIn2DArray {
    static void main() {
        int[][] array = {
                {1,5,7,9,6},
                {2,8,45,63},
                {44,57},
                {19,37,53,28}
        };
        int ans = maxIn2DArray(array);
        System.out.print(ans);
    }

    static int maxIn2DArray(int[][] arr){

        int max = Integer.MIN_VALUE;

        for(int[] row : arr){
            for(int col : row){
                if(col>max){
                    max = col;
                }
            }
        }
        return max;
    }
}
