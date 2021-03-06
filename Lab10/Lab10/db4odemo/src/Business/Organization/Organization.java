/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 *
 * @author Vaishali Tripathi
 */
public abstract class Organization {

    private String name;
    private String org_name;
    private String entloc;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=1;
    
    public enum Type{
      Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"),Pharmacist("Pharmacist Organizantion"),SupplyManager("Supply Manager Organization"), ManufacturingManager("Manufacturing Manager Organization"),ShipmentManager("Shipment Manager Organization"), DeliveryManager("Delivery Manager Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        
    }

    
    public Organization(String name,String entloc) {
        this.name = name;
        this.org_name=org_name;
        this.entloc=entloc;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        counter++;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getEntloc() {
        return entloc;
    }

    public void setEntloc(String entloc) {
        this.entloc = entloc;
    }

   

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
