package Basics;

import java.util.Scanner;

public class NthFibonacciNum {

    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 0;

        for(int i=1;i<=n;i++){

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println(a);

    }
}
