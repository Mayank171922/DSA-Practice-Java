package fundamentals;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedSwitch {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();


        switch(empID){
            case 1 :
                System.out.println("Mayank Shukla");
                break;

            case 2 :
                System.out.println("Aman Dhakad");
                break;

            case 3 :
                String department = sc.next();
                System.out.println("Employee number 3");
                switch (department){
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("Management Department");
                        break;

                    default:
                        System.out.println("No Department entered");
                }
                break;
            default:
                System.out.println("Not a valid empID");
        }


        //ENHANCED

        /*
        switch (empID) {
            case 1 -> System.out.println("Mayank Shukla");
            case 2 -> System.out.println("Aman Dhakad");
            case 3 -> {
                String department = sc.next();
                System.out.println("Employee number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("Management Department");
                        break;

                    default:
                        System.out.println("No Department entered");
                }
            }
            default -> System.out.println("Not a valid empID");
        }
         */
    }
}
