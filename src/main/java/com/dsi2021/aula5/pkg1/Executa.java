package com.dsi2021.aula5.pkg1;

public class Executa {

    public static void main(String[] args) {
       
        //Instanciando o Objeto Bicicleta / Construtor sem parâmetros
        Bicicleta bC = new Bicicleta();
        
        //Instanciando o Objeto Bicicleta / Construtor com parâmetros
         Bicicleta bCp = new Bicicleta(50, 20.4);
        
        //Acessando atributos
        bC.cadenciaBicicleta = 50;
        bC.velocidadeBicicleta = 40.5;
        
        /*
        //Acessando métodos sem retorno e passagem de parâmetros
        bC.setCadencia();
        bC.setMarcha();
        bC.setVelocidade();
        */
        
        //Acessando métodos com retorno e passagem de parâmetros
        bC.setCadencia(40);
        bC.setMarcha(3);
        bC.setVelocidade(34.5);     
        
    }
    
}
