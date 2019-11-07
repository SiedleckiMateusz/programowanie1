package pl.mateusz.siedlecki.programowanie1.JavaStart.Mapy;

import java.util.HashMap;

public class Company {
    HashMap<String, Employee> myEmployees = new HashMap<>();



    public void addEmployee(Employee em){
        String key = em.getFirstName()+" "+em.getLastName();
        myEmployees.put(key, em);
    }

    public Employee findEmployee(String key){
       return myEmployees.get(key);
    }


}
