package patterns;

import java.util.Scanner;

public class HollowDiamond {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = n/2 + 1;
        int space = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*\t");
            }
            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }
            for(int l=1;l<=star;l++){
                System.out.print("*\t");
            }
            if(i<=n/2){
                star--;
                space+=2;
            }
            else{
                star++;
                space-=2;
            }
            System.out.println();

        }

    }
}
