/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

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
