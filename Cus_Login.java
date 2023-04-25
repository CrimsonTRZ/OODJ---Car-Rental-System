/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author iankiew
 */
public class Cus_Login extends Login {
    @Override
    public void displayLoginSuccessMsg(){
        JOptionPane.showMessageDialog(null, "Customer Login Successfully");
    }
}
