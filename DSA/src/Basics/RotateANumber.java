package Basics;

import java.util.Scanner;

public class RotateANumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int temp = n;
        int nod = 0;

        while(temp>0){
            temp = temp/10;
            nod++;
        }
        k = k % nod; //if k=7 and nod = 5 then only (2) digit have to rotate
        if(k<0){
            k = k + nod; //if k  is negative then we will add nod to k because (-4) will be equal to (+1)
        }

        int div = 1;
        int mul = 1;
        for(int i=1;i<=nod;i++){
            if(i<=k){
                div *= 10;
            }
            else{
                mul *= 10;
            }
        }

        int r = n % div;
        int q = n / div;

        int rot = r * mul + q;

        System.out.println(rot);




    }
}
