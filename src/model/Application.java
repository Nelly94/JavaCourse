package model;

import java.util.*;

public class Application {

    public static void main(String[] args){

        Map<String, List<Parking>> departmentMap = new HashMap<>();
        departmentMap.put("Nice's parkings", Arrays.asList(new Parking("PKG1", "Port"), new Parking("PKG2", "Massena")));

        for(Map.Entry<String, List<Parking>> entry : departmentMap.entrySet()){
            System.out.println("Department: " + entry.getKey());
            for(Parking pkg : entry.getValue()){
                System.out.println("- " + pkg.name);
            }
        }

        Iterator<String> it = departmentMap.keySet().iterator();
        while(it.hasNext()) {
            String department = it.next();
            System.out.println("Department: " + department);
            List<Parking> pkgList = departmentMap.get(department);
            for(Parking pk : pkgList){
                System.out.println("- " + pk.name);
            }
        }


    }

}
