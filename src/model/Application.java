package model;

public class Application {

    public static void main(String[] args){

        Car c = new Car();
        System.out.println("Car " + c.brand + " created with id: " + c.getId());
        Car c1 = new Car();
        System.out.println("Car " + c1.brand + " created with id: " + c1.getId());
        Car c2 = new Car();
        System.out.println("Car " + c2.brand + " created with id: " + c2.getId());
        Car c3 = new Car();
        System.out.println("Car " + c3.brand + " created with id: " + c3.getId());
        Car c4 = new Car();
        System.out.println("Car " + c4.brand + " created with id: " + c4.getId());
    }
    
}
