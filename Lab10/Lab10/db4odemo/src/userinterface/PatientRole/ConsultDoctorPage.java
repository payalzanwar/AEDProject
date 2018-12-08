/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Medicine.Medicine;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mantr
 */
public class ConsultDoctorPage extends javax.swing.JPanel {

    /**
     * Creates new form ConsultDoctorJPanel
     */
    private JPanel rightPanel;
     private ArrayList<Medicine> list;
     private HospitalDirectory hosp;
   private UserAccount account;
   private Enterprise enterprise;
   private Organization organization;
    public ConsultDoctorPage(JPanel rightPanel, ArrayList<Medicine> list,UserAccount account,Enterprise enterprise) {
        initComponents();
        this.rightPanel = rightPanel;
        this.list=list;
        this.account = account;
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        HospitalListTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        SearchHospitalTxt = new javax.swing.JTextField();
        RequestDoctorApprovalBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consult A Doctor");

        jLabel2.setText("Select a  Hospital");

        HospitalListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Hospital Name", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        HospitalListTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(HospitalListTable);
        HospitalListTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jLabel6.setText("Search Hospital");

        RequestDoctorApprovalBtn.setText("Request Doctor's Approval");
        RequestDoctorApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestDoctorApprovalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(RequestDoctorApprovalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SearchHospitalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchHospitalTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(RequestDoctorApprovalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String hospname = SearchHospitalTxt.getText();
        
         DefaultTableModel model = (DefaultTableModel) HospitalListTable.getModel();
        
        model.setRowCount(0);
         for(Hospital h : hosp.gethospitalList())
             if(hospname.equals(h.getHospital_name()))
             {
                Object[] row = new Object[2];
            row[0] = h;
            row[1] = h.getLocation();
           
           
      
            
            model.addRow(row);
             }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RequestDoctorApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestDoctorApprovalBtnActionPerformed
        // TODO add your handling code here:
        DoctorConsultationFormPage docconst = new DoctorConsultationFormPage(rightPanel,list,account,enterprise);
        rightPanel.add("AlternateMedicinePageJpanel", docconst);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
        
//        String message = "";
//        for(Medicine m: list)
//            message += m.getSaltname();
//        CustomerWorkRequest request = new CustomerWorkRequest();
//        request.setMessage(message);
//        request.setSender(account);
//        request.setStatus("Sent");
//        
//        Organization org = null;
//        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//            if (organization instanceof DoctorOrganization){
//                org = organization;
//                break;
//            }
//        }
//        if (org!=null){
//            org.getWorkQueue().getWorkRequestList().add(request);
//            account.getWorkQueue().getWorkRequestList().add(request);
//        }
        
        
        
        

    }//GEN-LAST:event_RequestDoctorApprovalBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable HospitalListTable;
    private javax.swing.JButton RequestDoctorApprovalBtn;
    private javax.swing.JTextField SearchHospitalTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}