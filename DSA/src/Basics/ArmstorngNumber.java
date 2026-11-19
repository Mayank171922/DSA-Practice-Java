package Basics;

import java.util.Scanner;

public class ArmstorngNumber {

    static void main() {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();

        //boolean ans = isArmstrong(n);
        //System.out.println(ans);

        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }

    }

    static boolean isArmstrong(int n){
        int sum = 0;
        int temp = n;
        while(temp>0){
            int rem = temp % 10;
            sum = sum + rem*rem*rem;
            temp /= 10;
        }

        return sum==n;
    }
}
