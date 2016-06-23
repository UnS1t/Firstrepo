
package readwritefile;
import java.io.*;
import java.util.*;


public class ReadWriteFile {

  
    public static void main(String[] args) throws IOException {
      
    File happyFile = new File("HappyFile.txt");
    FileWriter fileWriter = new FileWriter(happyFile, true);
    BufferedWriter buffer = new BufferedWriter(fileWriter);
    PrintWriter printWriter = new PrintWriter(buffer);
    if(happyFile.exists() == false){
        happyFile.createNewFile();
        
    }
  printWriter.print("hellow\n");
  printWriter.close();
  
    
    }
    

    
}
