package com.dsi2021.aula5.pkg2;

import com.dsi2021.aula5.pkg1.Bicicleta;

public class Executa extends Bicicleta {

    public static void main(String[] args) {
        
        //Acesso somente ao atributo Public
        Bicicleta bC = new Bicicleta();        
        bC.cadenciaBicicleta = 50;
        
        //Acesso aos atributos Public e Protected
        Executa eX = new Executa();
        eX.cadenciaBicicleta = 50;
        eX.velocidadeBicicleta = 36.7;
    }
    
}
