/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramy alaa
 */
public class ddd {
    public static Connection c;
  public  ddd() throws SQLException{
        
         try {
             
             Class.forName("com.mysql.jdbc.Driver");
             c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project system","root","");
         } catch (ClassNotFoundException ex) {
             Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
         } 
       
  }  
  
}
