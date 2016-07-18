/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;
import java.sql.*;
import business.cUsuario;
import javax.swing.*;
/**
 *
 * @author Jose
 */
public class db_loginconection {
    
    business.cUsuario u = new business.cUsuario();
     
    public void dbAccesoSistema(cUsuario u) throws Exception {
        
        String user = u.getUserName();
        String pass = u.getPassword();
         
        /* Querry */
        /*String SQL = "SELECT * FROM user";*/
        String SQL = "SELECT * FROM user WHERE userName='"+user+"' && password='"+pass+"'";
        JOptionPane.showMessageDialog(null, SQL);
        /* Variables */
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conetion = DriverManager.getConnection("jdbc:mysql://localhost:3306/cm_db","root","user");
        
            Statement st = conetion.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while(rs.next()){
                
                u.setName(rs.getString("firstName"));
                u.setLastName(rs.getString("lastName"));
                u.setRol(rs.getInt("Rol_idRol"));
                
            }           
                 
        } catch (Exception e) {
            
           throw e;
        }   
   
    }
    
    
    
}
