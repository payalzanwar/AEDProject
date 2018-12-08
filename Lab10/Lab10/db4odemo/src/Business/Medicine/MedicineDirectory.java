/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

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
        
       
        med.setBrand(metadata[0]);
        med.setSaltname(metadata[1]);
        int p = Integer.parseInt(metadata[8]);
        med.setPrice(p);
        med.setSaltComposition1(metadata[2]);
        med.setSaltComposition2(metadata[3]);
        med.setSaltComposition3(metadata[4]);
        int unit = Integer.parseInt(metadata[7]);
        med.setUnits(unit);
        med.setType(metadata[5]);
        med.setDisease(metadata[6]);
        MedicineList.add(med);
        return med;
    }
}
