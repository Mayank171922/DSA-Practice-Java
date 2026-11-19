package Basics;

import java.util.Scanner;

public class BenhjiminBulb {

    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=1;i*i<=n;i++){
            System.out.println(i*i);
        }
    }
}
