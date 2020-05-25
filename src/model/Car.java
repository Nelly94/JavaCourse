package model;

import java.util.Scanner;

public abstract class Car extends Vehicle{

    private static int count=0;

    private final int id;
    public String brand;
    {
        id = count++;
        System.out.print("Car brand? ");
        Scanner sc = new Scanner(System.in);
        brand = sc.next();
    }

    public Car() {
        //this.id = count++;
    }

    public int getId() {
        return id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }
}
