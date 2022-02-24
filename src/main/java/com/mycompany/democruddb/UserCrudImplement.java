/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.democruddb;

import java.sql.PreparedStatement;

/**
 *
 * @author khali
 */
public class UserCrudImplement implements UserCrudInterface{
public Connect c=new Connect();

    @Override
    public void createUser(User u) {

        try{
        String sql = "INSERT INTO user(nom) VALUES (?)";
        PreparedStatement statement=  Connect.conn.prepareStatement(sql);
        
        statement.setString(1, u.getNom());
        statement.executeUpdate(); // retourne un int 


        }
        catch(Exception ex)
        {
            System.out.println("ajout impossible");
        
        }



    }

    @Override
    public void updateUser(User u) {
 try{
        String sql = "IUPDATE `user` SET `nom`=? WHERE `id`=?";
        PreparedStatement statement=  Connect.conn.prepareStatement(sql);
        
        statement.setString(1, u.getNom());
        statement.executeUpdate(); // retourne un int 


        }
        catch(Exception ex)
        {
            System.out.println("modification impossible");
        
        }

    }

    @Override
    public void deleteUser(User u) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
