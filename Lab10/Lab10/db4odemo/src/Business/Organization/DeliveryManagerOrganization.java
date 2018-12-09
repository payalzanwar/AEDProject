/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DeliveryManagerRole;
import Business.Role.ManufacturingManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Vaishali Tripathi
 */
public class DeliveryManagerOrganization extends Organization{
    
    public DeliveryManagerOrganization(String loc) {
        super(Organization.Type.DeliveryManager.getValue(),loc);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DeliveryManagerRole());
        return roles;
    }
    

}
