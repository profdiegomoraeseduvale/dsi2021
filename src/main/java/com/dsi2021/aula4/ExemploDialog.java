package com.dsi2021.aula4;

import javax.swing.JOptionPane;

public class ExemploDialog {

    public static void main(String[] args) {
        
        double primeiroValor, segundoValor, totalSoma;
        
        primeiroValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o primeiro valor:"));
        segundoValor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o segundo valor:"));
        
        totalSoma = primeiroValor + segundoValor;
        
        JOptionPane.showMessageDialog(null, "O resultado é: "+totalSoma);
        
        
    }
    
}
