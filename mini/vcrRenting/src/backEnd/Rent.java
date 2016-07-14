
package backEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Rent {
    public File file = new File ("renting.dat");
    public int billID;
    public int vcrID;
    public String name;
    public Date[] date = new Date[1];
    public SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public List<String> data = new ArrayList<String>();
    public int valueCount =5;
    
    public void GiveList(int arrayLoc) throws IOException, ParseException{
        IO read = new IO(file,data,valueCount);
        
       data.addAll(read.Read(arrayLoc));
       billID = Integer.parseInt(data.get(2));
       vcrID = Integer.parseInt(data.get(1));
       name = data.get(0);
       date[0] = sdf.parse(data.get(3));
       date[1] = sdf.parse(data.get(4));
       
       
       
    
}
    public Rent(int setBill, String setName, int setVcr,  Date setDate, Date setEndDate ) throws IOException{
        name = setName;
        vcrID = setVcr;
        billID = setBill;
        date[0] = setDate;
        date[1] = setEndDate;
        
   data.add(Integer.toString(vcrID));
   data.add(Integer.toString(billID));
   data.add(name);
   data.add(sdf.format(date[0]));
   data.add(sdf.format(date[1]));
        
        
        
    }
    public Rent() throws IOException{
        if(file.exists() != true) file.createNewFile();
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
     
public void renting(){
   
    IO add = new IO(file,data,valueCount);
    add.Write();
    
             
         }
             public void unRenting(int idOfBill) throws IOException{
                 IO del =  new IO(file,data,valueCount);
                 
                 del.delette(data.indexOf(idOfBill) - 1 );
                 
      
  }
    
   
    
}
  
    

