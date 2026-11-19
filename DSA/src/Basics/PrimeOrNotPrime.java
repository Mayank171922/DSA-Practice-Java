package Basics;

import java.util.Scanner;

public class PrimeOrNotPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            int count = 0;
            int m = sc.nextInt();

            for(int j=2;j*j<=m;j++){
                if(m%j==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("prime");
            }

            else{
                System.out.println("not prime");
            }
        }

    }
}
