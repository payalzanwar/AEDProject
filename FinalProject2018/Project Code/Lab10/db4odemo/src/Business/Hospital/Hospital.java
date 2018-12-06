/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

/**
 *
 * @author Vaishali Tripathi
 */
public class Hospital {
    
    private String Hospital_name;
    private int id;
    private static int count = 1;
    private int supplierid;

    public String getHospital_name() {
        return Hospital_name;
    }

    public void setHospital_name(String Hospital_name) {
        this.Hospital_name = Hospital_name;
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
        Hospital.count = count;
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

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    private int orderid;
    private String emailid;
    private String Location;
    private int WalletId;
    private String zip;
}
