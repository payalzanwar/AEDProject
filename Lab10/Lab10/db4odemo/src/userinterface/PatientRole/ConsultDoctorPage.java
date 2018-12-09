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
import static Business.Organization.Organization.Type.Doctor;
import static Business.Role.Role.RoleType.Doctor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import javax.mail.*;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.HospitalAdminWorkAreaJPanel;

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
   private ArrayList<Employee> doclist;
   private HashSet<Employee> finallist;
    
    public ConsultDoctorPage(JPanel rightPanel, HashSet<Medicine> list,UserAccount account,Enterprise enterprise,EcoSystem system) {
        initComponents();
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
                row[0]=emp;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        HospitalListTable = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        MedicineTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DoctorTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        RegionCombo = new javax.swing.JComboBox();
        ViewDoctors = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        from = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        to1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        subject_text = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        message_text = new javax.swing.JTextArea();
        RequestDoctorApprovalBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 1227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Consult A Doctor");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 709, 58));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Select Preferred Doctors ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 503, 193, 42));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Region");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 76, 103, 36));

        HospitalListTable.setBackground(new java.awt.Color(0, 51, 102));
        HospitalListTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        HospitalListTable.setForeground(new java.awt.Color(0, 51, 102));
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
        jScrollPane5.setViewportView(HospitalListTable);

        jPanel1.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 346, 638, 151));

        MedicineTable.setBackground(new java.awt.Color(0, 51, 102));
        MedicineTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        MedicineTable.setForeground(new java.awt.Color(0, 51, 102));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 153, 638, 134));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Selected List of Alternatives ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 113, 211, 40));

        DoctorTable.setBackground(new java.awt.Color(0, 51, 102));
        DoctorTable.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        DoctorTable.setForeground(new java.awt.Color(0, 51, 102));
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
        if (DoctorTable.getColumnModel().getColumnCount() > 0) {
            DoctorTable.getColumnModel().getColumn(0).setResizable(false);
            DoctorTable.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 551, 640, 139));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Select a  Hospital");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 299, 146, 42));

        RegionCombo.setBackground(new java.awt.Color(0, 51, 102));
        RegionCombo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RegionCombo.setForeground(new java.awt.Color(0, 51, 102));
        jPanel1.add(RegionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 76, 110, 36));

        ViewDoctors.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ViewDoctors.setForeground(new java.awt.Color(0, 51, 102));
        ViewDoctors.setText("View Doctors");
        ViewDoctors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorsActionPerformed(evt);
            }
        });
        jPanel1.add(ViewDoctors, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 299, 127, 38));

        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Search Hospitals");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(518, 76, -1, 36));

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Save Preferred Doctors");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 701, 205, 55));

        from.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        from.setForeground(new java.awt.Color(0, 51, 102));
        from.setText("<donotreply@ecosystem.com>");
        from.setEnabled(false);
        from.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fromActionPerformed(evt);
            }
        });
        jPanel1.add(from, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 787, 420, 41));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 102));
        jLabel7.setText("From");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 787, 79, 41));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Request Doctors Approval");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 758, 201, 23));

        to1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        to1.setForeground(new java.awt.Color(0, 51, 102));
        to1.setText("admin@ecosytem.com");
        to1.setEnabled(false);
        to1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                to1ActionPerformed(evt);
            }
        });
        jPanel1.add(to1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 834, 420, 41));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 102));
        jLabel8.setText("To");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 838, 69, 33));

        subject_text.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        subject_text.setForeground(new java.awt.Color(0, 51, 102));
        subject_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subject_textActionPerformed(evt);
            }
        });
        jPanel1.add(subject_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 885, 420, 41));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 102));
        jLabel9.setText("Subject");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 881, 69, 38));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 102));
        jLabel10.setText("Message");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 937, 69, 33));

        message_text.setBackground(null);
        message_text.setColumns(20);
        message_text.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        message_text.setForeground(new java.awt.Color(0, 51, 102));
        message_text.setRows(5);
        jScrollPane4.setViewportView(message_text);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 937, 420, 197));

        RequestDoctorApprovalBtn.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        RequestDoctorApprovalBtn.setForeground(new java.awt.Color(0, 51, 102));
        RequestDoctorApprovalBtn.setText("Request Doctor's Approval");
        RequestDoctorApprovalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDoctorsActionPerformed(evt);
            }
        });
        jPanel1.add(RequestDoctorApprovalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 1150, 263, 60));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1025, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 204, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RequestDoctorApprovalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RequestDoctorApprovalBtnActionPerformed
        // TODO add your handling code here:
       
        String message = "Alternative Prescription";
        int row = HospitalListTable.getSelectedRow();
        Enterprise e = (Enterprise) HospitalListTable.getValueAt(row, 0);
        CustomerWorkRequest request = new CustomerWorkRequest();
        request.setAlternativelist(list);
        request.setDoctorlist(doclist);
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");
        request.setMessage(message);

        Organization org = null;
        for (Organization organization : e.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof DoctorOrganization) {
                org = organization;

                break;
            }
        }

        System.out.println("enterprise :" + e);

        UserAccount u = null;
        for (UserAccount user : e.getUserAccountDirectory().getUserAccountList()) {
            if (user.getEmployee().getName().equals("HospAdmin")) {
                u = user;
                request.setReceiver(u);
                System.out.println("useracc" + u);
                break;
            }
        }
        request.setReceiver(u);
        if (u != null) {

            //org.getWorkQueue().getWorkRequestList().add(request);
            u.getWorkQueue().getWorkRequestList().add(request);

            JOptionPane.showMessageDialog(null, "Request sent!");
        }
          
        String Subject = subject_text.getText();
        String Message = message_text.getText();
        
        
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
            Message msg = new  MimeMessage(session);
            msg.setFrom(new InternetAddress("ecosystem.aedproject@gmail.com"));
            msg.setRecipients(RecipientType.TO, InternetAddress.parse("mantrimanogna@gmail.com"));
            msg.setSubject(subject_text.getText());
            msg.setText(message_text.getText());
            Transport.send(msg); 
            props.put("mail.smtp.connectiontimeout", "5");
            props.put("mail.smtp.timeout", "5");

            JOptionPane.showMessageDialog(null, "Mail Successfully Sent!");

        }catch(MessagingException c){
            JOptionPane.showMessageDialog(null, c);

        }
                  

    }//GEN-LAST:event_RequestDoctorApprovalBtnActionPerformed

   
        
        
    
        
       
//        
//        HospitalAdminWorkAreaJPanel docconst = new HospitalAdminWorkAreaJPanel(rightPanel,list,finallist,account,enterprise);
//    
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
              
                break;
            }
        }
       
         populateDoctorTable(a);
    }//GEN-LAST:event_ViewDoctorsActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        doclist = new ArrayList<>();
       
          int[] selectedrows = DoctorTable.getSelectedRows();
        if (selectedrows.length != -1) {
          
            
            for (int i = 0; i < selectedrows.length; i++)
            {
                
               Employee m= (Employee) DoctorTable.getValueAt(selectedrows[i], 0);
               doclist.add(m);
                
                
            }
            JOptionPane.showMessageDialog(null, "Preferred Doctors List is saved!!");
        } else {
             JOptionPane.showMessageDialog(null, "Please select a row");
        }
       finallist = new HashSet<Employee>(doclist);
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fromActionPerformed

    private void subject_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subject_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subject_textActionPerformed

    private void to1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_to1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_to1ActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DoctorTable;
    private javax.swing.JTable HospitalListTable;
    private javax.swing.JTable MedicineTable;
    private javax.swing.JComboBox RegionCombo;
    private javax.swing.JButton RequestDoctorApprovalBtn;
    private javax.swing.JButton ViewDoctors;
    private javax.swing.JTextField from;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea message_text;
    private javax.swing.JTextField subject_text;
    private javax.swing.JTextField to1;
    // End of variables declaration//GEN-END:variables
}
