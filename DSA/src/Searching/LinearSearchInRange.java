package Searching;

public class LinearSearchInRange {
    static void main() {
        int[] array = {1,4,23,78,56,42,18,34,62,22};
        int result = linearSearch(array,56,1,5);
        System.out.println(result);

    }

    static int linearSearch(int[] arr, int target ,int start, int end){
        if(arr.length==0) {
            return -1;
        }
        for(int index=start;index<=end;index++){
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
