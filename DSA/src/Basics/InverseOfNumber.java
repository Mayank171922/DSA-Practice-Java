package Basics;

import java.util.Scanner;

public class InverseOfNumber {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int inverse = 0;
        int number = 1;
        while(n>0){
            int dig = n % 10;

            inverse = (int) (inverse + number * Math.pow(10,dig-1));
            number++;
            n = n/10;
        }

        System.out.println(inverse);
    }
}
