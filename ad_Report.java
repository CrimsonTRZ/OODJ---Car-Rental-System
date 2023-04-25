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
public class ad_Report {
    private ArrayList<String> carList = new ArrayList<>();
    private ArrayList<List> fileContentSplit = new ArrayList<>();
    
    public void setCarList(){
        FileHandling fh = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Booking.txt");
        fh.readFile();
        fileContentSplit = fh.getfileContent();

        for(int row = 1; row<fileContentSplit.size(); row++){
            String car = fileContentSplit.get(row).get(5).toString();
            if(carList.isEmpty()){
                carList.add(car);
            }
            else {
                if(!carList.contains(car)){
                carList.add(car);
                }
            }
        }
    }
    
    public ArrayList<String> calculateSalesReport(){
        ArrayList<String> carInfo = new ArrayList<>();
        
        for(int i = 0; i<carList.size(); i++){
            int car_quantity = 0, car_subtotal = 0;
            for(int row = 1; row<fileContentSplit.size(); row++){
                if(fileContentSplit.get(row).get(9).toString().equals("PAID") && 
                        carList.get(i).equals(fileContentSplit.get(row).get(5).toString())){
                    car_quantity += 1;
                    car_subtotal = car_subtotal + Integer.parseInt(fileContentSplit.get(row).get(8).toString());
                }
            }
            carInfo.add(carList.get(i));
            carInfo.add(Integer.toString(car_quantity));
            carInfo.add(Integer.toString(car_subtotal));
        }
        
        return carInfo;
    }
    
    public ArrayList<String> getCarList(){
        return carList;
    }
}
