package model;

import java.util.*;

public class Parking<T> extends Subject implements Comparable<Parking>{

    private String code;
    public String name;
    public int capacity = 15;
    public Set<T> parkedVehicles = new HashSet<>();
    public Queue<T> waitingVehicles = new LinkedList<>();
    public List<TollGate> tollGates = new ArrayList<>();
    public State state;

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
        this.state = new OpenState();
        System.out.println(state.getMessage(this));
    }

    public Integer calculateTotalPrice(){
        Integer price=0;
       for(T v : parkedVehicles){
            if(v instanceof UnregisteredTruck){
                price += ((UnregisteredTruck) v).payTollGate();
            }else if(v instanceof  UnregisteredCar){
                price += ((UnregisteredCar) v).payTollGate();
            }
       }

        return price;
    }

    public void park(T v){
        if(parkedVehicles.size() >= capacity){
            waitingVehicles.add(v);
            System.out.println("Parking is full. " + waitingVehicles.size() + " cars waiting");
            this.state = new CloseState();
            System.out.println(state.getMessage(this));
        }else{
            parkedVehicles.add(v);
            System.out.println("Parking has " + parkedVehicles.size() + " cars parked.");
        }
        notifyObservers();
    }

    public void exit(T v){
        parkedVehicles.remove(v);
        if(!waitingVehicles.isEmpty()){
            parkedVehicles.add(waitingVehicles.poll());
            System.out.println("Parking has " + parkedVehicles.size() + " cars parked. " + waitingVehicles.size() + " cars waiting.");
        }
        this.state = new OpenState();
        System.out.println(state.getMessage(this));
        notifyObservers();
    }

    @Override
    public int compareTo(Parking parking) {
        if(this.parkedVehicles.size() < parking.parkedVehicles.size()){
            return 1;
        }else if(this.parkedVehicles.size() > parking.parkedVehicles.size()){
            return -1;
        }
        return 0;
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: getObservers()){
            obs.update("Parking has " + getFreeSpots().toString() + " free spots.");
        }
    }

    public Integer getFreeSpots(){
        return capacity - parkedVehicles.size();
    }

}
