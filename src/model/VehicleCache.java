package model;

import java.util.HashMap;

public class VehicleCache {

    private HashMap<String, Vehicle> vehicleMap =  new HashMap<>();

    public Vehicle getVehicle(String plate){
        return vehicleMap.get(plate);
    }

    public void loadCache() throws CloneNotSupportedException {
        System.out.println("Loading data...");

        UnregisteredCar uc1 = new UnregisteredCar("Ford", "ABC12");
        vehicleMap.put(uc1.plate, (Vehicle) uc1.clone());

        UnregisteredCar uc2 = new UnregisteredCar("Toyota", "ABC13");
        vehicleMap.put(uc2.plate, (Vehicle) uc2.clone());

        UnregisteredCar uc3 = new UnregisteredCar("Ford", "WHS87");
        vehicleMap.put(uc3.plate, (Vehicle) uc3.clone());

        System.out.println("Loaded");

    }

}
