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
public class Cus_BankPayment extends Cus_Payment {
    
    @Override
    public void displaySuccessMsg(){
        JOptionPane.showMessageDialog(null, "Online Banking Payment Successfully");
    }

}
