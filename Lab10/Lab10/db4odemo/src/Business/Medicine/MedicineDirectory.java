/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;


import Business.Pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author Payal Zanwar
 */
public class MedicineDirectory {
    public static ArrayList<Medicine> MedicineList;

    public MedicineDirectory() {
        MedicineList = new ArrayList();
    }

    public static ArrayList<Medicine> getMedicineList() {
        return MedicineList;
    }
    
    public static Medicine AddMedicine(String[] metadata){
        Medicine med = new Medicine();
        
       
        
        med.setSaltname(metadata[0]);
        int p = Integer.parseInt(metadata[1]);
        med.setPrice(p);
        med.setSaltComposition(metadata[2]);
        int unit = Integer.parseInt(metadata[3]);
        med.setUnits(unit);
        med.setType(metadata[4]);

        med.setDisease(metadata[5]);
        MedicineList.add(med);
        return med;
    }
}
