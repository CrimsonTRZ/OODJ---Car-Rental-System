/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class ValidateFields {
    
    public boolean ValidateComboBox(int[] selectedIndex){
        boolean validComboItem = false;
        for(int val:selectedIndex){
            if(val == 0){
            JOptionPane.showMessageDialog(null, "<html>Please Select a <b>VALID</b> Status.", "Error Message", JOptionPane.ERROR_MESSAGE);
            validComboItem = false;
            break;
            }
            else{
                validComboItem = true;
            }
        }
        return validComboItem;
    }
    
    public boolean ValidateInteger(String[] txtFields){
        boolean ValidInteger = false;
            for(String str: txtFields){
                try{
                    int num = Integer.parseInt(str);
                    if (num != 0){
                        ValidInteger = true;
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "<html>Entered Integer Values <b>CANNOT</b> be zero.</html>", "Error Message", JOptionPane.ERROR_MESSAGE);
                        ValidInteger = false;
                        break;
                    }
                }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "<html>Please Enter a <b>VALID INTEGER</b> value.", "Error Message", JOptionPane.ERROR_MESSAGE);
                    ValidInteger = false;
                    break;
                }
            }
            return ValidInteger;
    }
}
