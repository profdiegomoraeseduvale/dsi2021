/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dsi2021.aula16;


import com.dsi2021.aula14.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author diegomoraes
 */
public class Conexao {
    
    public Connection conectarBanco() throws SQLException {
        
        Connection con;
        
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/dsi2021";
        String driver = "com.mysql.cj.jdbc.Driver";
        
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            System.out.println(con);
            return con;
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro: "+ex);
            return null;
        }
        
    }
    
}
