package Basics;

import java.util.Scanner;

public class AllPrimeBtwRange {

        static void main(){

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the starting number of Range:");
            int low = sc.nextInt();
            System.out.print("Enter the ending number of Range:");
            int high = sc.nextInt();

            for(int i=low;i<=high;i++){
                int count = 0;

                for(int j=2;j*j<=i;j++){
                    if(i%j==0){
                        count++;
                        break;
                    }
                }
                if(count==0){
                    System.out.println(i);
                }
            }

        }
    }



