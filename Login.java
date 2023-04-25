/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author iankiew
 */
public class Login {
    private String username, password, userrole;
    
    public Login(){
        username = null;
        password = null;
        userrole = null;
    }
    
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public boolean checkLoginCredentials() {
        boolean valid = false;
        
        //read User.txt to verify the login credentials
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/User.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        for (int row = 0; row < data.size(); row++) {
            //when username & password stored in this row matched the user input
            if (data.get(row).get(3).equals(username) && data.get(row).get(4).equals(password)) {
                valid = true;
                userrole = data.get(row).get(5).toString();
                break;
            }
        }
        
        return valid;
    }
    
    public String getUserRole(){
        return userrole;
    }
    
    public void displayLoginSuccessMsg(){
        JOptionPane.showMessageDialog(null, "Login Successfully");
    }
   
}
