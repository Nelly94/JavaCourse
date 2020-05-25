package model;

public class Application {

    public static void main(String[] args){

        Parking pkg = new Parking("001", "first parking");

        RegisteredCar rc = new RegisteredCar("Peugeot");
        pkg.add(rc);
        System.out.println("Registered Car " + rc.brand + " created with id " +  rc.id);
        RegisteredCar rc1 = new RegisteredCar("Peugeot");
        pkg.add(rc1);
        System.out.println("Registered Car " + rc1.brand + " created with id " +  rc1.id);
        UnregisteredCar uc = new UnregisteredCar("Peugeot");
        pkg.add(uc);
        System.out.println("Unregistered Car " + uc.brand + " created with id " +  uc.id);
        UnregisteredCar uc1 = new UnregisteredCar("Peugeot");
        pkg.add(uc1);
        System.out.println("Unregistered Car " + uc1.brand + " created with id " +  uc1.id);
        RegisteredTruck rt = new RegisteredTruck("Peugeot");
        pkg.add(rt);
        System.out.println("Registered Truck " + rt.brand + " created with id " +  rt.id);
        RegisteredTruck rt1 = new RegisteredTruck("Peugeot");
        pkg.add(rt1);
        System.out.println("Registered Truck " + rt1.brand + " created with id " +  rt1.id);
        UnregisteredTruck ut = new UnregisteredTruck("Peugeot");
        pkg.add(ut);
        System.out.println("Unregistered Truck " + ut.brand + " created with id " +  ut.id);
        UnregisteredTruck ut1 = new UnregisteredTruck("Peugeot");
        pkg.add(ut1);
        System.out.println("Unregistered Truck " + ut1.brand + " created with id " +  ut1.id);

        System.out.println(pkg.vehicles.size() + " vehicles, unregistered total cost is: " + pkg.calculateTotalPrice());

    }

    private static void printInfo(Vehicle v) {
        System.out.println("Registered Car " + v.brand + " created with id " +  v.id);
    }
    
}
