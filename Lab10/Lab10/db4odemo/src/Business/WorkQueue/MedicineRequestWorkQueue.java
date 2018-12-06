/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class MedicineRequestWorkQueue {
    
    private ArrayList<MedicineSupplyWorkRequest> workRequestList;

    public MedicineRequestWorkQueue() {
        workRequestList = new ArrayList();
    }

    public ArrayList<MedicineSupplyWorkRequest> getWorkRequestList() {
        return workRequestList;
    }
}