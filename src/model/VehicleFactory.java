package model;

public abstract class VehicleFactory {

    public abstract Vehicle createRegisteredVehicle(String brand, String plate);

    public abstract Vehicle createUnregisteredVehicle(String brand, String plate);

    public VehicleFactory getFactory(VehicleType type){
        if(type == VehicleType.CAR){
            return new CarFactory();
        }else{
            return new TruckFactory();
        }
    }
}
