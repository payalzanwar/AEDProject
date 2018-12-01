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
    private ArrayList<Patient> PatientList;

    public PatientDirectory() {
        PatientList = new ArrayList();
    }

    public ArrayList<Patient> getUserAccountList() {
        return PatientList;
    }
}
