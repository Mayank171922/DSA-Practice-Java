package patterns;

import java.util.Scanner;

public class InvertedMirroredRAT {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space =0;
        int star = n-space;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=space;j++){
                System.out.print("\t");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*"+"\t");
            }
            star--;
            space++;
            System.out.println();
        }
    }
}

