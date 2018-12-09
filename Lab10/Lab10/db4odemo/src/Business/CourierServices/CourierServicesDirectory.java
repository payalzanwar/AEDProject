/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CourierServices;

import Business.Manufacturer.*;
import java.util.ArrayList;

/**
 *
 * @author Vaishali Tripathi
 */
public class CourierServicesDirectory {
    
    
    private ArrayList<CourierServices> courierServicesList;

    public CourierServicesDirectory() {
        courierServicesList= new ArrayList();
    }

    public ArrayList<CourierServices> getCourierServicesList() {
        return courierServicesList;
    }
  
    
    public CourierServices createCourierServices(String courierServicesName,String courierServicesLocation){
        CourierServices c = new CourierServices();
        c.setCourierServicesLocation(courierServicesName);
        c.setCourierServicesLocation(courierServicesLocation);
        courierServicesList.add(c);
        return c;
    }

    

}
