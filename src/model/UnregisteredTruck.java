package model;

public class UnregisteredTruck extends Truck implements TollGatePayable {

    public UnregisteredTruck(String brand) {
        super(brand);
        System.out.println("Unregistered Truck " + this.brand + " created with id: " + this.id);
    }

    @Override
    public int payTollGate() {
        return 5;
    }
}
