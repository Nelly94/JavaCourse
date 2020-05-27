package model;

public class VehicleFactory {

    public Vehicle createVehicle(VehicleType type, String brand, String plate){
        Vehicle v = null;
        switch(type){
            case REGISTEREDCAR:
                v = new RegisteredCar(brand, plate);
                break;
            case REGISTEREDTRUCK:
                v = new RegisteredTruck(brand, plate);
                break;
            case UNREGISTEREDCAR:
                v = new UnregisteredCar(brand, plate);
                break;
            case UNREGISTEREDTRUCK:
                v = new UnregisteredTruck(brand, plate);
                break;
        }

        return v;
    }
}
