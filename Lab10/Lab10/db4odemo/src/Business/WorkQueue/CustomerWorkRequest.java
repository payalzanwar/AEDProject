/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Medicine.Medicine;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author raunak
 */
public class CustomerWorkRequest extends WorkRequest{
    
    private String MedicineOrder;
    

    
    public String getTestResult() {
        return MedicineOrder;
    }

    public void setTestResult(String MedicineOrder) {
        this.MedicineOrder = MedicineOrder;
    }
    
    
}
