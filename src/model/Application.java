package model;

public class Application {

    public static void main(String[] args){

        RegisteredCar car1 = new RegisteredCar("Ford", "AAAX2");
        RegisteredCar car2 = new RegisteredCar("Ford", "AAAX2");
        System.out.println(car1 == car2);
        System.out.println(car1.equals(car2));



    }

}
