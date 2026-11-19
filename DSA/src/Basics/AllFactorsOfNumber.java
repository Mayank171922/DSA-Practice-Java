package Basics;

import java.util.Scanner;

public class AllFactorsOfNumber {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=1;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println(num);
    }
}
