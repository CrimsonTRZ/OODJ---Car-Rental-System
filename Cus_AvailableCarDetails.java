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
public class Cus_AvailableCarDetails {
    private ArrayList<List> availableCarList = new ArrayList<>();
    private ArrayList<List> cars = new ArrayList<>();
    private int index = 0;
    
    public void setCarList(ArrayList<List> carList){
        availableCarList = carList;
    }

    public ArrayList<String> availableCarBrands() {
        ArrayList<String> brand = new ArrayList<>();
        for (int row = 0; row < availableCarList.size(); row++){
            String[] carSplit = availableCarList.get(row).get(0).toString().split(" ", 2);
            if(!brand.contains(carSplit[0])){
               brand.add(carSplit[0]);
            }
            
        }
        
        return brand;
    }
    
    public void setCarsFromBrand(String selectedBrand){
        for (int row = 0; row < availableCarList.size(); row++){
            String[] carInfo = availableCarList.get(row).get(0).toString().split(" ", 2);
            if(selectedBrand.equals(carInfo[0])){
                List<String> carData = new ArrayList<>(availableCarList.get(row));
                carData.set(0,carInfo[1]);
                carData.add(carInfo[0]);
                cars.add(carData);
            }
        }
    }
    
    public ArrayList<List> getCarsFromBrand(){
        return cars;
    }
    
    public void setIndex(String command){
        int size = getCarsFromBrand().size() - 1;
        if(command.equals("next")){
            if(index!=size){
                index+=1;
            }
        } else if(command.equals("prev")) {
            if(index!=0){
                index-=1;
            }
        }
    }
    
    public int getIndex(){
        return index;
    }

}
