/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.SystemAdminWorkArea;

import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Employee.Employee;
import model.Enterprise;
import model.HospitalAdmin.Hospital;
import model.Organization;
import model.Role.HospitalAdminRole;
import model.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author pratiksannakki
 */
public class AddHospital extends javax.swing.JPanel {

    /**
     * Creates new form AddHospital
     */
  private JPanel userProcessContainer;
    private EcoSystem system;
private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public AddHospital(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dName = new javax.swing.JTextField();
        dspe = new javax.swing.JTextField();
        dUname = new javax.swing.JTextField();
        dPass = new javax.swing.JTextField();
        addHospital = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dName1 = new javax.swing.JTextField();
        dspe1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(240, 246, 232));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dName.setBackground(new java.awt.Color(204, 255, 255));
        dName.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 164, 40));

        dspe.setBackground(new java.awt.Color(204, 255, 255));
        dspe.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dspe, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 164, 40));

        dUname.setBackground(new java.awt.Color(204, 255, 255));
        dUname.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 164, 40));

        dPass.setBackground(new java.awt.Color(204, 255, 255));
        dPass.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 164, 40));

        addHospital.setBackground(new java.awt.Color(102, 204, 255));
        addHospital.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addHospital.setText("Add Hospital");
        addHospital.setPreferredSize(new java.awt.Dimension(156, 43));
        addHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHospitalActionPerformed(evt);
            }
        });
        add(addHospital, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 490, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 30));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 40));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Add Hospital");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, 300, 37));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "San francisco" }));
        jComboBox1.setPreferredSize(new java.awt.Dimension(140, 30));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 170, 40));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel2.setText("Hospital Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 133, 150, 30));

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel3.setText("Address");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 183, 110, 30));

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Username");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 393, 150, 30));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel5.setText("Password");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 433, 140, 30));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel6.setText("City Name");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 233, 130, 30));

        dName1.setBackground(new java.awt.Color(204, 255, 255));
        dName1.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 164, 40));

        dspe1.setBackground(new java.awt.Color(204, 255, 255));
        dspe1.setPreferredSize(new java.awt.Dimension(15, 30));
        add(dspe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 164, 40));

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel8.setText("Email");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 293, 110, 30));

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel9.setText("Phone Number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 343, 160, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/ezgif.com-gif-maker (1).gif"))); // NOI18N
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 630, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void addHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHospitalActionPerformed
        // TODO add your handling code here:
        if (dUname.getText().isEmpty() || dPass.getText().isEmpty() || dName.getText().isEmpty() || dspe.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter all mandatory fields");
        } else {

            if (!dName.getText().matches("[a-zA-Z_]+")) {
                JOptionPane.showMessageDialog(this, "Enter proper name! Name should be string!");
                dName.setText("");
                return;
            }
            else if(!dspe.getText().matches("\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)")) {
                JOptionPane.showMessageDialog(this, "Enter proper Address in the format of 123 abcd");
                dspe.setText("");
                return;
            }
            else if(!dName1.getText().matches("^(.+)@(.+)$")){
                JOptionPane.showMessageDialog(this, "Enter proper Email in the format of abc@gmail.com");
                dName1.setText("");
                return;
            }
            else if(!dspe1.getText().matches("^\\d{10}$")){
                JOptionPane.showMessageDialog(this, "Enter a 10 digit phone number");
                dspe1.setText("");
                return;
            }
            if (strongUsername() == false) {
                dUname.setText("");
                JOptionPane.showMessageDialog(null, "Username should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
                String userName = dUname.getText();
            }
            if (strongPassword() == false) {
                dPass.setText("");
                JOptionPane.showMessageDialog(null, "Password should be at least 6 digits and contain at least one upper case letter, one lower case letter, one digit and one special character $, *, # or &.");
                return;
            } else {
            }
            String name = dName.getText();
            String add = dspe.getText();
            String username = dUname.getText();
            String pass = dPass.getText();
            Object selectedItem = jComboBox1.getSelectedItem();

            String city = selectedItem.toString();
            //  System.out.println(system.getNetworkList().get(0).getEnterpriseDirectory().getEnterpriseList().get(0).getOrganizationDirectory().createOrganization(Organization.Type.HospitalAdmin));
            Employee emp = system.getEmployeeDirectory().createEmployee(name);
            emp.setCity(city);
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, pass, emp, new HospitalAdminRole());
            if (system.getNetworkList() == null || system.findNetwork(city) == null) {
                system.createNetwork(city);
                System.out.println("cities" + system.findNetwork(city));

            }

            if (system.findNetwork(city).getEnterpriseDirectory().getEnterpriseList() == null || system.findNetwork(city).getEnterpriseDirectory().findEnterprise(name) == null) {
                system.findNetwork(city).getEnterpriseDirectory().createAndAddEnterprise(name, Enterprise.EnterpriseType.Hospital);
                JOptionPane.showMessageDialog(null, "Hospital created");
                dName.setText("");
                dspe.setText("");
                dName1.setText("");
                dspe1.setText("");
                dUname.setText("");
                dPass.setText("");
            } else {
                // System.out.println("already there");
                JOptionPane.showMessageDialog(null, "Hospital already exists");
            }
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_addHospitalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addHospital;
    private javax.swing.JTextField dName;
    private javax.swing.JTextField dName1;
    private javax.swing.JTextField dPass;
    private javax.swing.JTextField dUname;
    private javax.swing.JTextField dspe;
    private javax.swing.JTextField dspe1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

 private boolean strongUsername() {
        Pattern pat = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m = pat.matcher(dUname.getText());
        boolean boo = m.matches();
        return boo;
    }

    private boolean strongPassword() {
        Pattern pat1;
        pat1 = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{6,}$");
        Matcher m1 = pat1.matcher(dPass.getText());
        boolean bat1 = m1.matches();
        return bat1;
    }
}

