package patterns;

import java.util.Scanner;

public class Diamond {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int star = 1;
        int space = n/2;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<=n/2){
                star+=2;
                space--;
            }
            else{
                star-=2;
                space++;
            }
        }
    }
}
