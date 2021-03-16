package com.dsi2021.aula4;

import javax.swing.JOptionPane;


public class DialogsJava {

  
    public static void main(String[] args) {
        
        String nomeAluno;
        
        nomeAluno =  JOptionPane.showInputDialog(null, "Digite seu nome");
        
        JOptionPane.showMessageDialog(null, nomeAluno);
        
        
    }
    
}
