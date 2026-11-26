/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication65;

public class JavaApplication64 {

    public static void main(String[] args) {

        Car c1 = new Car("BMW", "320i", 2022, 4);

        Motorcycle m1 = new Motorcycle("Honda", "CBR", 2023, 600);

        System.out.println("----- CAR DETAILS -----");
        c1.displayDetails();

        System.out.println("\n----- MOTORCYCLE DETAILS -----");
        m1.displayDetails();

        System.out.println("\n----- RENTAL PRICES -----");

        System.out.println("Car price: " +
                c1.calculateRentalPrice(3));

        System.out.println("Motorcycle price: " +
                m1.calculateRentalPrice(3));


        System.out.println("\n----- WITH DISCOUNT -----");

        System.out.println("Car with discount: " +
                c1.calculateRentalPrice(3, 10));

        System.out.println("Motorcycle with discount: " +
                m1.calculateRentalPrice(3, 10));

 
        System.out.println("\n----- OBJECTS -----");

        System.out.println(c1);
        System.out.println(m1);
    }
}


class Vehicle {

    String brand;
    String model;
    int year;

    Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    String getBrand() {
        return brand;
    }

    void setBrand(String brand) {
        this.brand = brand;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    double calculateRentalPrice(int days) {
        return 0;
    }


    double calculateRentalPrice(int days, double discount) {
        double price = calculateRentalPrice(days);
        return price - (price * discount / 100);
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                ", Model: " + model +
                ", Year: " + year;
    }
}


class Car extends Vehicle {

    int numberOfDoors;

    Car(String brand, String model, int year, int numberOfDoors) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    double calculateRentalPrice(int days) {
        return days * 100;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Number of Doors: " + numberOfDoors;
    }
}

class Motorcycle extends Vehicle {

    int engineCapacity;

    Motorcycle(String brand, String model, int year, int engineCapacity) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
    }

    @Override
    double calculateRentalPrice(int days) {
        return days * 50;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Engine Capacity: " + engineCapacity;
    }
}

