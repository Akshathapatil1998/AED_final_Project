/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SupplierAdmin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.SupplierAdmin.Inventory;
import model.SupplierAdmin.Supplier;
import model.UserAccount.UserAccount;

/**
 *
 * @author Akshatha
 */
public class ViewUpdateDeleteInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdateDeleteInventoryJPanel
     */
            JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
     private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public ViewUpdateDeleteInventoryJPanel(JPanel userProcessContainer,UserAccount userAccount, EcoSystem system) {
        initComponents();
                this.userProcessContainer = userProcessContainer;
        this.userAccount= userAccount;
        this.system=system;
        populateTable();
    }
        private void populateTable() {
        
                DefaultTableModel model = (DefaultTableModel) plansJTable.getModel();
        model.setRowCount(0);
       Supplier supplier= system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getSupplierDirectory().findSupplier(userAccount.getEmployee().getName());
                

            for(Inventory i: supplier.getInventoryDirectory().getInventoryList()){
            Object[] row = new Object[4];
            row[0] = i;
            row[1] = i.getManufacturername();
            row[2] = i.getProductprice();
            row[3] = i.getAvailability();

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

        unitsTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        yrsTxtField = new javax.swing.JTextField();
        monthlTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        plansJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        unitsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitsTxtFieldActionPerformed(evt);
            }
        });
        add(unitsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 150, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Inventory Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Manufacturer:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 117, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Price per unit");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Units available");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, -1, -1));

        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 150, -1));

        yrsTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yrsTxtFieldActionPerformed(evt);
            }
        });
        add(yrsTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 150, -1));

        monthlTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlTxtFieldActionPerformed(evt);
            }
        });
        add(monthlTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 150, -1));

        plansJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Inventory Name", "Manufacturer", "Price per unit", "Units available"
            }
        ));
        plansJTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                plansJTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(plansJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 526, 100));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("MANAGE INVENTORY");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 200, 30));

        jButton6.setBackground(new java.awt.Color(51, 51, 255));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/p7.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 330, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void unitsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unitsTxtFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = plansJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {
            if (!nameTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper inventory item name");
                nameTxtField.setText("");
                return;
            } else if (!yrsTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper manufacturer name");
                yrsTxtField.setText("");
                return;
            } else if (!monthlTxtField.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Enter price in Integers");
                monthlTxtField.setText("");
                return;
            }  else if (!unitsTxtField.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Enter availability in Integers");
                unitsTxtField.setText("");
                return;
            }
            else{}
            //            updateJPanel.setVisible(true);

            Inventory i = (Inventory) plansJTable.getValueAt(selectedRow, 0);
            //            System.out.println("item : " + t.getName());
            i.setName(nameTxtField.getText());
            i.setManufacturername(yrsTxtField.getText());
            i.setProductprice(Integer.parseInt(monthlTxtField.getText()));
            i.setAvailability(Integer.parseInt(unitsTxtField.getText()));
            populateTable();
            nameTxtField.setText("");
            yrsTxtField.setText("");
            monthlTxtField.setText("");
            unitsTxtField.setText("");

        }
        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        int selectedRow = plansJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            Inventory i = (Inventory) plansJTable.getValueAt(selectedRow, 0);
            Supplier supplier= system.findNetwork(userAccount.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(userAccount.getEmployee().getName()).getOrganizationDirectory().getSupplierDirectory().findSupplier(userAccount.getEmployee().getName());
            supplier.getInventoryDirectory().deleteInventoryItem(i);
            JOptionPane.showMessageDialog(null, "Inventory item " + nameTxtField.getText() + " deleted");
            populateTable();
            nameTxtField.setText("");
            nameTxtField.setText("");
            yrsTxtField.setText("");
            monthlTxtField.setText("");
            unitsTxtField.setText("");

        }
        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void yrsTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yrsTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yrsTxtFieldActionPerformed

    private void monthlTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlTxtFieldActionPerformed

    private void plansJTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plansJTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) plansJTable.getModel();
        String name = dtm.getValueAt(plansJTable.getSelectedRow(), 0).toString();
        String manufacturer = (dtm.getValueAt(plansJTable.getSelectedRow(), 1).toString());
        int price = Integer.parseInt(dtm.getValueAt(plansJTable.getSelectedRow(), 2).toString());
        int avail = Integer.parseInt(dtm.getValueAt(plansJTable.getSelectedRow(), 3).toString());

        nameTxtField.setText(name);
        yrsTxtField.setText(String.valueOf(manufacturer));
        monthlTxtField.setText(String.valueOf(price));
        unitsTxtField.setText(String.valueOf(avail));

    }//GEN-LAST:event_plansJTableMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monthlTxtField;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTable plansJTable;
    private javax.swing.JTextField unitsTxtField;
    private javax.swing.JTextField yrsTxtField;
    // End of variables declaration//GEN-END:variables
}
