package model;

public class OpenState implements State {
    @Override
    public String getMessage(Parking parking) {
        return "The parking has " + parking.getFreeSpots() + " free spots";
    }
}
