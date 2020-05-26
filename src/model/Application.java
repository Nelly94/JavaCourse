package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Application {

    public static void main(String[] args){

        List<Parking> parkings = new ArrayList<>();

        Parking pkg3 = new Parking("PKG3", "Small parking");
        pkg3.add(new UnregisteredCar("Ford", "7890"));
        parkings.add(pkg3);

        Parking pkg1 = new Parking("PKG1", "Big parking");
        pkg1.add(new UnregisteredCar("Ford", "1234"));
        pkg1.add(new UnregisteredTruck("Ford", "2345"));
        pkg1.add(new UnregisteredCar("Ford", "3456"));
        pkg1.add(new UnregisteredCar("Ford", "4567"));
        parkings.add(pkg1);

        Parking pkg2 = new Parking("PKG2", "Medium parking");
        pkg2.add(new UnregisteredCar("Ford", "5678"));
        pkg2.add(new UnregisteredTruck("Ford", "6789"));
        parkings.add(pkg2);


        System.out.println("Default:");
        for(Parking pk : parkings){
            System.out.println("-" + pk.name);
        }

        System.out.println("Ordered:");
        Collections.sort(parkings);
        for(Parking pk : parkings){
            System.out.println("-" + pk.name + ": " + pk.vehicles.size());
        }

        System.out.println("Annonymous:");
        Collections.sort(parkings, (pk1, pk2) -> {
                if(pk1.calculateTotalPrice() < pk2.calculateTotalPrice()){
                    return 1;
                }else if(pk1.calculateTotalPrice() > pk2.calculateTotalPrice()){
                    return -1;
                }
                return 0;
            }
        );
        for(Parking pk : parkings){
            System.out.println("-" + pk.name + ": " + pk.calculateTotalPrice() + "EUR");
        }




    }

}
