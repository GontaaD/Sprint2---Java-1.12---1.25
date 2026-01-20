package org.tasks.Object.Task2;

public class Car {
    String brand;
    int speed;

    public Car(String brand){
        this.brand=brand;
        this.speed=0;
    }

    public void accelerate(int value){
        if(value<0) {
            System.out.println("Wrong input");
            return;
        }
        speed+=value;
    }

    public void printSpeed(){
        System.out.printf("Current speed = %s%n",speed);
    }
}
