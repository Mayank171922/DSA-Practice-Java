package fundamentals;

import java.util.Arrays;

public class VariableLengthArgu {

    static void main() {
        print(1,2,7,6,4,89,45,62,56,23,99);
    }

    static void print(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
