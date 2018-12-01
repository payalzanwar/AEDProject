/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

/**
 *
 * @author Payal Zanwar
 */
public class Medicine {
 int med_id;
 String saltname;
 int price;
 String SaltComposition;
 int units;
 String Type;

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }
 String Disease;
private static int cnt = 1;    
 
 public Medicine()
 {
     med_id=cnt;
     cnt++;
         
 }
    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getSaltname() {
        return saltname;
    }

    public void setSaltname(String saltname) {
        this.saltname = saltname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSaltComposition() {
        return SaltComposition;
    }

    public void setSaltComposition(String SaltComposition) {
        this.SaltComposition = SaltComposition;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
 
    public String toString()
            {
                return getSaltname();
            }
 
       
}
