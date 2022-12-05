/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.EmergencyAdmin;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.UserAccount.UserAccount;
import model.WorkQueue.EmergencyWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aditya Illur
 */
public class ViewEmergencyRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewEmergencyRequestsJPanel
     */
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    public ViewEmergencyRequestsJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua=ua;
        this.system=system;
        
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        emergencyRequestJTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emergencyRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Patient", "Request Date and Time", "Patient Status"
            }
        ));
        jScrollPane1.setViewportView(emergencyRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 700, 110));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("COMPLETE");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jButton2.setBackground(new java.awt.Color(51, 51, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REFRESH");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 100, 40));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EMERGENCY DASHBOARD");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 250, 30));

        jButton6.setText("Back");
        jButton6.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CompleteEmergencyRequest completeRequest = new CompleteEmergencyRequest(userProcessContainer, ua, system);
        userProcessContainer.add("CompleteEmergencyRequest", completeRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable emergencyRequestJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) emergencyRequestJTable.getModel();
        model.setRowCount(0);
//        System.out.println("R is");
        System.out.println(system.getWorkQueue().getWorkRequestList());
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {
            

            if(request instanceof EmergencyWorkRequest){
                EmergencyWorkRequest er =(EmergencyWorkRequest) request;
                System.out.println("errrr"+er.getSender());
                System.out.println("errrr"+er.getStatus());
                System.out.println("errrr"+er.getRequestDate());
            if (er.getReceiver().equals(this.ua)) {
                
                  System.out.println("receiver is " + request.getReceiver());
                Object[] row = new Object[3];
                row[0] = er;
                row[1] = er.getRequestDate();
                row[2] = er.getStatus();
//                row[3] = emergencyWorkRequest.getP().get();
                model.addRow(row);
            }
    }}
    }
}

