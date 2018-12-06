/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import java.util.ArrayList;

/**
 *
 * @author Vaishali Tripathi
 */
public class ManufacturerDirectory {
    
    
    private ArrayList<Manufacturer> manufacturerList;

    public ManufacturerDirectory() {
        manufacturerList= new ArrayList();
    }

    public ArrayList<Manufacturer> getManufacturerList() {
        return manufacturerList;
    }
  
    
    public Manufacturer createManufacturer(String manufacturerName,String manufacturerLocation){
        Manufacturer man = new Manufacturer();
        man.setManufacturerName(manufacturerName);
        man.setManufacturerLocation(manufacturerLocation);
        manufacturerList.add(man);
        return man;
    }

    

}
