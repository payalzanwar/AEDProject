/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacy;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class PharmacyDirectory {
    
    private ArrayList<Pharmacy> pharmacyList;

    public PharmacyDirectory() {
        pharmacyList= new ArrayList();
    }

    public ArrayList<Pharmacy> getPharmacyList() {
        return pharmacyList;
    }
    
    public Pharmacy createPharmacy(String name,String PharmLoc, String EmailId, String zip){
        Pharmacy pharm = new Pharmacy();
        pharm.setPharmacy_name(name);
        pharm.setLocation(PharmLoc);
        pharm.setEmailid(EmailId);
        pharm.setZip(zip);
        pharmacyList.add(pharm);
        return pharm;
    }
}