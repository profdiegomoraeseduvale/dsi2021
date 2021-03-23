package com.dsi2021.aula5.pkg1;

public class Bicicleta {
    
    //Atributos
    public int cadenciaBicicleta;
    private int marchaBicicleta;
    protected double velocidadeBicicleta;
    
    //Métodos
    
    //Método Construtor sem passagem de parâmetros
    public Bicicleta(){
        
        cadenciaBicicleta = 50;
        velocidadeBicicleta = 23.3;
        
    }
    
     //Método Construtor com passagem de parâmetros
    public Bicicleta(int cadencia, double velocidade){
        
        cadenciaBicicleta = cadencia;
        velocidadeBicicleta = velocidade;
        
    }
    
    /*
    //Métodos sem retorno e parâmetros
    public void setCadencia(){        
        System.out.println("Ajustando a cadencia da bicicleta");        
    }
    
     public void setMarcha(){         
        System.out.println("Ajustando a marcha da bicicleta");        
    }
     
     public void setVelocidade(){         
        System.out.println("Ajustando a velocidade da bicicleta");        
    }
    
    */ 
    
    
     
    //Métodos com retorno e parâmetros e utilização de THIS
     public int setCadencia(int cadenciaBicicleta){        
          return this.cadenciaBicicleta = cadenciaBicicleta;  
    }
    
     public int setMarcha(int marchaBicicleta){         
          return this.marchaBicicleta = marchaBicicleta;      
    }
     
     public double setVelocidade(double velocidadeBicicleta){         
         return this.velocidadeBicicleta = velocidadeBicicleta;        
    }
    
    
    
}
