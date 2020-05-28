package model;

public class CloseState implements State {
    @Override
    public String getMessage(Parking parking) {
        return "The parking is closed";
    }
}
