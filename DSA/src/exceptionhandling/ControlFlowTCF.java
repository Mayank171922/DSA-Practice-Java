package exceptionhandling;

public class ControlFlowTCF {
    static void main() {

        try{
            System.out.println(10/0);
            System.out.println(15/3);
            System.out.println(12/3);
        }
        catch (Exception e){
            System.out.println(10/0);
        }
        finally {
            System.out.println(10/0);
        }

        System.out.println("End");
    }
}
