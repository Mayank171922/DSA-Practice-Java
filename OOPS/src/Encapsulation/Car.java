package Encapsulation;

public class Car {

    private int speed;
    private String color;

    void drive(){
        System.out.println("Driving");
    }

    void setSpeed(int speed){
        this.speed = speed;
    }
}
