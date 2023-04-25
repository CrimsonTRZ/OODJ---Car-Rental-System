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
public class Cus_AvailableCars extends Cus_SelectDate {
    
    public Cus_AvailableCars(Date start, Date end){
        super(start, end);
    }
    
    public HashMap<String, Integer> inStockCars(){
        //store in stock quantity of each car
        HashMap<String, Integer> car = new HashMap<>();
        //read data from Car.txt
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Car.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent());
        for (int row = 1; row < data.size(); row++) {     //starts from second row, since the first row is column headers
            String carName = data.get(row).get(0).toString();
            int quantity = Integer.parseInt(data.get(row).get(4).toString());
            //store the car name as key, and in stock quantity as value
            car.put(carName, quantity);
        }
        
        return car;
    }
    
    public ArrayList<String> carOutOfStock() {
        ArrayList<String> carOutOfStock = new ArrayList<>();  
    
        for ( String key : countCarsOccupied().keySet() ) {
            Integer quan = inStockCars().get(key);
            Integer num = countCarsOccupied().get(key);
            if(quan-num == 0){
                carOutOfStock.add(key);
            }
        }
        
        return carOutOfStock;
    }
    
    public ArrayList<List> availableCars(){ 
        FileHandling file = new FileHandling("/Users/iankiew/NetBeansProjects/CarRentalSystem/src/TextFile/Car.txt");
        file.readFile();
        ArrayList<List> data = new ArrayList<>(file.getfileContent()); 
        data.remove(0);   //remove the column headers from data
        for (int row = 0; row < data.size(); row++) {     //starts from second row, since the first row is column headers
            if (carOutOfStock().contains(data.get(row).get(0).toString())){
                data.remove(row);
            }
        }
        
        return data;
    }

}
