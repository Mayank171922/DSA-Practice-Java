package patterns;

import java.util.Scanner;

public class ValleyNumbered {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2*n - 3;
        int star = 1;
        for(int i = 1;i<=n;i++){
            int val = 1;
            for(int j=1;j<=star;j++){
                System.out.print(val+"\t");
                    val++;

            }
            for(int k=1;k<=space;k++){
                System.out.print("\t");
            }
            if(i==n){
                star--;
                val--;
            }
            for(int l=1;l<=star;l++){
                val--;
                System.out.print(val+"\t");

            }
                space-=2;
                star++;

            System.out.println();

        }
    }
}
