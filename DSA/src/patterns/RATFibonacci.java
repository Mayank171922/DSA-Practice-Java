package patterns;

import java.util.Scanner;

public class RATFibonacci {
    static void main() {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) { //THIS LOOP DOES ALL THE WORK(PRINTING STAR)
                System.out.print(a+"\t");
                int c = a + b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}
