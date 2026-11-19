package exceptionhandling;

import java.sql.SQLOutput;

public class DefaultExcepHandling {

//    static void main() {
//        doStuff();
//    }
//
//    public static void doStuff(){
//        doMoreStuff();
//    }
//
//    public static void doMoreStuff(){
//        System.out.println(10/0);
//    }

    //EXAMPLE 2

//    static void main() {
//        doStuff();
//    }
//
//    public static void doStuff(){
//        doMoreStuff();
//        System.out.println(10/0);
//    }
//
//    public static void doMoreStuff(){
//        System.out.println("Hello");
//    }

//    EXAMPLE 3

    static void main() {

        doStuff();
        System.out.println(10/0);

    }

    public static void doStuff(){
        doMoreStuff();
        System.out.println("Hi");
    }

    public static void doMoreStuff(){
        System.out.println("Hello");
    }

}
