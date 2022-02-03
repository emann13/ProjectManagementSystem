/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import OOP.Admin;
import GUI.Modify1;
import GUI.update1;
import OOP.Employee;
import OOP.TeamLeader;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ramy alaa
 */
public class DB_employee implements  Employee {
Connection c ;
 ResultSet v;
 int res;
 public DB_employee() {
     try {

            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/project system", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
        Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
    }
 }

    public ResultSet select(String col, String t, int id, String password) {
       
       

        try {

            String sql = "select " + col + " from " + t + " where emp_id='" + id + "'and password='" + password + "'";
            Statement s = c.createStatement();

            v = s.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return v;

    }

    public ResultSet select(String col, String t,  String d,int id) {
       //tt

        try {

            String sql = "select " + col + " from " + t + " where  " + d + " = '" + id + "' ";
//            c = connect();
            Statement s = c.createStatement();

            v = s.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return v;

    }
    public ResultSet select(String n, String m, String col, String t, String d, String sr) {
       //tt

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
      
//      public ResultSet select(String col, String t,String y,  String d,int id) {
//       //not
//
//        try {
//
//            String sql = "select " + col + " ," + t+ "from " + y + " where  " + d + " = '" + id + "' ";
////            c = connect();
//            Statement s = c.createStatement();
//
//            v = s.executeQuery(sql);
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return v;
//
//    }
       public ResultSet select(String col, String t,  String d,int id,String c2 ,LocalDate v2) {
       //tt
        try {

            String sql = "select " + col + " ,from " + t + " where  " + d + " = '" + id + "' and "+c2+" = '"+v2+"'";
//            c = connect();
            Statement s = c.createStatement();

            v = s.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return v;

    }

//    public ResultSet select(String n, String m, String col, String t, String d, String sr) {
//       //not
//
//        try {
//
//            String sql = "select " + n + "," + m + " ," + col + " from " + t + " where  " + d + " = '" + sr + "'  ";
////            c = connect();
//            Statement s = c.createStatement();
//
//            v = s.executeQuery(sql);
//
//        } catch (SQLException ex) {
//            System.out.println(ex.getMessage());
//        }
//
//        return v;
//
//  }

//    public ResultSet view(String col, String t) {
//        //not
//        try {
//            Statement st = c.createStatement();
//            String sql = "select " + col + " from " + t + " ";
//            v = st.executeQuery(sql);
//
//        } catch (SQLException ex) {
//            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
//
//        }
//        return v;
//    }

//    // TODO add your handling code here:
//    public int delete_(String t, int id) {
//        //not
//        try {
//            String sql = "delete " + t + " from  where emp_id='" + id + "'";
//          
//            Statement st = c.createStatement();
//            res = st.executeUpdate(sql);
//
//        } catch (SQLException ex) {
//            Logger.getLogger(Modify1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return res;
//    }

//    public int insert(String t,String e,String h,String b,String id, String p_id, String name) {
//        String sql = "insert into " + t +  " ( " + e + " , " + h + " , " + b + " ) values('" + id + "','" + p_id + "', '" + name + "')";
//
//        try {
////            c = connect();
//            Statement st = c.createStatement();
//            res = st.executeUpdate(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return res;
//    }

    public int update(String j,String e,String h, double x, int id)  {
        //tt
        try {
          //  String v = "update  set no_task = '" + x + "' where project_id = '" + id + "' ";
            String v = " update " + j + " set " + e +" = '" + x + "' where " + h + " = '" + id + "' ";
//            c = connect();
            Statement s = c.createStatement();
            
             res = s.executeUpdate(v);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
     public int update(String j,String e,String h, int x, int id)  {
         //tt
        try {
          //  String v = "update  set no_task = '" + x + "' where project_id = '" + id + "' ";
            String v = " update " + j + " set " + e +" = '" + x + "' where " + h + " = '" + id + "' ";
//            c = connect();
            Statement s = c.createStatement();
            
             res = s.executeUpdate(v);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

     public int insert(String t,String e,String h,String b,LocalTime t1, LocalDate p, int id) {
         //TT
        String sql = "insert into " + t +  " ( " + e + " , " + h + " , " + b + " ) values('" + t1 + "','" + p + "', '" + id + "')";

        try {
//            c = connect();
            Statement st = c.createStatement();
            res = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

//    public int update(String j,String e,String h, Time x, int id)  {
//        //not
//        try {
//          //  String v = "update  set no_task = '" + x + "' where project_id = '" + id + "' ";
//            String v = " update " + j + " set " + e +" = '" + x + "' where " + h + " = '" + id + "' ";
//           // Connection c = null;
////            c = connect();
//            Statement s = c.createStatement();
//            
//             res = s.executeUpdate(v);
//            
//        } catch (SQLException ex) {
//            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return res;
//    }
    public int update(String j,String e,String h, LocalTime x, int id,String m,LocalDate t2)  {
        //tt
        try {
          //  String v = "update  set no_task = '" + x + "' where project_id = '" + id + "' ";
            String v = " update " + j + " set " + e +" = '" + x + "' where " + h + " = '" + id + "' and "+m+" = '"+t2+"' ";
           // Connection c = null;
//            c = connect();
            Statement s = c.createStatement();
            
             res = s.executeUpdate(v);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public int update(String j,String e,String h, String x, int id,String b ,int a,String m,String g)  {
        //tt
        try {
            //String v = "update j set no_tas = '" + x + "' where project_id = '" + id + "' ";
           String v = " update " + j + " set " + e +" = '" + h + "' where " + x + " = '" + id + "' and "+b+"= '"+a+"'and "+m+"= '"+g+"' ";
            
            Statement s = c.createStatement();
             res = s.executeUpdate(v);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB_employee.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }

}
