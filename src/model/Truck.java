package model;

public abstract class Truck extends Vehicle{

    public Truck(String brand) {
        super(brand);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
}
