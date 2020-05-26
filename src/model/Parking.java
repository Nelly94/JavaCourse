package model;

import java.util.ArrayList;
import java.util.List;

public class Parking<T> implements Comparable<Parking>{

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

        public TollGate(Direction direction, Orientation orientation){
            this.direction = direction;
            this.orientation = orientation;
            this.id = Parking.this.code + "#" + "door-" + Parking.this.tollGates.size();
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
        this.tollGates.add(new TollGate(Direction.IN, Orientation.EAST));
        this.tollGates.add(new TollGate(Direction.OUT, Orientation.SOUTH));

        System.out.println(name + " gates");
        for(TollGate tg: tollGates) {
            System.out.println("--Gate: " + tg.id);
        }
    }

    public Integer calculateTotalPrice(){
        Integer price=0;
       for(T v : vehicles){
            if(v instanceof UnregisteredTruck){
                price += ((UnregisteredTruck) v).payTollGate();
            }else if(v instanceof  UnregisteredCar){
                price += ((UnregisteredCar) v).payTollGate();
            }
       }

        return price;
    }

    public void add(T v){
        vehicles.add(v);
    }

    @Override
    public int compareTo(Parking parking) {
        if(this.vehicles.size() < parking.vehicles.size()){
            return 1;
        }else if(this.vehicles.size() > parking.vehicles.size()){
            return -1;
        }
        return 0;
    }
}
