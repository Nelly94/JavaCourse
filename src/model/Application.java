package model;

public class Application {

    public static void main(String[] args){

        Parking pkg = new Parking("001", "first parking");

        RegisteredCar rc = new RegisteredCar("Peugeot");
        pkg.add(rc);
        
        RegisteredCar rc1 = new RegisteredCar("Peugeot");
        pkg.add(rc1);

        UnregisteredCar uc = new UnregisteredCar("Peugeot");
        pkg.add(uc);

        UnregisteredCar uc1 = new UnregisteredCar("Peugeot");
        pkg.add(uc1);

        RegisteredTruck rt = new RegisteredTruck("Peugeot");
        pkg.add(rt);

        RegisteredTruck rt1 = new RegisteredTruck("Peugeot");
        pkg.add(rt1);

        UnregisteredTruck ut = new UnregisteredTruck("Peugeot");
        pkg.add(ut);

        UnregisteredTruck ut1 = new UnregisteredTruck("Peugeot");
        pkg.add(ut1);

        System.out.println(pkg.vehicles.size() + " vehicles, unregistered total cost is: " + pkg.calculateTotalPrice());

    }

}
