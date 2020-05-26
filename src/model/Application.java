package model;

public class Application {

    public static void main(String[] args){

        Parking pkg1 = new Parking("PKG1", "Big parking");
        pkg1.park(new UnregisteredCar("Ford", "1234"));
        pkg1.park(new UnregisteredTruck("Ford", "2345"));
        pkg1.park(new UnregisteredCar("Ford", "3456"));
        pkg1.park(new UnregisteredCar("Ford", "4567"));
        pkg1.park(new UnregisteredCar("Ford", "1111"));
        pkg1.park(new UnregisteredTruck("Ford", "2222"));
        pkg1.park(new UnregisteredCar("Ford", "3333"));
        pkg1.park(new UnregisteredCar("Ford", "4444"));
        pkg1.park(new UnregisteredTruck("Ford", "5555"));
        pkg1.park(new UnregisteredCar("Ford", "6666"));
        pkg1.park(new UnregisteredCar("Ford", "7777"));
        pkg1.park(new UnregisteredCar("Ford", "8888"));
        pkg1.park(new UnregisteredTruck("Ford", "9999"));
        pkg1.park(new UnregisteredCar("Ford", "0000"));
        UnregisteredCar uc = new UnregisteredCar("Ford", "0101");
        pkg1.park(uc);

        pkg1.park(new UnregisteredCar("Ford", "2121"));
        pkg1.park(new UnregisteredCar("Ford", "2323"));

        pkg1.exit(uc);



    }

}
