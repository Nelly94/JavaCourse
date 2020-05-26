package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {

    public static void main(String[] args){

        Parking pkg1 = new Parking("PKG1", "Port");
        Parking pkg2 = new Parking("PKG2", "Massena");

        Map<String, List<Parking>> departmentMap = new HashMap<>();
        List<Parking> nicesPkgs = new ArrayList<>();
        nicesPkgs.add(pkg1);
        nicesPkgs.add(pkg2);
        departmentMap.put("Nice's parkings", nicesPkgs);

        for(Map.Entry<String, List<Parking>> entry : departmentMap.entrySet()){
            System.out.println("Department: " + entry.getKey());
            for(Parking pkg : entry.getValue()){
                System.out.println("- " + pkg.name);
            }
        }


    }

}
