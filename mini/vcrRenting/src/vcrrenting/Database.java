/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcrrenting;

import java.io.File;

public class Database{
    
    public File file = new File("inventory.dat");
    public String title;
    public int duration;
    public String description;
    public int ID;
    boolean isRented;
    public Database(String setTitle, int setDuration, String setDescription, int setID,boolean setRent){
        
        title = setTitle;
        duration = setDuration;
        description = setDescription;
        ID = setID;
        isRented = setRent;
       
    }
    
   public void addingVcr(){
       IO add = new IO(file);
       add.Write();
       
    
}
   public void delettingVcr(){
    IO del = new IO(file);
    del.Read();
}
  

}
