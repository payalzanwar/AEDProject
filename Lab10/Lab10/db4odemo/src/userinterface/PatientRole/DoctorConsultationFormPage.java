/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author mantr
 */
public class DoctorConsultationFormPage extends javax.swing.JPanel {

    /**
     * Creates new form DoctorConsultationFormJPanel
     */
    JPanel rightPanel;
    ArrayList<Medicine> list;
    private UserAccount account;
    private Enterprise enterprise;
    public DoctorConsultationFormPage(JPanel rightPanel,ArrayList<Medicine> list,UserAccount account,Enterprise enterprise) {
        initComponents();
        this.setSize(1680, 1050);
        this.rightPanel=rightPanel;
        this.list=list;
        this.account=account;
        this.enterprise=enterprise;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Messagetxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        requestDoctorBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Messagetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MessagetxtActionPerformed(evt);
            }
        });
        add(Messagetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 69, 165, -1));

        jLabel1.setText("Alternative Medicines");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 69, -1, 20));

        requestDoctorBtn.setText("Request");
        requestDoctorBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDoctorBtnActionPerformed(evt);
            }
        });
        add(requestDoctorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 138, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void MessagetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MessagetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MessagetxtActionPerformed

    private void requestDoctorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDoctorBtnActionPerformed
        // TODO add your handling code here:
        
        String message = Messagetxt.getText();
        
        CustomerWorkRequest request = new CustomerWorkRequest();
        request.setMessage(message);

        request.setSender(account);
        request.setStatus("Sent");
        
        Organization org = null;
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DoctorOrganization){
                org = organization;
                System.out.println("Yeah bitches!!");
                break;
            }
        }
        if (org!=null){
            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);
            System.out.println("Yeah bitches!!");
        }
        
        
    }//GEN-LAST:event_requestDoctorBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Messagetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton requestDoctorBtn;
    // End of variables declaration//GEN-END:variables
}
