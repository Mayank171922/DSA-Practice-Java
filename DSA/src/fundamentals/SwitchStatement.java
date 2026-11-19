package fundamentals;

import java.util.Scanner;

public class SwitchStatement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        //String fruit = sc.next();

       /* switch(fruit){
            case "Mango" :
                System.out.println("King of fruits");
                break;

            case "Apple" :
                System.out.println("A sweet red fruit");
                break;

            case "Banana" :
                System.out.println("A long fruit");
                break;

            case "Orange" :
                System.out.println("A orange coloured fruit");
                break;

            default:
                System.out.println("Enter a valid fruit");
        }
*/

        //ENHANCED SWITCH STATEMENT

        /*
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Banana" -> System.out.println("A long fruit");
            case "Orange" -> System.out.println("A orange coloured fruit");
            default -> System.out.println("Enter a valid fruit");
        }
         */

        //ENHANCED SWITCH FOR DAYS IN WEEK

        int day = sc.nextInt();

//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Enter a valid day!");
//        }

        switch (day){
            case 1,2,3,4,5 -> System.out.println("Weekday");
            case 6,7 -> System.out.println("Weekend");
        }


    }
}
