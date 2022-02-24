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
            //create statetment
        String sql = "INSERT INTO user(nom) VALUES (?)"; // declaration de query
        PreparedStatement statement=  Connect.conn.prepareStatement(sql); // preparation de query
        
        statement.setString(1, u.getNom()); // passage des paramétre au lieu de ?
        statement.executeUpdate(); // retourne un int 

            System.out.println("ajouté");

        }
        catch(Exception ex)
        {
            System.out.println("ajout impossible");
        
        }



    }

    @Override
    public void updateUser(User u) {
 try{
        String sql = "UPDATE `user` SET `nom`=? WHERE `id`=?"; // corp de requete
        PreparedStatement statement=  Connect.conn.prepareStatement(sql); // preparation
        
        statement.setString(1, u.getNom()); // 1 la valeur u.getNom() d'ordre 1 remplace le 1er ?
        statement.setInt(2, u.getId());
        statement.executeUpdate(); // retourne un int 

            System.out.println("modifié");

        }
        catch(Exception ex)
        {
            System.out.println("modification impossible");
        
        }

    }

    @Override
    public void deleteUser(User u) {
try{
        String sql = "Delete FROM user WHERE `id`=?"; // corp de requete
        PreparedStatement statement=  Connect.conn.prepareStatement(sql); // preparation
        
       
        statement.setInt(1, u.getId());
        statement.executeUpdate(); // retourne un int 

            System.out.println("supprimé");

        }
        catch(Exception ex)
        {
            System.out.println("suppression impossible");
        
        }
    }
    
    
}
