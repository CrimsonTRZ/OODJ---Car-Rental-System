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
public class Cus_CardPayment extends Cus_Payment {
    
    public boolean checkCVV(String cvv){
        boolean valid = true;
        if(!(cvv.length() == 3 || cvv.length() == 4)){
            valid = false;
            JOptionPane.showMessageDialog(null, "CVV length should between 3-4 numbers", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        return valid;
    }
    
    public boolean checkExpiry(String expiry){
        boolean valid = true;
        if(!(expiry.matches("(?:0[1-9]|1[0-2])/[0-9]{2}"))){
            valid = false;
            JOptionPane.showMessageDialog(null, "INVALID card expiry date", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        return valid;
    }
    
    @Override
    public void displaySuccessMsg(){
        JOptionPane.showMessageDialog(null, "Credit/Debit Card Payment Successfully");
    }
}
