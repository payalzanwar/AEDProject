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
    private ArrayList<Medicine> MedicineList;

    public MedicineDirectory() {
        MedicineList = new ArrayList();
    }

    public ArrayList<Medicine> getMedicineList() {
        return MedicineList;
    }
    
    public Medicine AddMedicine(String saltname,int Price, String SaltComposition, int units, String Type){
        Medicine med = new Medicine();
        MedicineList.add(med);
        return med;
    }
}