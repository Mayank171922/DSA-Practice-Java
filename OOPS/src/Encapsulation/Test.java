package Encapsulation;

public class Test {
   public static void main() {

       //Car car = new Car();
       //car.setSpeed(110);
       //car.drive();

       BankAccount ba = new BankAccount();
       ba.setBalance(5000);
       ba.deposite(500);

       System.out.println(ba.getBalance());

    }
}
