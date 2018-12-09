/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author Vaishali Tripathi
 */
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierList;

    public SupplierDirectory() {
        supplierList= new ArrayList();
    }

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }
    
    public Supplier createSupplier(String supplierName,String supplierLocation){
        Supplier supp = new Supplier();
        supp.setSupplierName(supplierName);
        supp.setSupplierLocation(supplierLocation);
        supplierList.add(supp);
        return supp;
    }

    
}
