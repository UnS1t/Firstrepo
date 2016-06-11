
package vcrrenting;

import java.io.File;
import java.util.Date;

public class Rent {
    public File file = new File ("renting.dat");
    public String name;
    public int vcrID;
    public int billID;
    public Date[] date = new Date[2];
    
    public Rent(String setName, int setVcr, int setBill, Date setDate ){
        name = setName;
        vcrID = setVcr;
        billID = setBill;
        date[1] = setDate;
        
            
    }
public void renting(){
    
    
             
         }
             public void unRenting(){
      
  }
    
   
    
}
  
    

