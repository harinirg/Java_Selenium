package com.polymorphism;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Truck extends Vehicle {
    void run() {
        System.out.println("Truck is running");
    }
}

public class Overriding {

    public static void main(String[] args) {

        Vehicle obj1 = new Vehicle();
        obj1.run();

        Vehicle obj2 = new Truck();
        obj2.run();
    }
}