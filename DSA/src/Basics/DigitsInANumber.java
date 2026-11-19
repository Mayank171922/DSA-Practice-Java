package Basics;

import java.util.Scanner;

public class DigitsInANumber {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        while(n>0){
            count++;
            n = n/10;
        }

        System.out.println(count);
    }
}
