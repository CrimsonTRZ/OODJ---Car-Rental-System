/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.*;

/**
 *
 * @author iankiew
 */
public class CommonFunction {
    //function for displaying JFrame
    public void DisplayForm(JFrame display){
        display.setVisible(true);
        display.setLocationRelativeTo(null);   //set JFrame to center of screen
    }
    
    //function for displaying JFrame & dispose current JFrame
    public void DisplayDisposeForm(JFrame display, JFrame hide){
        display.setVisible(true);
        display.setLocationRelativeTo(null);
        hide.dispose();
    }
    
    public boolean checkEmpty(String[] values) {
        boolean empty = false;
        //for each element in the array 
        for (String value : values) {
            //if the element is empty, break the loop
            if(empty = value.isBlank()){
                JOptionPane.showMessageDialog(null, "<html>Please fill up <b>ALL</b> fields.</html>", "Error Message", JOptionPane.ERROR_MESSAGE);
                empty = true;
                break;
            }
        }
        return empty;
    }
    
    public String calculateSubtotal(String car, String start, String end){
        long subtotal, price = 0;
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        FileHandling fh = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Car.txt");
        fh.readFile();
        for(int i = 1; i< fh.getfileContent().size();i++){
            if(car.equals(fh.getfileContent().get(i).get(0).toString())){
                price = Integer.parseInt(fh.getfileContent().get(i).get(3).toString());
            }
        }
        
        LocalDate startDate = LocalDate.parse(start, dtf);
        LocalDate endDate = LocalDate.parse(end, dtf);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        
        subtotal = price * days;
        String strSubtotal = String.valueOf(subtotal);
        
        return strSubtotal;
    }
}
