/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import userinterface.pharmacistRole.PharmacistWorkAreaJPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PatientRole.PatientWorkAreaJPanel1;

/**
 *
 * @author raunak
 */
public class PharmacistRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new PharmacistWorkAreaJPanel(userProcessContainer, account, (PharmacistOrganization)organization, enterprise);
    }
    
    
}
