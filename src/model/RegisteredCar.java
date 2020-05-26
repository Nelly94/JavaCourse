package model;

public class RegisteredCar extends Car {

    public RegisteredCar(String brand, String plate) {
        super(brand, plate);
        System.out.println("Registered Car " + this.brand + " created with id: " + this.id + " and plate nb: " + plate);
    }
}
