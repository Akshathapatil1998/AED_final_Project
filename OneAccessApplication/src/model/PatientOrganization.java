/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import model.Role.CustomerRole;
import model.Role.Role;

/**
 *
 * @author pratiksannakki
 */
public class PatientOrganization extends Organization{

  private String patientName;
  private int patientID;
    public PatientOrganization() {
        super(Organization.Type.Patient.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> role = new ArrayList();
        role.add(new CustomerRole());
        return role;
        }
    
}