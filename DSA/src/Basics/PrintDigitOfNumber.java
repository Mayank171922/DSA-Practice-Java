package Basics;

import java.util.Scanner;

public class PrintDigitOfNumber {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nod = 0;
        int temp = n;

        while(temp!=0){
            temp =temp /10;
            nod++;
        }

        int div = (int) Math.pow(10,nod-1);

        while(div != 0){
            int dig = n / div;
            System.out.println(dig);
            n = n%div;
            div = div/10;
        }


    }
}
