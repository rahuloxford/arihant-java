package com.codewithrahul.basic;

public class Oops {
    public static void main(String[] args) {

        Car car1 = new Car("Audi", "R8", 5000000);
//        car1.car_details();

        Car car2 = new Car("BMW", "M4", 6500000);
        car2.car_details();

        Car car3 = new Car();

    }
}

class Car {
    String brand;
    String model;
    int price;

    Car (String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    Car () {

    }

    void car_details() {
        System.out.println(this.brand + " " + this.model);
        System.out.println("Costs around: " + this.price);
    }
}
