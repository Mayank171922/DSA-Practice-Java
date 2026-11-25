package Arrays.arrays;
import java.util.HashSet;
public class CheckIfDoubleExists {

    static void main() {
        int[] arr1 = {10,2,5,3};
        int[] arr2 = {3,7,1,4};

        System.out.println(checkIfExist(arr1));
        System.out.println(checkIfExist(arr2));

    }

    static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];

            if (set.contains(2 * x) || (x % 2 == 0 && set.contains(x / 2))) {
                return true;
            }
            set.add(x);
        }
        return false;
    }
}

