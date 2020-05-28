package model;

public class ParkingInfoApi extends Observer {

    public String url;

    public ParkingInfoApi(String url) {
        this.url = url;
    }

    @Override
    public void update(String message) {
        System.out.println("ParkingInfoApi:");
        System.out.println("Parking has " + message + " free spots");
    }
}
