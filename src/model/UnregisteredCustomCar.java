package model;

public class UnregisteredCustomCar extends UnregisteredCarDecorator{

    private int extraFees;
    private String comment;

    public UnregisteredCustomCar(UnregisteredCar car, int extraFees, String comment) {
        super(car);
        this.extraFees = extraFees;
        this.comment = comment;
    }

    @Override
    public int payTollGate(){
        return extraFees;
    }
}
