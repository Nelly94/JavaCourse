package model;

public class UnregisteredTrailedCar extends UnregisteredCarDecorator {

    private TrailSize trailSize;

    public UnregisteredTrailedCar(TrailSize trailSize, UnregisteredCar car) {
        super(car);
        this.trailSize = trailSize;
    }

    @Override
    public int payTollGate(){
        switch (trailSize) {
            case SMALL:
                return 1;
            case MEDIUM:
                return 3;
            case BIG:
                return 5;
        }
        return 0;
    }
}
