/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

/**
 *
 * @author iankiew
 */
public class Cus_SelectedBooking {
    public String[] buttonDesign(String status) {
        String[] buttonInfo = new String[2];   //{hexcode, buttonText}
        if (status.equals("PENDING")) {
            buttonInfo[0] = "#943541";
            buttonInfo[1] = "Cancel Booking";
        } else if (status.equals("APPROVED")) {
            buttonInfo[0] = "#78866B";
            buttonInfo[1] = "Proceed to Payment";
        } else {
            buttonInfo[0] = "#78866B";
            buttonInfo[1] = "View Receipt";
        }
        
        return buttonInfo;
    }
    
    public void cancelBooking(String bookID){
        ArrayList<List> newBookData = new ArrayList<>();
        //get list of booking details
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        for (int row = 0; row < data.size(); row++) {
            if(bookID.equals(data.get(row).get(0))){
                continue; //ignore the booking to be deleted
            }
            newBookData.add(data.get(row));
        }
        
        //write new booking details into text file
        file.writeFile(newBookData);
    }
    
    public List<String> printReceipt(String id) {
        List<String> bInfo = new ArrayList<>();
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        for (int row = 1; row < data.size(); row++) {
            if(id.equals(data.get(row).get(0))){
                bInfo = data.get(row);
            }
        }
        
        return bInfo;
    }
    
    public String currentDateTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
        LocalDateTime now = LocalDateTime.now();  
        return dtf.format(now);
    }
    
    public String calculateRentalDuration(String start, String end){
        LocalDate startDate = LocalDate.parse(start);
        LocalDate endDate = LocalDate.parse(end);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
        String duration = String.valueOf(days);
        return duration;
    }
    
    public String pricePerDay(String subtotal, String day){
        int numOfDay = Integer.parseInt(day);
        int total = Integer.parseInt(subtotal);
        
        String price = Integer.toString(total / numOfDay);
        
        return price;
    }
}
