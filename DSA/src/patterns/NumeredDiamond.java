package patterns;

import java.util.Scanner;

public class NumeredDiamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n/2;
        int star = 1;
        int val = 1;

        for(int i =1;i<=n;i++){

            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            int cval = val;
            for(int k=1;k<=star;k++){
                System.out.print(cval+"\t");
                if(k<=star/2){
                    cval++;
                }
                else{
                    cval--;
                }
            }

            if(i<=n/2){
                star+=2;
                space--;
                val++;

            }
            else{
                star-=2;
                space++;
                val--;

            }
            System.out.println();
        }

    }
}
