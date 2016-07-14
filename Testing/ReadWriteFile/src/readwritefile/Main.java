/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readwritefile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author iHat3i
 */
public class Main extends JFrame implements ActionListener {
    
    public static void main(String[] args){
        new Main().setVisible(true);
    }
    public Main(){
        super("TROLOLOL");
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        Button button = new Button("DON'T CLICK");
        button.setActionCommand("button");
        Button button2 = new Button("wtf");
        
        
        setLayout (new FlowLayout());
        /**
         *FlowLayout
         * GridBagLayout
         * GridLayout
         * BorderLayout
        */
        
        add(button);
        add(button2);
    button.addActionListener(this);
    button2.addActionListener(this);
}

    @Override
    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        switch(action){
            case "wtf":
                
                System.out.println("?");
                this.dispose();
                break;
            case "button":
                System.out.println("LOLOLOL");
                break;
            
            
        }
    }
}
