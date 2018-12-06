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
    
    private String saltName;
       private String composition;
       private String medType;
       private int quantity;

    public String getSaltName() {
        return saltName;
    }

    public void setSaltName(String saltName) {
        this.saltName = saltName;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
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

    @Override
    public String toString() {
        return saltName ;
    }

    
    
}
