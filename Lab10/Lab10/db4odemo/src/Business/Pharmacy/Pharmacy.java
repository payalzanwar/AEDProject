/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import Business.Medicine.MedicineDirectory;
import Business.Role.DoctorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class Pharmacy {

    private String Pharmacy_name;
    private int id;
    private static int count = 1;
    private int supplierid;
    private int orderid;
    private String emailid;
    private String Location;
    private int WalletId;
    private String zip;
    private MedicineDirectory Med;

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public Pharmacy() {
        id = count;
        WalletId = count;
        count++;
        Med = new MedicineDirectory();
    }

    public MedicineDirectory getMed() {
        return Med;
    }

    public void setMed(MedicineDirectory Med) {
        this.Med = Med;
    }

    public String getPharmacy_name() {
        return Pharmacy_name;
    }

    public void setPharmacy_name(String Pharmacy_name) {
        this.Pharmacy_name = Pharmacy_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Pharmacy.count = count;
    }

    public int getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(int supplierid) {
        this.supplierid = supplierid;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getWalletId() {
        return WalletId;
    }

    public void setWalletId(int WalletId) {
        this.WalletId = WalletId;
    }

}
