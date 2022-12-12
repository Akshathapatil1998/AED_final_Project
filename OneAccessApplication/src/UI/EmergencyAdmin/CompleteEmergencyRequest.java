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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aditya Illur
 */
public class CompleteEmergencyRequest extends javax.swing.JPanel {

    /**
     * Creates new form CompleteEmergencyRequestJPanel
     */
    JPanel userProcessContainer;
    UserAccount ua;
    EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public CompleteEmergencyRequest(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua=ua;
        this.system=system;
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {

            if (request.getReceiver().equals(this.ua)) {
                pNameTxtField.setText(request.getSender().getEmployee().getName());
                pAgeTxtField.setText(request.getStatus());
//                pPhoneTxtField.setText(emergencyWorkRequest.getP().getPhoneNumber());
//                pAddrTxtField.setText(emergencyWorkRequest.getP().getAddress());
            }
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

        patnamelbl = new javax.swing.JLabel();
        patientstatuslbl = new javax.swing.JLabel();
        pNameTxtField = new javax.swing.JTextField();
        pAgeTxtField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        imagelbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 246, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        patnamelbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        patnamelbl.setText("Patient Name:");
        add(patnamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 150, 40));

        patientstatuslbl.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        patientstatuslbl.setText("Patient Status:");
        add(patientstatuslbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 140, 30));
        add(pNameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 213, 180, 40));
        add(pAgeTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 180, 40));

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("MARK AS COMPLETE");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, 190, -1));

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("MARK AS INCOMPLETE");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, 200, -1));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 40));

        enterpriseLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        enterpriseLabel.setText("Complete Emergency Request");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 550, 40));

        imagelbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/emergency.PNG"))); // NOI18N
        add(imagelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 500, 310));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {

            if (request.getReceiver().equals(this.ua)) {
                request.setStatus("Help completed");
            }
                }
             dB4OUtil.storeSystem(system);
             JOptionPane.showMessageDialog(this, "Help completed");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
                        
        for (WorkRequest request : system.getWorkQueue().getWorkRequestList()) {

            if (request.getReceiver().equals(this.ua)) {
                request.setStatus("Help awaited!");
            }
                }
                         dB4OUtil.storeSystem(system);
                          JOptionPane.showMessageDialog(this, "Help Awaited.");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel imagelbl;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JTextField pAgeTxtField;
    private javax.swing.JTextField pNameTxtField;
    private javax.swing.JLabel patientstatuslbl;
    private javax.swing.JLabel patnamelbl;
    // End of variables declaration//GEN-END:variables
}
