/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsi2021.aula13;

import java.sql.SQLException;

/**
 *
 * @author diegomoraes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        Conexao conexao = new Conexao();
        conexao.conectarBanco();
        
    }
    
}
