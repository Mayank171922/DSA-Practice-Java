package Searching;

import java.util.Scanner;

public class EvenNoOfDigits {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int result = findEvenDigits(array);
        System.out.println(result);
        
    }

    static  int findEvenDigits(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int count = 0;

        for(int element : arr){
            if(isEven(element)){
               count++;
            }
        }

        return count;
    }

    static boolean isEven(int element){
        int numberOfDigits = digits(element);
        if(numberOfDigits%2==0){
            return true;
        }
        return false;
    }

    static int digits(int number){

        if(number<0){
            number = number * -1;
        }

        int count = 0;

        if(number==0){
            return 1;
        }

        while(number>0){
            count++;
            number = number/10;
        }

        return count;
    }
}
