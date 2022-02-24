/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.democruddb;

/**
 *
 * @author khali
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        User us=  new User("khalil");
//        UserCrudImplement uci=new UserCrudImplement();
//        uci.createUser(us);
//            User us=new User(1, "first test");
//            UserCrudImplement uci=new UserCrudImplement();
//            uci.updateUser(us);
User us=new User();
us.setId(2);
UserCrudImplement uci=new UserCrudImplement();
uci.deleteUser(us);
        
    }
    
}
