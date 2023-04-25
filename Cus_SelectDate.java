/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author iankiew
 */
public class Cus_SelectDate {
    private Date startDate, endDate; 
    private String start, end;
    private String bID;
    
    public Cus_SelectDate(Date start, Date end){
        startDate = start;
        endDate = end;
    }
    
    public String[] getDates() {
        String[] dates = {start, end};
        return dates;
    }
    
    public String DateValidation() {
        //initiate variable for the error message
        String message="";
        
        //get current date
        Date current = new Date(); 
        
        //make sure dates are selected
        if (startDate==null || endDate==null)
        {
            message = "Please select a date";
            //JOptionPane.showMessageDialog(this, "Please fill in all fields", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        //Ensure that the date selected is a present date 
        else if (startDate.compareTo(current)<0 || endDate.compareTo(current)<0)
        {
            message = "Please choose a present date";
            //JOptionPane.showMessageDialog(this, "Please choose a present date", "Error Message", JOptionPane.ERROR_MESSAGE);            
        }
        //Ensure that return date is not smaller than pick-up date
        else if (endDate.compareTo(startDate)<=0)
        {
            message = "ERROR found on Return Date!";
            //JOptionPane.showMessageDialog(this, "ERROR Check-out Date!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        
        return message;
    }
    
    public void setBookingID(String id) {
        bID = id;
    }
    
    public ArrayList<String> allDates(String start, String end){
        LocalDate s = LocalDate.parse(start);
        ArrayList<String> allDates = new ArrayList<>();
        while (!s.isAfter(LocalDate.parse(end))) {
            allDates.add(s.toString());
            s = s.plusDays(1);
        }
        return allDates;
    }
    
    public ArrayList<String> CarsOccupied() {
        //convert the dates into desired format
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        start = sdf.format(startDate);
        end = sdf.format(endDate);
        
        //declare arraylist to store occupied cars
        ArrayList<String> occupiedcars = new ArrayList<>();
        
        //get all dates between the two selected dates
        ArrayList<String> selectedDates = new ArrayList<>(allDates(start, end)); 
        
        //loop through Booking.txt to find list of the occupied cars
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        for (int row = 1; row < data.size(); row++) {     //starts from second row, since the first row is column headers
            if(bID!=null && bID.equals(data.get(row).get(0).toString())){
                continue;
            }
            String sd = data.get(row).get(6).toString();
            String ed = data.get(row).get(7).toString();
            //get all dates between two dates in this row
            ArrayList<String> bookingDates = new ArrayList<>(allDates(sd,ed));
            //find if the booking dates are crashed with the selected dates
            bookingDates.retainAll(selectedDates);
            //if dates are crashed means that that specific car is occupied
            if (!bookingDates.isEmpty()){
                occupiedcars.add(data.get(row).get(5).toString());
            }
        }
        return occupiedcars;
    }
    
    public HashMap<String, Integer> countCarsOccupied(){
        // hashmap to store frequency of each occupied car
        HashMap<String, Integer> occCar = new HashMap<>();
 
        for (String car : CarsOccupied()) {   
            Integer num = occCar.get(car);  
            occCar.put(car, (num == null) ? 1 : num+1);
        }
        
        return occCar;
    }
    
    
}
