/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import OOP.Project_manager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramy alaa
 */
public class DB_project_manager extends DB_employee implements  Project_manager {
    
    public int update (String table,String col, String col2,int id,String r){
    
    try {
          //  String v = "update  set no_task = '" + x + "' where project_id = '" + id + "' ";
            String v = " update " + table + " set " + col +" = '" + col2 + "' where " + id + " = '" + r + "' ";
//            c = connect();
            Statement s = c.createStatement();
            
             res = s.executeUpdate(v);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}

