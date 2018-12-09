/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Vaishali Tripathi
 */
public class MedicineSupplyWorkRequest extends WorkRequest{
    
    private String brand;
       private String medName;
       private float price;
       private String saltc1;
       private String saltc2;
       private String saltc3;
       private String medType;
       private int quantity;
       private String diseaseName;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMedName() {
        return medName;
    }

    public void setMedName(String medName) {
        this.medName = medName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSaltc1() {
        return saltc1;
    }

    public void setSaltc1(String saltc1) {
        this.saltc1 = saltc1;
    }

    public String getSaltc2() {
        return saltc2;
    }

    public void setSaltc2(String saltc2) {
        this.saltc2 = saltc2;
    }

    public String getSaltc3() {
        return saltc3;
    }

    public void setSaltc3(String saltc3) {
        this.saltc3 = saltc3;
    }

    public String getMedType() {
        return medType;
    }

    public void setMedType(String medType) {
        this.medType = medType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    

    @Override
    public String toString() {
        return medName;
    }

    
    
}
