package Searching;

public class LinearSearch3 {
    static void main() {
        int[] array = {1,4,7,64,23,51,46,89,25,34};
        int target = 46;
        boolean result = linearSeacrh2(array,target);
        System.out.println(result);
    }

    static boolean linearSeacrh2(int[] arr,int target ){
        if(arr.length==0){
            return false;
        }

        for(int element : arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }
}
