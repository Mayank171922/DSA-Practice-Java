package patterns;

import java.util.Scanner;

public class RightAngleTriangle {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){ //THIS LOOP DOES ALL THE WORK(PRINTING STAR)
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
