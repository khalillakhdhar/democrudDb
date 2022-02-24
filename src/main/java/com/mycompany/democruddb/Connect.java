/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.democruddb;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author khali
 */
public class Connect {
    String dbURL = "jdbc:mysql://localhost:3306/mycruddb";
    String username = "root";
    String password = "";
    static Connection conn;

    public Connect() {
        try
        {
        conn= DriverManager.getConnection(dbURL, username, password);
        if (conn != null) {
System.out.println("Connected"); }
        }
        catch(Exception ex)
        {
            System.out.println("not connected");
        
        }
    }
    
    

    
}
