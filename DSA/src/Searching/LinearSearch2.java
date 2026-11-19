package Searching;

public class LinearSearch2 {
    static void main() {
        int[] array = {1,4,7,64,23,51,46,89,25,34};
        int target = 22;
        int result = linearSeacrh2(array,target);
        System.out.println(result);
    }

    static int linearSeacrh2(int[] arr,int target ){
        if(arr.length==0){
            return Integer.MAX_VALUE;
        }

        for(int element : arr){
            if(element==target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
}
