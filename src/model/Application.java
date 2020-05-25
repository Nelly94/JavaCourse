package model;

public class Application {

    public static void main(String[] args){

        Parking<Car> carPkg = new Parking("001", "cars parking");
        Parking<Truck> truckPkg = new Parking("002", "trucks parking");
        Parking pkg = new Parking("000", "generic parking");

        RegisteredCar rc = new RegisteredCar("Peugeot");
        carPkg.add(rc);
        pkg.add(rc);

        RegisteredCar rc1 = new RegisteredCar("Peugeot");
        carPkg.add(rc1);
        pkg.add(rc1);

        UnregisteredCar uc = new UnregisteredCar("Peugeot");
        carPkg.add(uc);
        pkg.add(uc);

        UnregisteredCar uc1 = new UnregisteredCar("Peugeot");
        carPkg.add(uc1);
        pkg.add(uc1);

        RegisteredTruck rt = new RegisteredTruck("Peugeot");
        truckPkg.add(rt);
        pkg.add(rt);

        RegisteredTruck rt1 = new RegisteredTruck("Peugeot");
        truckPkg.add(rt1);
        pkg.add(rt1);

        UnregisteredTruck ut = new UnregisteredTruck("Peugeot");
        truckPkg.add(ut);
        pkg.add(ut);

        UnregisteredTruck ut1 = new UnregisteredTruck("Peugeot");
        truckPkg.add(ut1);
        pkg.add(ut1);

        System.out.println(pkg.vehicles.size() + " vehicles, unregistered total cost is: " + pkg.calculateTotalPrice());

        System.out.println("Parking all: " + pkg.vehicles.size());
        System.out.println("Parking cars: " + carPkg.vehicles.size());
        System.out.println("Parking trucks: " + truckPkg.vehicles.size());

    }

}
