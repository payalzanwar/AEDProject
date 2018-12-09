/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Organization.PharmacistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.HospitalAdminWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Payal Zanwar
 */
public class OrderDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderDetailsJPanel
     */
    private JPanel userProcessContainer;
   // private OrderDirectory orderD;
    
    private UserAccount account;
    private EcoSystem system;
    private ArrayList<Order> o;
    public OrderDetailsJPanel(JPanel userProcessContainer,ArrayList<Order> o,UserAccount userAccount,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        
        this.account = userAccount;
        this.system = system;
        this.o=o;
        PlaceOrderlabel.setEnabled(false);
        TotalPricetxt.setEnabled(false);
        populateTable();
    }

    
    public void populateTable()
    {
    
        DefaultTableModel model = (DefaultTableModel) OrderTable.getModel();
        float Price=0;
        model.setRowCount(0);
        for (Order order : o) {

            Object[] row = new Object[3];
            
            
            row[0] = order;
            row[1] = order.getItem().getQuantity();
            row[2] = order.getItem().getSalesPrice();
            Price = Price + order.getItem().getSalesPrice();
            model.addRow(row);
        }
        
        TotalPricetxt.setText(String.valueOf(Price));
        
    }
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        TotalPricetxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Removebtn = new javax.swing.JButton();
        PlaceOrderlabel = new javax.swing.JLabel();

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("                   Order Details");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 36, 297, -1));

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Medicines", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(OrderTable);
        if (OrderTable.getColumnModel().getColumnCount() > 0) {
            OrderTable.getColumnModel().getColumn(0).setResizable(false);
            OrderTable.getColumnModel().getColumn(1).setResizable(false);
            OrderTable.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 86, 630, 129));

        jLabel2.setText("Total Price");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 269, 95, -1));
        jPanel2.add(TotalPricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(617, 266, 81, -1));

        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(553, 327, 145, -1));

        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 327, -1, -1));

        Removebtn.setText("Remove");
        Removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovebtnActionPerformed(evt);
            }
        });
        jPanel2.add(Removebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 265, -1, -1));

        PlaceOrderlabel.setText("Your order has been placed. Thank you!");
        jPanel2.add(PlaceOrderlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 387, 309, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
         
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void RemovebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovebtnActionPerformed
        // TODO add your handling code here:
        
         int selectedRow = OrderTable.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure to delete??","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                Order or = (Order) OrderTable.getValueAt(selectedRow, 0);
                System.out.println("After order obj creation");
                o.remove(or);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!!");
        }
    }//GEN-LAST:event_RemovebtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            // TODO add your handling code here:
        PlaceOrderlabel.setEnabled(true);
        OrderTable.setEnabled(false);
        Removebtn.setEnabled(false);
        
        String message = "Order Request";
        CustomerWorkRequest request = new CustomerWorkRequest();
        request.setOrderlist(o);
        
        request.setMessage(message);
        request.setSender(account);
        request.setStatus("Sent");
        request.setMessage(message);

        Enterprise ent = null;
        for (Network network : system.getNetworkList()) {
           //   RegionCombo.addItem(network);
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                Enterprise.EnterpriseType  type =enterprise.getEnterpriseType();
            if(type.equals(type.Pharmacy))
             ent=enterprise;
            break;
            }
        }
        Organization org = null;
        for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof PharmacistOrganization) {
                org = organization;

                break;
            }
        }

        

        
        
        if (org != null) {

            org.getWorkQueue().getWorkRequestList().add(request);
            account.getWorkQueue().getWorkRequestList().add(request);

            JOptionPane.showMessageDialog(null, "Request sent!");
        }
          
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable OrderTable;
    private javax.swing.JLabel PlaceOrderlabel;
    private javax.swing.JButton Removebtn;
    private javax.swing.JTextField TotalPricetxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
