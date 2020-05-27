package model;

public class Application {

    public static void main(String[] args){

        VehicleFactory carFactory = new CarFactory();
        VehicleFactory truckFactory = new TruckFactory();

        carFactory.createRegisteredVehicle("Ford", "ABC12");
        truckFactory.createUnregisteredVehicle("Toyota", "RGS78");

    }

}
