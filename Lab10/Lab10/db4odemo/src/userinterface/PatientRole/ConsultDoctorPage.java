/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import javax.mail.Message;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author mantr
 */
public class ConsultDoctorPage extends javax.swing.JPanel {

    /**
     * Creates new form ConsultDoctorJPanel
     */
    private JPanel rightPanel;
     private HashSet<Medicine> list;
     private HospitalDirectory hosp;
   private UserAccount account;
   private Enterprise enterprise;
   private EcoSystem system;
   private Organization organization;
    public ConsultDoctorPage(JPanel rightPanel, HashSet<Medicine> list,UserAccount account,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.setSize(700,400);
        this.rightPanel = rightPanel;
        this.list=list;
        this.account = account;
        this.enterprise=enterprise;
        this.system=system;
        populateComboBox();
        populateTable();
        DoctorTable.setRowSelectionAllowed(true);
        DoctorTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
     
                
    }
public void populateDoctorTable(ArrayList<Employee> a)
{
 DefaultTableModel model = (DefaultTableModel) DoctorTable.getModel();
        
        model.setRowCount(0);
        
         for(Employee emp : a){
            
             {
                Object[] row = new Object[6];
                row[0]=emp.getName();
            row[1] = emp.getSpeciality();
            
            
         
            model.addRow(row);
             }
             }   
}
    public void populateHospitalTable(ArrayList<Enterprise> a)
{
 DefaultTableModel model = (DefaultTableModel) HospitalListTable.getModel();
        
        model.setRowCount(0);
        
        for(Enterprise e: a){
            
             {
                Object[] row = new Object[6];
                row[0]=e;
            row[1] = e.getEntloc();
            
            
         
            model.addRow(row);
             }
             }  
          
          

}

    public void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) MedicineTable.getModel();
        
        model.setRowCount(0);
        
         for(Medicine medi : list){
            
             {
                Object[] row = new Object[6];
                row[0]=medi.getBrand();
            row[1] = medi;
            row[2] = medi.getSaltComposition1();
            row[3]= medi.getSaltComposition2();
            row[4]=medi.getSaltComposition3();
            
           
            row[5]=medi.getDisease();
      
         
            model.addRow(row);
             }
             }
         
    }
    
    
     private void populateComboBox() {
        RegionCombo.removeAllItems();
     
       
        int Price=0;
        for (Network network : system.getNetworkList()) {
            RegionCombo.addItem(network);
        }

        
        

      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RegionCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        ViewDoctors = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        HospitalListTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        RequestDoctorApprovalBtn = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consult A Doctor");

        jLabel3.setText("Region");

        jButton1.setText("Search Hospitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Selected List of Alternatives ");

        MedicineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand", "Medicine Name", "Salt Comp 1", "Salt comp 2", "Salt comp 3", "Disease Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(MedicineTable);

        jLabel6.setText("Select a  Hospital");

        ViewDoctors.setText("View Doctors");
        ViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorsActionPerformed(evt);
            }
        });

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
        jScrollPane7.setViewportView(HospitalListTable);

        jLabel2.setText("Select Preferred Doctors ");

        DoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Doctor Name", "Speciality"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(DoctorTable);

        RequestDoctorApprovalBtn.setText("Request Doctor's Approval");
        RequestDoctorApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RequestDoctorApprovalBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(RegionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ViewDoctors))
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(RequestDoctorApprovalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(RegionCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewDoctors))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(RequestDoctorApprovalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Enterprise> a = new ArrayList<>();
        for (Network network : system.getNetworkList()) {
            //   RegionCombo.addItem(network);
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Enterprise.EnterpriseType  type =enterprise.getEnterpriseType();
                if(type.equals(type.Hospital))
                a.add(enterprise);

            }
        }
        populateHospitalTable(a);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ViewDoctorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDoctorsActionPerformed
        // TODO add your handling code here:
        ArrayList<Employee> a = new ArrayList<>();
        int row = HospitalListTable.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Enterprise e = (Enterprise)HospitalListTable.getValueAt(row, 0);
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof DoctorOrganization){
                a = organization.getEmployeeDirectory().getEmployeeList();
                System.out.println("Yeah bitches!!");
                break;
            }
        }

        populateDoctorTable(a);
    }//GEN-LAST:event_ViewDoctorsActionPerformed

    private void RequestDoctorApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestDoctorApprovalBtnActionPerformed
        // TODO add your handling code here:
        //        DoctorConsultationFormPage docconst = new DoctorConsultationFormPage(rightPanel,list,account,enterprise);
        //        rightPanel.add("AlternateMedicinePageJpanel", docconst);
        //        CardLayout layout = (CardLayout)rightPanel.getLayout();
        //        layout.next(rightPanel);

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

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        //props.put("mail.smtp.port", "888");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "888");

        Session session = Session.getDefaultInstance(props,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("ecosystem.aedproject@gmail.com", "chutiy@$");
                }
            }

        );

        try{
            Message message = new  MimeMessage(session);
            message.setFrom(new InternetAddress("ecosystem.aedproject@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("manognam94@gmail.com"));
            message.setSubject("Hi, if you have receivced it, the attempt is successful");
            message.setText("lets make this work for our project");
            Transport.send(message);
            props.put("mail.smtp.connectiontimeout", "5");
            props.put("mail.smtp.timeout", "5");

            JOptionPane.showMessageDialog(null, "Mail Successfully sent bitches!!");

        }catch(MessagingException e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_RequestDoctorApprovalBtnActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JTable HospitalListTable;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JComboBox RegionCombo;
    private javax.swing.JButton RequestDoctorApprovalBtn;
    private javax.swing.JButton ViewDoctors;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables
}
