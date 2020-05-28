package model;

public abstract class UnregisteredCarDecorator implements TollGatePayable {

    public UnregisteredCar car;

    @Override
    public int payTollGate() {
        return 0;
    }

    public UnregisteredCarDecorator(UnregisteredCar car){
        this.car = car;
    }
}
