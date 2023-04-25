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
public class Cus_Register {
    private String fName;
    private String lName;
    private String email;
    private String username;
    private String password;
    private String cPassword;
    
    
    public Cus_Register(String[] values){
        fName = values[0];
        lName = values[1];
        email = values[2];
        username = values[3];
        password = values[4];
        cPassword = values[5];
    }
    
    public List<String> registerValidation(){
        List<String> errorField = new ArrayList<>();
        
        //firstname & lastname should consist of alphabets only
        if (!(fName.matches("[a-zA-Z]+") && lName.matches("[a-zA-Z]+")))
        {
            errorField.add("names");
        }
        
        //Check if email is in a valid format
        if (!(email.matches("^[A-Za-z0-9+_.-]+@(.+)$")))
        {
            errorField.add("email");
        }
        
        
        //Username validation
        //ensure username does not have spaces
        List<String> userNameList = Arrays.asList(username.split(" ")); //split the username at spaces
        //if the size of username list is greater than 1, means that the username contains spaces, since the list split the string at spaces
        if (userNameList.size()>1)
        {
            errorField.add("username");
        }
        //ensure the length of username is between 6 to 30
        else if (username.length()<6 || username.length()>30)
        {
            errorField.add("username");
        }
        //Check if username is unique
        else
        {
            //read User.txt to get the existing username
            FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/User.txt");
            file.readFile();
            ArrayList<List> data = new ArrayList<>(file.getfileContent());
            for (int row = 0; row < data.size(); row++) {
                //if identical username is found
                if (data.get(row).get(3).equals(username)) {
                    errorField.add("usernameExist");
                    break;
                }
            }
        }
        
        //Password Validation
        //ensure password does not have spaces
        List<String> passWordList = Arrays.asList(password.split(" ")); //split the username at spaces
        //Password contains spaces
        if (passWordList.size()>1)
        {
            errorField.add("password");
        }
        //ensure the length of password is between 8 to 20
        else if (password.length()<8 || password.length()>20)
        {
            errorField.add("password");
        }
        //ensure password & confirm password is match
        else if(!(password.equals(cPassword)))
        {
            errorField.add("passwordNotMatch");
        }
        
        //return all error found
        return errorField;
    }
    
    public void storeNewCustomer() {
        //combine all details into a string
        String newUser = fName + ", " + lName + ", " + email + ", " + username + ", " + password + ", " + "customer";
        
        //append info of the new customer to User.txt
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/User.txt");
        file.appendFile(newUser);
    }
}
