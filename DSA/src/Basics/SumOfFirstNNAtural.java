package Basics;

import java.util.Scanner;

public class SumOfFirstNNAtural {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int ans = sumOfNaturalNumber(n);
        System.out.println("Sum of n natural number: " + ans);
    }

    static int sumOfNaturalNumber(int n){
        int sum = n * (n+1) / 2;

        return sum;
    }
}
