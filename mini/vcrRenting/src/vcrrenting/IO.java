
package vcrrenting;
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;




public class IO {
    public File file;
    public List<String> data;
    public int valueCount;
    public IO(File setFile, List<String> setData){
        data.addAll(setData);
        file = setFile;
        valueCount = data.size();
    }
   
    
    public List Read() throws IOException{
        List<String> sendData = new ArrayList<String>();
        if(file.exists() != true) file.createNewFile();
        Scanner input = new Scanner(file);
        for (int i = 0; i < valueCount; i++) {
            sendData.add(input.nextLine());
            
        }
        input.close();
        return sendData;
    }
    
    
    
    
    public void Write(){
        try{
           PrintWriter output =  new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
           
           for(String txt : data) output.println(txt);
           
           output.println("*");
           
           output.close();
            
            
        }catch(IOException ex){
            System.out.println("Error: " + ex);
        }
        
    }
    public void edit(int arrayLocation,int line,String value) throws FileNotFoundException, IOException{
         PrintWriter output = new PrintWriter(file);
             List<String> editData = new ArrayList<String>();
            editData.addAll(data);
            
            editData.set(line + arrayLocation + 1, value );
            
            file.delete();
            file.createNewFile();
            for (String txt : editData)
                output.println(txt);
            output.close();
        }
    
    public void delette(int arrayLocation) throws FileNotFoundException, IOException{
        PrintWriter output =  new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
        List<String> newFileData = new ArrayList<String>();
        newFileData.addAll(data);
        for (int i = 0; i < data.size() + 1; i++) {
           newFileData.remove(arrayLocation + i); 
           
        }
        file.delete();
        file.createNewFile();
        
        for (String txt : newFileData )
            output.println(txt);
        
        output.close();
        
        
    
}
    
    
}
