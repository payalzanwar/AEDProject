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
 float price;
 String SaltComposition1;
 String SaltComposition2;

 public enum MedicineType{
        Tablet("Tablet"),
        Syrup("Syrup"),
        Capsule("Capsule"),
        Injection("Injection");

        
        private String value;
        
        private MedicineType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
    }
 
 
    public String getSaltComposition2() {
        return SaltComposition2;
    }

    public void setSaltComposition2(String SaltComposition2) {
        this.SaltComposition2 = SaltComposition2;
    }

    public String getSaltComposition3() {
        return SaltComposition3;
    }

    public void setSaltComposition3(String SaltComposition3) {
        this.SaltComposition3 = SaltComposition3;
    }
 String SaltComposition3;
 int units;
 String Type;

    public String getDisease() {
        return Disease;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public void setDisease(String Disease) {
        this.Disease = Disease;
    }
 String Disease;
 String Brand;
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSaltComposition1() {
        return SaltComposition1;
    }

    public void setSaltComposition1(String SaltComposition1) {
        this.SaltComposition1 = SaltComposition1;
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
    @Override
    public String toString()
            {
//                return "Medicine [name=" + getSaltname() + ", price=" + getPrice() + ", SaltComp=" + getSaltComposition()
//                + "Type"+ getType()+ "Units"+ getUnits()+"Disease"+ getDisease()+"]";
                return getSaltname();
            }
 
       
}
