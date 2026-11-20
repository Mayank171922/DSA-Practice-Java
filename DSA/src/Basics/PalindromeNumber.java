package Basics;

import java.util.Scanner;

public class PalindromeNumber {

    static void main() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ans = isPalindrome(n);
        System.out.println(ans);

    }

    static  boolean isPalindrome(int n){
        int num = 0;
        int temp = n;
        while(temp>0){
            int rem = temp % 10;
            num = num * 10 + rem;
            temp /= 10;
        }

        return num==n;
    }
}
