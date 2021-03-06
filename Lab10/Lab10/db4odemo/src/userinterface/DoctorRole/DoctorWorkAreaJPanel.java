/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;


import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashSet;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vaishali Tripathi
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
   private DoctorOrganization organization;
   private UserAccount account;
   private Enterprise enterprise;
    /**
     * Creates new form DoctorProcessWorkRequestJPanel
     */
   

    public DoctorWorkAreaJPanel(JPanel userProcessContainer, DoctorOrganization doctorOrganization, UserAccount account, Enterprise enterprise) {
         initComponents();
        this.userProcessContainer = userProcessContainer;
       this.enterprise = enterprise;
       this.account=account;
        System.out.println("account in doc work area"+account);
       this.organization=doctorOrganization;
       populateTable();
    }

   public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : account.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[4];
            row[0] = request;
            row[1] = request.getSender().getUsername();
        
            row[2]= request.getReceiver().getUsername();
            row[3] = request.getStatus();
            
            model.addRow(row);
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewtxt = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel2.setForeground(new java.awt.Color(0, 51, 102));
        jPanel2.setLayout(null);

        workRequestJTable.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        workRequestJTable.setForeground(new java.awt.Color(0, 51, 102));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 80, 620, 130);

        refreshJButton.setBackground(new java.awt.Color(255, 255, 255));
        refreshJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        refreshJButton.setForeground(new java.awt.Color(0, 51, 102));
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(refreshJButton);
        refreshJButton.setBounds(550, 30, 120, 40);

        assignJButton.setBackground(new java.awt.Color(255, 255, 255));
        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJButton.setForeground(new java.awt.Color(0, 51, 102));
        assignJButton.setText("Disapprove");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(assignJButton);
        assignJButton.setBounds(430, 560, 200, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("        Doctor Work Area");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 50);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("View Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(50, 220, 170, 50);

        viewtxt.setColumns(20);
        viewtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        viewtxt.setForeground(new java.awt.Color(0, 51, 102));
        viewtxt.setRows(5);
        jScrollPane2.setViewportView(viewtxt);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(60, 400, 630, 150);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Detailed Message ");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(60, 360, 230, 30);

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 51, 102));
        jButton2.setText("Approve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(150, 560, 190, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/DoctorRole/doccc.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, -80, 710, 780);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        add(jPanel3, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
 int selectedRow = workRequestJTable.getSelectedRow();
    
        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(!(request.getStatus().equalsIgnoreCase("Completed"))){
        request.setStatus("Disapproved");
         request.setMessage("Alternative Prescription Disapproved");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Request is already completed!");
        }
      populateTable();

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        viewtxt.setText("");
        String output = "Hello Doctor\nFollowing are the alternative medicines.\n";
        
        HashSet<Medicine> m = new HashSet<Medicine>();
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        
       int i=1;
       
        for(Medicine med : request.getAlternativelist()) {
            output= output + i+"]  "+ med.getBrand()+"  "+med.getSaltname()+"  "+med.getSaltComposition1()+"  "+med.getSaltComposition2()+"  "+med.getSaltComposition3()+"  "
             +"for"+"  "+med.getDisease() +"\n";
        viewtxt.setText(output);
        viewtxt.setEditable(false);
        i++;
        
        }
        viewtxt.setText(output+"Please approve them if they are fine to take!\n\nThank you.");
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(!(request.getStatus().equalsIgnoreCase("Completed"))){
        request.setStatus("Approved");
         request.setMessage("Alternative Prescription Approved");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Request is already completed!");
        }
        populateTable();

    }//GEN-LAST:event_jButton2ActionPerformed

   //GEN-LAST:event_assignJButtonActionPerformed
//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTextArea viewtxt;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
