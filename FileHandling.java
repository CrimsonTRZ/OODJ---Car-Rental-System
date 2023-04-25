/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrentalsystem;

import java.io.*;
import java.util.*;

/**
 *
 * @author iankiew
 */
public class FileHandling {
    private String filename;
    private String fileContent;
    private ArrayList<List> fileContentSplit = new ArrayList<>();
    
    public FileHandling(String file){
        filename = file;
    }
    
    public ArrayList<List> getfileContent(){
        return fileContentSplit;
    }
    
    public void readFile(){
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            while ((fileContent = br.readLine()) != null){
                String[] fContent = fileContent.split(", ");
                fileContentSplit.add(Arrays.asList(fContent));
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            System.out.println("File unreadable or does not exist.");
        }
    }
    
    public void writeFile(ArrayList<List> writeFileContent){
        try{
            FileWriter fw = new FileWriter(filename);
            BufferedWriter bw = new BufferedWriter(fw);
            
            String writeData;
            for (int row = 0; row < writeFileContent.size(); row++) {
                writeData = String.join(", ", writeFileContent.get(row));
                bw.write(writeData);
                bw.newLine();
            }
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("File unreadable or does not exist.");
        }
    }
    
    public void appendFile(String appendData){
        try{
            FileWriter fw = new FileWriter(filename, true);
            BufferedWriter bw = new BufferedWriter(fw);
            
            bw.write(appendData);
            bw.newLine();
            
            bw.close();
            fw.close();
        }
        catch(IOException e){
            System.out.println("File unreadable or does not exist.");
        }
    }
    
}

