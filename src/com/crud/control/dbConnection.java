/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.control;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Ronel_Ilao
 */
public class dbConnection {
     private static final String username = "root";
    private static final String password = "";
    private static final String db_con = "jdbc:mysql://localhost:3306/pays";
            
            
            private static Connection conn;
            private static dbConnection dbc;
    public dbConnection(){
        conn = null;
        try{
            conn = DriverManager.getConnection(db_con,username,password);
           System.out.print("connected");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
     
    public static dbConnection getdbConnection(){
        if(dbc == null){
            dbc = new dbConnection();
        }
        
        return dbc;
    }
    
    public Connection getConnection(){
        return conn;
    }
}
