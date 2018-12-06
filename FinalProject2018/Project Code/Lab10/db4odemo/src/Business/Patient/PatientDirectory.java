/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.ArrayList;

/**
 *
 * @author mantr
 */
public class PatientDirectory {
    
    private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList= new ArrayList();
        
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient createPatient(String PatientUserId, String PatientPassword, String FirstName, String LastName, String emailId){
        Patient p = new Patient();
        p.setPatientUserId(PatientUserId);
        p.setPatientPassword(PatientPassword);
        p.setFirstName(FirstName);
        p.setLastName(LastName);
        p.setEmail(emailId);
        patientList.add(p);
        return p;
    }
}
