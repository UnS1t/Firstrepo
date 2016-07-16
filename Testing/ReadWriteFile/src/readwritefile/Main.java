/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;

import java.util.*;



/**
 *
 * @author iHat3i
 */
public class Main  {
    
    public static void main(String[] args){
        List <String> lol = new ArrayList<String>();
        List <String> test = new ArrayList<String>();
        
        for (int i = 0; i < 100; i++) {
            lol.add("1");
            
            
        }
        test.addAll(lol);
        test.add(null);
        lol.addAll(test);
        
       
            }
        
    
}
