package model;

import java.util.ArrayList;
import java.util.List;

public class Parking<T> {

    private String code;
    public String name;
    public int capacity = 15;
    public List<T> vehicles = new ArrayList<>();

    public Parking(String code, String name){
        this.code = code;
        this.name = name;
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
