package model;

import java.util.Objects;

public abstract class Vehicle implements Cloneable {

    private static int count=0;

    public long id;
    public String brand;
    public int gaz = 100;
    public String plate;

    public Vehicle(String brand, String plate){
        id = count++;
        this.brand = brand;
        this.plate = plate;
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

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(plate, vehicle.plate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(plate);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", gaz=" + gaz +
                ", plate='" + plate + '\'' +
                '}';
    }
}
