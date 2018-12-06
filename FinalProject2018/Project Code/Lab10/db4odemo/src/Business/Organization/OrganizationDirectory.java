/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type,EnterpriseType EnterpriseType){
        Organization organization = null;
//        if(EnterpriseType.getValue().equals(EnterpriseType.Hospital.getValue()))
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
            
        }
//        else if (type.getValue().equals(Type.Lab.getValue())){
//            organization = new LabOrganization();
//            organizationList.add(organization);
//            
//            
//        }
        
        else if (type.getValue().equals(Type.Pharmacist.getValue())){
            organization = new PharmacistOrganization();
            organizationList.add(organization);     
        }
        else if (type.getValue().equals(Type.SupplyManager.getValue())){
            organization = new SupplyManagerOrganization();
            organizationList.add(organization);     
        }
        return organization;
    }   
}
