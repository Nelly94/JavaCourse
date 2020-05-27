package model;

public class Application {

    public static void main(String[] args) throws CloneNotSupportedException {

        VehicleFactory carFactory = VehicleFactory.getFactory(VehicleType.CAR);
        VehicleFactory truckFactory = VehicleFactory.getFactory(VehicleType.TRUCK);

        carFactory.createRegisteredVehicle("Ford", "ABC12");
        truckFactory.createUnregisteredVehicle("Toyota", "RGS78");

        VehicleCache vCache = new VehicleCache();
        vCache.loadCache();

        Vehicle v = vCache.getVehicle("ABC12");
        System.out.println(v.toString());

    }

}
