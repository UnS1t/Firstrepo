/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vcrrenting;


    

import java.io.File;

public class Client {
    public File file = new File("client.dat");
    public String name;
    public int ID;
    public String phone;
    public String address;
   
    public Client(String setName, int setID, String setPhone, String setAddress){
        name = setName;
        ID = setID;
        phone = setPhone;
        address = setAddress;
        
    }
    
       public void addingClient(){
       
   }
   public void delettingClient(){
    
}
    
 
    
}
