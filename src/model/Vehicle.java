package model;

public abstract class Vehicle {

    private static int count=0;

    public long id;
    public String brand;
    public int gaz = 100;

    public Vehicle(String brand){
        id = count++;
        this.brand = brand;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getGaz() {
        return gaz;
    }

    public void setGaz(int gaz) {
        this.gaz = gaz;
    }
}
