/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backEnd;


    
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Client {
    public File file = new File("client.dat");
    public int ID;
    public String name;
    public String phone;
    public String address;
    public int valueCount = 4;
    public List<String> data = new ArrayList<String>();
    
   public void GiveList(int arrayLoc) throws IOException{
       IO read = new IO(file,data,valueCount);
        
       data.addAll(read.Read(arrayLoc * valueCount));
       ID = Integer.parseInt(data.get(0));
       name = data.get(1);
       phone = data.get(2);
       address = data.get(3);
       
   }
   public Client() throws IOException{
       if(file.exists() != true) file.createNewFile();
   }
    public Client(int setID, String setName,  String setPhone, String setAddress){
        ID = setID;
        name = setName;
        phone = setPhone;
        address = setAddress;
        data.add(Integer.toString(ID));
        data.add(name);
        data.add(phone);
        data.add(address);
        
        
    }

    
    public int ArraySize() throws FileNotFoundException{
        Scanner scan = new Scanner(file);
        int arrayCount = 0;
        while(scan.hasNext()){
            if("*".equals(scan.nextLine()))
                arrayCount += 1;
        }
        scan.close();
        return arrayCount;
    }
    
       public void addingClient(){
           IO add = new IO(file,data,valueCount);
           
           add.Write();
           
       
   }
   public void delettingClient(int arrayLoc) throws IOException{
       IO del = new IO(file,data,valueCount);
       del.delette(arrayLoc);
       
    
}
    
 
    
}
