package model;

public class CitySign extends Observer {

    public int id;
    public String info;

    public CitySign(String info) {
        this.info = info;
    }

    @Override
    public void update(String message) {
        System.out.println("City sign: " + message);
    }
}
