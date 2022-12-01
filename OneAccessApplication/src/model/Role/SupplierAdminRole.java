/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.EcoSystem;
import model.UserAccount.UserAccount;

/**
 *
 * @author Akshatha
 */
public class SupplierAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new SupplierAdminJPanel(userProcessContainer, business,account);
    }
    
}
