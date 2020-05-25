package model;

public class RegisteredCar extends Car {

    public RegisteredCar(String brand) {
        super(brand);
        System.out.println("Registered Car " + this.brand + " created with id: " + this.id);
    }
}
