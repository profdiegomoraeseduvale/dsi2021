package com.dsi2021.aula4;


public class Tipos {

  
    public static void main(String[] args) {
        
       System.out.println(
        
        
        //Byte
        "Menor Valor " + Byte.MIN_VALUE + "\n" +
        "Maior Valor " + Byte.MAX_VALUE + "\n" +
                
        //Short
        "Menor Valor " + Short.MIN_VALUE + "\n" +
        "Maior Valor " + Short.MAX_VALUE + "\n" +
        
        //Integer
        "Menor Valor " + Integer.MIN_VALUE + "\n" +
        "Maior Valor " + Integer.MAX_VALUE + "\n" +
        
       //Long
        "Menor Valor " + Long.MIN_VALUE + "\n" +
        "Maior Valor " + Long.MAX_VALUE + "\n" +
       
       //Float
        "Menor Valor " + Float.MIN_VALUE + "\n" +
        "Maior Valor " + Float.MAX_VALUE + "\n" +
       
        //Double
        "Menor Valor " + Double.MIN_VALUE + "\n" +
        "Maior Valor " + Double.MAX_VALUE + "\n" +
       
        //Char
        "Menor Valor " + (int) Character.MIN_VALUE + "\n" +
        "Maior Valor " + (int) Character.MAX_VALUE + "\n" +
        
        //Boolean
        "Verdadeiro = True" + "\n" +
        "Falso = False"   + "\n"        
        
         
        
        );
        
        //Declaração variável sem atribuição
        int idadeAluno;
        idadeAluno = 20;
        
        //Declaração variável com atribuição
        int idadeAluno2 = 40;
        
        //Tipo Float
        float valorFloat = 1.5f;
        
        //Tipo String
        String nomeAluno = "Diego Moraes";
        
        //Tipo Char
        char valorChar = 'S';
        
        //Tipo Long
        long valorCPF = 111_111_111_11L;
        
        
        System.out.println(valorCPF);
    }
    
}
