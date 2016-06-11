/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcrrenting;
import java.io.*;
import java.util.Scanner;



public class IO {
    public File file;
    public IO(File setFile){
        file = setFile;
        
    }
    
    public void Read(){
        try{
       Scanner input = new Scanner(file);
       
        }catch(FileNotFoundException ex ){
            
            System.out.println("Error: the file " + file + " is not found!");
        }
    }
    
    public void Write(){
        try{
           PrintWriter output =  new PrintWriter(file);
           
           output.close();
            
            
        }catch(IOException ex){
            System.out.println("Error: " + ex);
        }
        
    }
    public void delette(){
    
}
    
}
