/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.util.*;

/**
 *
 * @author iankiew
 */
abstract class Cus_Payment {
    public boolean numOnly (String[] values){
        //make sure the string consists of only numbers (digits between 0-9 & does not contains any special character)
        boolean num = true;
        for (int i = 0; i < values.length; i++) {
            try {
                Integer.parseInt(values[i]);
            } catch (NumberFormatException e) {
                num = false;
            }
        }
        return num;
    }
    
    public void updateStatus(String id){
        ArrayList<List> bInfo = new ArrayList<>();
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        for (int row = 0; row < data.size(); row++) {
            if(id.equals(data.get(row).get(0))){
                data.get(row).set(9,"PAID");
                bInfo.add(data.get(row));
            } else{
                bInfo.add(data.get(row));
            }
        }

        //write booking details with updated status into text file
        file.writeFile(bInfo);
    }
    
    public abstract void displaySuccessMsg();
}
