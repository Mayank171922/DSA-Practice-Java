package Basics;

import java.util.Scanner;

public class PrimrFactorization {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();

        for(int div=2;div*div<=n;div++){
            while(n % div==0){
                System.out.println(div);
                n = n/div;
            }
        }
        if(n!=1){
            System.out.println(n);
        }
    }
}
