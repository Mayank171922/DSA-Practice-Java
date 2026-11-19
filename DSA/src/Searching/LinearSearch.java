package Searching;

import org.jetbrains.annotations.Contract;

public class LinearSearch {

    static void main() {
        int[] array = {1,4,23,78,56,42,18,34,62,22};
        int result = linearSearch(array,22);
        System.out.println(result);

    }

    static int linearSearch(int[] arr, int target){
        if(arr.length==0) {
            return -1;
        }
            for(int index=0;index<arr.length;index++){
                int element = arr[index];
                if(element == target){
                    return index;
                }
            }
        //This line will execute if none of the return statements above have executed
        //hence the target is not present in the array
        return -1;
    }

}
