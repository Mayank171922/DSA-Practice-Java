package fundamentals;

import java.util.Scanner;

public class Functions {
    static void main(){
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int num1 = sc.nextInt();
//        System.out.print("Enter number 2: ");
//        int num2 = sc.nextInt();
//        System.out.println("sum method is processing the answer");
//        int ans = sum(num1,num2);
//        System.out.println(ans);

        String name = sc.nextLine();

        String greeting = customizedMessage(name);

        System.out.println(greeting);

    }

    //Function to return sum of 2 numbers
//    static int sum(int n1,int n2){
//
//        int sum = n1 + n2;
//        return sum;
//    }

    static String customizedMessage(String name){
        String message = "Helllo Mr." + name;
        return message;
    }

}
