
package backEnd;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class Database{
    
    public File file = new File("inventory.dat");
    public int ID;
    public String title;
    public int duration;
    public String description;
    public boolean isRented;
    public int valueCount = 5;
    public List<String> data = new ArrayList<String>();

    
    
    
    public void GiveList(int arrayLoc) throws IOException{
        IO read = new IO(file,data,valueCount);
        
       data.addAll(read.Read(arrayLoc));
        ID = Integer.parseInt(data.get(0));
        title = data.get(1);
        duration = Integer.parseInt(data.get(2));
        description = data.get(3);
        isRented = Boolean.parseBoolean(data.get(3));
        
    }
    public Database() throws IOException{
        if(file.exists() != true) file.createNewFile();
    }
    public Database(int setID, String setTitle, int setDuration, String setDescription ,boolean setRent){
        ID = setID;
        title = setTitle;
        duration = setDuration;
        description = setDescription;
        isRented = setRent;
        
        data.add(Integer.toString(ID));
        data.add(title);
        data.add(Integer.toString(duration));
        data.add(description);
        data.add(Boolean.toString(isRented));
       
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
    
   public void addingVcr(){
       IO add = new IO(file,data,valueCount);
       add.Write();   
}
   public void delettingVcr() throws IOException{
       IO del = new IO(file,data,valueCount);
       del.delette(data.indexOf(ID) - 1);
    
   
}
   public void editVcr(int arrayLoc , List<String> newData) throws IOException{
       IO edit = new IO(file,data,valueCount);
       edit.edit(arrayLoc, newData);
       
       
   }
  

}
