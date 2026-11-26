package exceptionhandling;

import java.sql.SQLOutput;

public class TryWithMultipleCatch {

    static void main() {

        try {
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
