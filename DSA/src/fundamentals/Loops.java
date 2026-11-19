package fundamentals;

import java.util.Scanner;

public class Loops {

    static void main() {

        Scanner sc = new Scanner(System.in);

//        int x = sc.nextInt();
//        while(x!=5){
//            System.out.println("Mayank");
//            x++;
//        }

                char ch = ' ';

                while (ch != 'x') {
                    System.out.println("Hello, World!");

                    System.out.print("Press x to stop or any other key to continue: ");
                    ch = sc.next().charAt(0);
                }

                System.out.println("Program stopped!");
            }

}
