package model;

public class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand, String plate) {
        super(brand, plate);
        System.out.println("Unregistered Truck " + this.brand + " created with id: " + this.id + " and plate nb: " + plate);
    }

    @Override
    public int payTollGate() {
        return 5;
    }
}
