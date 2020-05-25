package model;

public final class RegisteredTruck extends Truck{

    public RegisteredTruck(String brand) {
        super(brand);
        System.out.println("Registered Truck " + this.brand + " created with id: " + this.id);
    }
}
