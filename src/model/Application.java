package model;

public class Application {

    public static void main(String[] args){

        VehicleFactory vFactory = new VehicleFactory();
        Vehicle createdVehicle = vFactory.createVehicle(VehicleType.REGISTEREDTRUCK, "Nissan", "ABCD12");

    }

}
