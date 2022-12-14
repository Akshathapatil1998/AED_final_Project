/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CustomerRole;

import UI.HospitalAdminRole.sms;
import model.DB4OUtil.DB4OUtil;
import model.EcoSystem;
import model.Enterprise;
import model.HospitalAdmin.Hospital;
import model.Organization;
import model.Patient.Patient;

import model.UserAccount.UserAccount;
import model.WorkQueue.BookAppointment;
import model.WorkQueue.EmergencyWorkRequest;
import model.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


/**
 *
 *
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerAreaJPanel
     */
    
    
    private JPanel userProcessContainer;
    private UserAccount user;
    private EcoSystem system;
    private String hospitalName;
    private String docname;
    private String timings;
    private Hospital resObj;
    ArrayList<Patient> array1;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    
    
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount user,EcoSystem system) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.user = user;
        array1 = new ArrayList<>();
        jPanel1.setVisible(false);
        //valueLabel.setText(enterprise.getName());
        populateComboBox();
    }

     public void populateRequestTable(){
        
    }

    public void populateComboBox(){
         for(Enterprise res: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList()){
             if(res.getEnterpriseType().getValue().equals("Hospital")){
            restList.addItem(res.getName());
         
        }else{
                 System.out.println("nothing");
             }
         }
    }
    public void populateComboBox1(String hospname){
         for(Organization org: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getOrganizationList()){
             if(org.getEnterpriseType1().getValue().equals("Doctor")){
            restList1.addItem(org.getName());
             }
        }
        
          
            
    }
    public void populateComboBox2(String docs){
        System.out.println(hospitalName+docs +" asasas");
       
         for(String timings: system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).getTimings()){
            restList2.addItem(timings);
         
        }
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        restList = new javax.swing.JComboBox<>();
        restList1 = new javax.swing.JComboBox<>();
        restList2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        doctorDetails1 = new javax.swing.JTable();
        InsuranceJButton = new javax.swing.JButton();
        OrderBtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        OrderBtn1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("PATIENT DASHBOARD");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 480, 50));

        restList.setBackground(new java.awt.Color(204, 255, 255));
        restList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restListActionPerformed(evt);
            }
        });
        add(restList, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 293, -1));

        restList1.setBackground(new java.awt.Color(204, 255, 255));
        restList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList1ActionPerformed(evt);
            }
        });
        add(restList1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 293, -1));

        restList2.setBackground(new java.awt.Color(204, 255, 255));
        restList2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restList2ActionPerformed(evt);
            }
        });
        add(restList2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 293, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Submit Appointment");
        jButton1.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 180, -1));

        jTextArea1.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 300, -1));

        jButton2.setBackground(new java.awt.Color(102, 204, 255));
        jButton2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton2.setText("Check prescription");
        jButton2.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 230, 190, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        doctorDetails1.setBackground(new java.awt.Color(204, 255, 204));
        doctorDetails1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "medicine 1", "medicine 2", "medicine 3", "comments"
            }
        ));
        doctorDetails1.setPreferredSize(new java.awt.Dimension(375, 100));
        jScrollPane2.setViewportView(doctorDetails1);

        jPanel1.add(jScrollPane2);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 520, 170));

        InsuranceJButton.setBackground(new java.awt.Color(102, 204, 255));
        InsuranceJButton.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        InsuranceJButton.setText("Check Insurance Plans");
        InsuranceJButton.setPreferredSize(new java.awt.Dimension(156, 43));
        InsuranceJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsuranceJButtonActionPerformed(evt);
            }
        });
        add(InsuranceJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 80, 190, -1));

        OrderBtn.setBackground(new java.awt.Color(102, 204, 255));
        OrderBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        OrderBtn.setText("Order Medicine");
        OrderBtn.setPreferredSize(new java.awt.Dimension(156, 43));
        OrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBtnActionPerformed(evt);
            }
        });
        add(OrderBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 280, 190, -1));

        jButton4.setBackground(new java.awt.Color(102, 204, 255));
        jButton4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton4.setText("Book Test ");
        jButton4.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 130, 190, -1));

        jButton5.setBackground(new java.awt.Color(102, 204, 255));
        jButton5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jButton5.setText("Help");
        jButton5.setPreferredSize(new java.awt.Dimension(156, 43));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(546, 180, 190, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("Appointmant Time");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 130, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setText("Select Hospital");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 110, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setText("Select Doctor");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setText("Appointment Date");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 130, -1));

        jDateChooser1.setBackground(new java.awt.Color(204, 255, 255));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 290, -1));

        OrderBtn1.setBackground(new java.awt.Color(51, 51, 255));
        OrderBtn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        OrderBtn1.setText("Order Medicine");
        OrderBtn1.setPreferredSize(new java.awt.Dimension(156, 43));
        OrderBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderBtn1ActionPerformed(evt);
            }
        });
        add(OrderBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 204, 204));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("Give Feedback");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 160, 40));

        jTextArea2.setBackground(new java.awt.Color(204, 255, 255));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 399, 190, 120));

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Images/patientui.PNG"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 670));
    }// </editor-fold>//GEN-END:initComponents

    private void restListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restListActionPerformed
        restList1.removeAllItems();
        restList2.removeAllItems();
        hospitalName = String.valueOf(restList.getSelectedItem());
        populateComboBox1(hospitalName);
    }//GEN-LAST:event_restListActionPerformed

    private void restList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList1ActionPerformed
        // TODO add your handling code here:
        restList2.removeAllItems();
        docname = String.valueOf(restList1.getSelectedItem());
        System.out.println(docname + " asasas");
        populateComboBox2(docname);

    }//GEN-LAST:event_restList1ActionPerformed

    private void restList2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restList2ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_restList2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        timings = String.valueOf(restList2.getSelectedItem());
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.getDefault());
        Date d = jDateChooser1.getDate();
        BookAppointment appointment = new BookAppointment();
        appointment.setSender(user);
        System.out.println("ajcjac       "+system.getUserAccountDirectory().findUserAccount(docname));
        appointment.setReceiver(system.getUserAccountDirectory().findUserAccount(docname));
        appointment.setStatus("Appointment Booked");
        appointment.setMessage(jTextArea1.getText());

        appointment.setRequestDate(d);
        system.getWorkQueue().addWorkRequest(appointment);
        system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().findEnterprise(hospitalName).getOrganizationDirectory().getDoctorDirectory().findDoctor(docname).updateTimings(timings);
        JOptionPane.showMessageDialog(this, "Appointment fixed");
        dB4OUtil.storeSystem(system);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel dtm = (DefaultTableModel) doctorDetails1.getModel();
        dtm.setRowCount(0);
       
        for(WorkRequest wq : system.getWorkQueue().findWorkRequestByRec(user)) {
            if(wq instanceof BookAppointment){
                if(wq.getSender().getEmployee().getName().equals(user.getEmployee().getName())){
                System.out.println("comm" + ((BookAppointment) wq).getComment());
           Object row[] = new Object[5];
            row[0] = wq.getSender().getEmployee().getName();
            row[1] = ((BookAppointment) wq).getMed().getMedicine().get(0);
            row[2] = ((BookAppointment) wq).getMed().getMedicine().get(1);
            row[3] = ((BookAppointment) wq).getMed().getMedicine().get(2);
            row[4]=((BookAppointment) wq).getComment();
            dtm.addRow(row);
            }}}
           
        

         jPanel1.setVisible(true);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void InsuranceJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsuranceJButtonActionPerformed
        // TODO add your handling code here:
        if(this.user.getEmployee().isHasInsurance()){

            ViewCurrentPlans viewCurrentPlans = new ViewCurrentPlans(userProcessContainer, user, system);
            userProcessContainer.add("viewCurentPlans", viewCurrentPlans);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
        else {
            ViewInsurancePlans viewInsurance = new ViewInsurancePlans(userProcessContainer, user, system);
            userProcessContainer.add("viewInsurance", viewInsurance);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
    }//GEN-LAST:event_InsuranceJButtonActionPerformed

    private void OrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtnActionPerformed
        // TODO add your handling code here:
        orderMedJpanel orderJPanel = new orderMedJpanel(userProcessContainer, user, system, user.getEmployee().getName());
        userProcessContainer.add("CreateSupport", orderJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_OrderBtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        BookTestJPanel bookTest = new BookTestJPanel(userProcessContainer, user, system);
        userProcessContainer.add("BookTest", bookTest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Random random_method = new Random();

        ArrayList<Enterprise> e = system.findNetwork(user.getEmployee().getCity()).getEnterpriseDirectory().getEnterpriseList();

        int index = 0;
        UserAccount name3 = null;
        for (Enterprise res:e)
        {
            System.out.println("sss1" + e);
            System.out.println("sss1" + res.getEnterpriseType().getValue());
            if(res.getEnterpriseType().getValue().equals("Emergency")){
                System.out.println("sss" + res.getName());
                ArrayList<Enterprise> array1 =new ArrayList<>();
                array1.add(res);
                index = random_method.nextInt(array1.size());
                name3 = system.getUserAccountDirectory().findUserAccount(array1.get(index).getName());

            }

        }
        EmergencyWorkRequest emergencyWorkRequest = new EmergencyWorkRequest();

        emergencyWorkRequest.setSender(this.user);

        //            System.out.println("getting sender uname "+name3.getEmployee().getName());
        emergencyWorkRequest.setReceiver(name3);

        System.out.println("asasqqqq555 " + emergencyWorkRequest.getReceiver());
        emergencyWorkRequest.setStatus("emergency assistance needed");

        system.getWorkQueue().addWorkRequest(emergencyWorkRequest);
        System.out.println("wooook" + system.getWorkQueue().getWorkRequestList());
        JOptionPane.showMessageDialog(this, "Help is on the way!");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void OrderBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OrderBtn1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        sms.smms(jTextArea2.getText());
        jTextArea2.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton InsuranceJButton;
    private javax.swing.JButton OrderBtn;
    private javax.swing.JButton OrderBtn1;
    private javax.swing.JTable doctorDetails1;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> restList;
    private javax.swing.JComboBox<String> restList1;
    private javax.swing.JComboBox<String> restList2;
    // End of variables declaration//GEN-END:variables
}
