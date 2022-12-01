/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author pratiksannakki
 */
public class EmergencyEnterprise extends Enterprise {

    public EmergencyEnterprise(String name) {
                         super(name,Enterprise.EnterpriseType.Insurance);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
                        ArrayList<Role> roles = new ArrayList();
        roles.add(new EmergencyAdminRole());
        return roles; 
    }
    
}
