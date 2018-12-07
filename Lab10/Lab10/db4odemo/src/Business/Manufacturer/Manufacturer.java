/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Manufacturer;

import Business.Medicine.MedicineDirectory;

/**
 *
 * @author Vaishali Tripathi
 */
public class Manufacturer {
    private int manufacturerID;
    private String manufacturerName;
    private String manufacturerLocation;
    private static int count = 1;
    private MedicineDirectory Med;

    public Manufacturer(){
        this.manufacturerID = this.count;
        count++;
        Med = new MedicineDirectory();
    }

    public int getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(int manufacturerID) {
        this.manufacturerID = manufacturerID;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getManufacturerLocation() {
        return manufacturerLocation;
    }

    public void setManufacturerLocation(String manufacturerLocation) {
        this.manufacturerLocation = manufacturerLocation;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Manufacturer.count = count;
    }

    public MedicineDirectory getMed() {
        return Med;
    }

    public void setMed(MedicineDirectory Med) {
        this.Med = Med;
    }
    
}
