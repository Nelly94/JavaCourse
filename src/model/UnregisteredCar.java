package model;

public final class UnregisteredCar extends Car implements TollGatePayable{

    public UnregisteredCar(String brand, String plate) {
        super(brand, plate);
        //System.out.println("Unregistered Car " + this.brand + " created with id: " + this.id);
    }

    @Override
    public int payTollGate() {
        return 3;
    }
}
