/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise;
import static model.Organization.Type.InsuranceAdmin;
import static model.Role.Role.RoleType.InsuranceAdmin;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pratiksannakki
 */
public class UpdateDeleteInsuranceCompany extends javax.swing.JPanel {

    /**
     * Creates new form UpdateDeleteInsuranceCompany
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount user;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public UpdateDeleteInsuranceCompany(JPanel userProcessContainer, EcoSystem system, UserAccount user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system=system;
        this.user = user;
        if(system.getNetworkList().size()>0 ){
            populateTable();
        }else{
             JOptionPane.showMessageDialog(null, "No Labs added");
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

        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        labTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        addrTxtField = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Username:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 70, -1));

        jButton3.setBackground(new java.awt.Color(0, 0, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton3.setRequestFocusEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 240, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.setRequestFocusEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        labTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "UserName"
            }
        ));
        labTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(labTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, 110));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel5.setText("INSURANCE DETAILS");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 390, 37));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "San francisco" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(140, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 170, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("City Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, 20));

        jButton4.setBackground(new java.awt.Color(0, 0, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("Back");
        jButton4.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "San francisco" }));
        jComboBox2.setPreferredSize(new java.awt.Dimension(140, 30));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 170, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 315, 80, -1));

        nameTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        nameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtFieldActionPerformed(evt);
            }
        });
        add(nameTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 304, 150, -1));

        addrTxtField.setPreferredSize(new java.awt.Dimension(164, 30));
        addrTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrTxtFieldActionPerformed(evt);
            }
        });
        add(addrTxtField, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:

        Object selectedItem = jComboBox1.getSelectedItem();
        String city = selectedItem.toString();
        int selectedRow = labTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row.");

        } else {
            Enterprise lab = (Enterprise) labTable.getValueAt(selectedRow, 0);
            system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList().remove(lab);
            UserAccount ua = system.getUserAccountDirectory().findUserAccount(lab.getName());
            system.getUserAccountDirectory().getUserAccountList().remove(ua);

            //            LabDirectory ld = system.getLabDirectory();
            //            ld.deleteLab(l);
            JOptionPane.showMessageDialog(null, "Lab " + nameTxtField.getText() + " deleted");
            populateTable();
            nameTxtField.setText("");
            addrTxtField.setText("");

        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        int selectedRow = labTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        } else {

            //            updateJPanel.setVisible(true);
            //            System.out.println("I am here");
            Object selectedItem = jComboBox1.getSelectedItem();
            String city = selectedItem.toString();
            //    for(Enterprise lab: system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList()){
                //        if lab.getName().equals(selectedItem)
                //    }
            Enterprise lab = (Enterprise) labTable.getValueAt(selectedRow, 0);
            UserAccount ua = system.getUserAccountDirectory().findUserAccount(lab.getName());
            if (!nameTxtField.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                nameTxtField.setText("");
                return;
            }
            else if (strongUsername() == false) {

                addrTxtField.setText("");
                JOptionPane.showMessageDialog(null, "should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            }else {
            }
            lab.setName(nameTxtField.getText());
            ua.getEmployee().setName(nameTxtField.getText());
            ua.setUsername(addrTxtField.getText());
            populateTable();
            nameTxtField.setText("");
            addrTxtField.setText("");
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void labTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labTableMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dtm = (DefaultTableModel) labTable.getModel();

        String name = dtm.getValueAt(labTable.getSelectedRow(), 0).toString();
        String address = dtm.getValueAt(labTable.getSelectedRow(), 1).toString();
        nameTxtField.setText(name);
        addrTxtField.setText(address);
    }//GEN-LAST:event_labTableMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        //
        //        Component[] comps = this.userProcessContainer.getComponents();
        //        for(Component comp : comps){
            //            if(comp instanceof SystemAdminWorkAreaJPanel){
                //                SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel= (SystemAdminWorkAreaJPanel) comp;
                //                systemAdminWorkAreaJPanel.populateTree();
                //            }
            //        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void nameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTxtFieldActionPerformed

    private void addrTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrTxtFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addrTxtField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTable;
    private javax.swing.JTextField nameTxtField;
    // End of variables declaration//GEN-END:variables

private void populateTable() {
        Object selectedItem = jComboBox1.getSelectedItem();
        String city = selectedItem.toString();
        DefaultTableModel model = (DefaultTableModel) labTable.getModel();
        model.setRowCount(0);
        System.out.println("Ap was here " +city);
        System.out.println("ap here " +system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList());

        for(Enterprise lab: system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList()){
                     System.out.println(lab.getEnterpriseType().getValue().equals("Insurance"));
                     System.out.println(lab.getUserAccountDirectory().getUserAccountList());
                     System.out.println(lab.getName());
                     System.out.println(lab.getUserAccountDirectory().findUserAccount(lab.getName()));
                if(lab.getEnterpriseType().getValue().equals("Insurance")){
            Object[] row = new Object[2];
            row[0] = lab;
            System.out.println("LISTING IT" +system.getUserAccountDirectory().getUserAccountList());
            System.out.println(lab.getName());
                     for(UserAccount net : system.getUserAccountDirectory().getUserAccountList()){
                         System.out.println(net.getEmployee().getName());
         }
            UserAccount ua = system.getUserAccountDirectory().findUserAccount(lab.getName());
            row[0]=ua;
            row[1] = ua.getUsername();
            model.addRow(row);
 
        }
        }
    }

    private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(addrTxtField.getText());
        boolean boo = m.matches();
        return boo;
    }

  
}
