/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import Business.Medicine.MedicineDirectory;

/**
 *
 * @author Vaishali Tripathi
 */
public class Supplier {
    private int supplierID;
    private String supplierName;
    private String supplierLocation;
    private static int count = 1;
    private MedicineDirectory Med;
    

    public Supplier(){
        this.supplierID = this.count;
        count++;
        //Med = new MedicineDirectory();
    }
    public MedicineDirectory getMed() {
        return Med;
    }

    public void setMed(MedicineDirectory Med) {
        this.Med = Med;
    }
    
    
    public int getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(int supplierID) {
        this.supplierID = supplierID;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierLocation() {
        return supplierLocation;
    }

    public void setSupplierLocation(String supplierLocation) {
        this.supplierLocation = supplierLocation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Supplier.count = count;
    }
}
