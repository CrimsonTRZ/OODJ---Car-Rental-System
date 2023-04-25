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
public class Cus_BookingHistory {
    private ArrayList<String[]> tableData = new ArrayList<>();
    
    public void setBookingData(String user, int colNum){
        String[] tableRow = new String[colNum];
        int[] columnNo = {0,5,6,7,8,9};
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        for (int row = 1; row < data.size(); row++) {
            if(data.get(row).get(1).equals(user)){
                for(int i=0; i<colNum; i++){
                    tableRow[i] = data.get(row).get(columnNo[i]).toString();
                }
                tableData.add(tableRow);
                tableRow = new String[colNum];
            }
        }
    }
    
    public ArrayList<String[]> getBookingData(){
        return tableData;
    }

}
