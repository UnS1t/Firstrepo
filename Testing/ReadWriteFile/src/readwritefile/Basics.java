/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;
import java.util.*;
import java.io.*;
public class Basics {
    public void yo(){
      File file = new File("test.txt");
    try{
     
        PrintWriter output = new PrintWriter(file);
        output.println("Jad Charara");
        output.println(20);
        output.close();
        
    }catch(IOException ex){
    
        System.out.printf("ERROR: %s\n", ex );
    }

    try{
    Scanner input = new Scanner(file);
    String name = input.nextLine();
    int age = input.nextInt();
    System.out.printf("Name: %s Age: %d\n", name ,age);
    }catch(FileNotFoundException ex){
        System.out.printf("ERROR: %s\n" , ex );
        }
    }
}