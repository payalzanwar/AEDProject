/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author Vaishali Tripathi
 */
public class HospitalDirectory {
    
    
    private static ArrayList<Hospital> hospitalList;

    public HospitalDirectory() {
        hospitalList= new ArrayList();
    }

    public static ArrayList<Hospital> gethospitalList() {
        return hospitalList;
    }
    
    public static Hospital createHospital(String name,String hospLoc, String EmailId, String zip){
        Hospital hosp = new Hospital();
        hosp.setHospital_name(name);
        hosp.setLocation(hospLoc);
        hosp.setEmailid(EmailId);
        hosp.setZip(zip);
        hospitalList.add(hosp);
        return hosp;
    }

}
