/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import GUI.Modify1;
import OOP.Admin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramy alaa
 */
public  class DB_admin extends DB_employee implements Admin{
  
public ResultSet view(String col, String t) {
        
        try {
            Statement st = c.createStatement();
            String sql = "select " + col + " from " + t + " ";
            v = st.executeQuery(sql);

        } catch (SQLException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);

        }
        return v;
    }
public int delete_(String t, int id) {
        
        try {
            String sql = "delete " + t + " from  where emp_id='" + id + "'";
//            c = connect();
            Statement st = c.createStatement();
            res = st.executeUpdate(sql);

        } catch (SQLException ex) {
            Logger.getLogger(Modify1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
 public ResultSet select(String n, String m, String col, String t, String d, String sr) {
       

        try {

            String sql = "select " + n + "," + m + " ," + col + " from " + t + " where  " + d + " = '" + sr + "'  ";
//            c = connect();
            Statement s = c.createStatement();

            v = s.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return v;

    }
// String sql ="insert into employee (emp_name,password,position,salary,available_vacations) values ('"+ename.getText()+"' ,'"+epass.getText()+"','"+eposition.getText()+"' ,'"+x+"'  ,'"+n+"')";
public int insert (String t, String c1,  String v1,String  c2,String  v2,String  c3
             ,String  v3 ,String c4 ,double v4 ,String c5 ,int v5) {
       //not

        try {
String sql="insert into t ( "+c1+"  , "+c2+" , "+c3+"   , "+c4+" , "+c5+" ) values ('"+v1+"' ,'"+v2+"' , '"+v3+"' , '"+v4+"' , '"+v5+"')";
       

           
            Statement s = c.createStatement();

            res = s.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return res;

    } 

//    @Override
//    public int insert(String t, String e, String h, String b, String id, String p_id, String name) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}


