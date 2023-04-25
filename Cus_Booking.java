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
public class Cus_Booking {
    private String ic, contact, email;
    
    public Cus_Booking(String[] values){
        ic = values[0];
        contact = values[1];
        email = values[2];
    }
    
    public List<String> bookingValidation(){
        List<String> errorField = new ArrayList<>();
        
        //ic/passport validation
        //ic/passport should consist at least one number
        if (!(ic.matches(".*[0-9].*")))
        {
            errorField.add("ic");
        }
        //ic/passport should consist alphanumeric only
        else if (!(ic.matches("^[a-zA-Z0-9]+$")))
        {
            errorField.add("ic");
        }
        //length of ic/passport should not less than 9 characters or exceed 12 characters
        else if (ic.length()<9 || ic.length()>12)
        {
            errorField.add("ic");
        }
        
        //contact number validation
        //contact number should contain numbers only
        if (!(contact.matches("[0-9]+")))
        {
            errorField.add("contact");  
        }
        //length of phone number should not less than 3 characters or exceed 15 characters
        else if (contact.length()<3 || contact.length()>15)
        {
            errorField.add("contact");  
        }
        
        //Check if email is in a valid format
        if (!(email.matches("^[A-Za-z0-9+_.-]+@(.+)$")))
        {
            errorField.add("email");
        }
        
        //return all error found
        return errorField;
    }
    
    public void storeNewBooking(String username, String model, String start, String end, String total) {
        //increment booking id
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        int maxID = 0;
        for (int row = 1; row < data.size(); row++) {
            //find the current largest id
            int id = Integer.parseInt(data.get(row).get(0).toString());
            if(id > maxID){
                maxID = id;
            }
        }
        maxID+=1;
        String bID = Integer.toString(maxID);
        
        //combine all details into a string
        String newBooking = bID + ", " + username + ", " + ic + ", " + contact + ", " + email + ", " + model + ", " + start + ", " +
                            end + ", " + total + ", " + "PENDING";
        
        //append info of the new customer to User.txt
        
        file.appendFile(newBooking);
    }
}
