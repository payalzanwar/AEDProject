package userinterface.ManufacturingManagerRole;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Manufacturer.Manufacturer;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import Business.Organization.ManufacturingManagerOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWorkRequest;
import Business.WorkQueue.MedicineSupplyWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.ManageMedicineInventory.AddToInventoryJPanel;
import userinterface.ManageMedicineInventory.ViewMedicineInventoryPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Payal Zanwar
 */
public class ManufacturingManagerWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SupplyManagerWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private ManufacturingManagerOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private Manufacturer man;
    private MedicineDirectory med;
    private EcoSystem system;
   
    
    public ManufacturingManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, ManufacturingManagerOrganization organization, Enterprise enterprise, EcoSystem system) {
        initComponents();
    
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        
      // man=new Manufacturer();
       manufacturernametxt.setText(enterprise.getName());
       
       populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[11];
            row[0] = ((MedicineSupplyWorkRequest) request);
            row[1] = ((MedicineSupplyWorkRequest) request).getBrand();
            row[2] = ((MedicineSupplyWorkRequest) request).getQuantity();
            row[3] = ((MedicineSupplyWorkRequest) request).getPrice();
            row[4] = ((MedicineSupplyWorkRequest) request).getSaltc1();
            row[5] = ((MedicineSupplyWorkRequest) request).getSaltc2();
            row[6] = ((MedicineSupplyWorkRequest) request).getSaltc3();
            row[7] = ((MedicineSupplyWorkRequest) request).getDiseaseName();
            row[8] = request.getSender();
            row[9] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            if(request.getStatus().equalsIgnoreCase("sent"))
                request.setStatus("Awaiting Response");
            row[10] = request.getStatus();
                        
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

        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        refreshJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        supplyBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        manufacturernametxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        addMedicineBtn = new javax.swing.JButton();
        viewInvenBtn = new javax.swing.JButton();

        container.setLayout(new java.awt.CardLayout());

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        supplyBtn.setText("Supply");
        supplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplyBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("          Manufacturing Manager Work Area");

        jLabel2.setText("Manufacturer ");

        manufacturernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manufacturernametxtActionPerformed(evt);
            }
        });

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Brand", "Quantity", "Price", "Salt 1", "Salt 2", "Salt 3", "Disease", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        addMedicineBtn.setText("Add to Inventory");
        addMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMedicineBtnActionPerformed(evt);
            }
        });

        viewInvenBtn.setText("View Inventory");
        viewInvenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewInvenBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(manufacturernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(refreshJButton)
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addMedicineBtn)
                        .addGap(214, 214, 214)
                        .addComponent(viewInvenBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(supplyBtn)
                        .addGap(102, 102, 102))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(refreshJButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(manufacturernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(supplyBtn))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMedicineBtn)
                    .addComponent(viewInvenBtn))
                .addContainerGap(381, Short.MAX_VALUE))
        );

        container.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(container, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(container, "Please select an order");
            return;
        }
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equalsIgnoreCase("completed"))
            JOptionPane.showMessageDialog(container, "The request has already been completed");
        else
        {request.setReceiver(userAccount);
        request.setStatus("Pending");
        populateTable();}

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void supplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplyBtnActionPerformed

        try {
            
        int selectedRow = workRequestJTable.getSelectedRow();
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(container, "Please select an order");
            return;}
        MedicineSupplyWorkRequest request = (MedicineSupplyWorkRequest)workRequestJTable.getValueAt(selectedRow, 0);
        if(request.getReceiver()==null)
            JOptionPane.showMessageDialog(container,"The request is unassigned");
        else
         
        {System.out.println("man med list: "+med.getManufacturerMedicineList().size());
            
            for (Medicine m : med.getManufacturerMedicineList()) {

                        if (m.getBrand().equalsIgnoreCase(((MedicineSupplyWorkRequest) request).getBrand())
                                && m.getSaltComposition1().equalsIgnoreCase(((MedicineSupplyWorkRequest) request).getSaltc1())
                                && m.getSaltComposition2().equalsIgnoreCase(((MedicineSupplyWorkRequest) request).getSaltc2())
                                && m.getSaltComposition3().equalsIgnoreCase(((MedicineSupplyWorkRequest) request).getSaltc3())
                                && m.getSaltname().equalsIgnoreCase(((MedicineSupplyWorkRequest) request).getMedName())
                                && m.getDisease().equalsIgnoreCase(((MedicineSupplyWorkRequest) request).getDiseaseName())
                                && m.getType().equalsIgnoreCase(((MedicineSupplyWorkRequest) request).getMedType())) {
                                System.out.println("if me aaya");
                                
                                
                                if(m.getUnits() >= ((MedicineSupplyWorkRequest) request).getQuantity())
                                {
                                    m.setUnits(m.getUnits()-((MedicineSupplyWorkRequest) request).getQuantity());
                                    request.setStatus("Completed");
                                    JOptionPane.showMessageDialog(this, "Units Updated In Inventory");
                                break;}
                                else
                                    
                                {JOptionPane.showMessageDialog(container,"Insufficient stock in the inventory");
                                break;}
                        }
//                                else{
//                                JOptionPane.showMessageDialog(this, "Out of Stock. Please request supply from manufacturer.");
//                                break;
//                                }
                            }
            System.out.println("populate hoga table ab");
        populateTable();
        
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(container, "Bhak! ye sab galat hai");
        }
    }//GEN-LAST:event_supplyBtnActionPerformed

    private void manufacturernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manufacturernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manufacturernametxtActionPerformed

    private void addMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMedicineBtnActionPerformed
        // TODO add your handling code here:
        AddToInventoryJPanel managemed = new AddToInventoryJPanel(userProcessContainer, this.organization, enterprise, med);
        userProcessContainer.add("processWorkRequestJPanel", managemed);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addMedicineBtnActionPerformed

    private void viewInvenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewInvenBtnActionPerformed
        // TODO add your handling code here:
        ViewMedicineInventoryPage view = new ViewMedicineInventoryPage(userProcessContainer, organization, enterprise, med);
        userProcessContainer.add("ViewProductDetailJPanelSupplier", view);
   CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewInvenBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMedicineBtn;
    private javax.swing.JButton assignJButton;
    private javax.swing.JPanel container;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField manufacturernametxt;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JButton supplyBtn;
    private javax.swing.JButton viewInvenBtn;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
