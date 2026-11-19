package Basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    static void main() {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int ans = 0;
            System.out.print("Enter the operator= ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op=='*' || op=='/' || op =='%'){
                System.out.print("Enter two numbers= ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                    ans = num1 + num2;}
                    else{
                        System.out.println("Invalid Operation!!");
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }

            }
            else if(op == 'x' || op=='X'){
                break;
            }
            else{
                System.out.println("Invalid Operation!!!");
            }
            System.out.println("Answer = "+ ans);
        }
    }
}
