package model;

import java.util.ArrayList;
import java.util.List;

public class Parking<T> {

    private String code;
    public String name;
    public int capacity = 15;
    public List<T> vehicles = new ArrayList<>();
    public List<TollGate> tollGates = new ArrayList<>();

    /**
     * Toll gate inner class
     */
    private class TollGate{

        public String id;
        public boolean enable = true;
        public Direction direction;
        public Orientation orientation;

        public TollGate(){

        }

    }

    /**
     * Enums inner classes
     */
    private enum Direction{
        IN,
        OUT,
        INOUT
    }

    private enum Orientation{
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public Parking(String code, String name){
        this.code = code;
        this.name = name;
        TollGate tg1 = new TollGate();
        this.tollGates.add(tg1);
        tg1.direction = Direction.IN;
        tg1.orientation = Orientation.EAST;
        tg1.id = code + "#" + "door-" + this.tollGates.size();
        TollGate tg2 = new TollGate();
        this.tollGates.add(tg2);
        tg2.direction = Direction.OUT;
        tg2.orientation = Orientation.SOUTH;
        tg2.id = code + "#" + "door-" + this.tollGates.size();

        System.out.println(name + " gates");
        for(TollGate tg: tollGates) {
            System.out.println("--Gate: " + tg.id);
        }
    }

    public String calculateTotalPrice(){
        Integer price=0;
       for(T v : vehicles){
            if(v instanceof UnregisteredTruck){
                price += ((UnregisteredTruck) v).payTollGate();
            }else if(v instanceof  UnregisteredCar){
                price += ((UnregisteredCar) v).payTollGate();
            }
       }

       return price.toString() + "EUR";
    }

    public void add(T v){
        vehicles.add(v);
    }
}
