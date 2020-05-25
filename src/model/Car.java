package model;

public abstract class Car extends Vehicle{

    public Car(String brand) {
        super(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
}
