/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import GUI.update1;
import OOP.TeamLeader;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ramy alaa
 */
public class DB_team_leader extends DB_employee implements TeamLeader{
     public ResultSet select(String col, String t,  String d,String  p) {
       //not

        try {

            String sql = "select " + col + " , " + t + " , " + d + " from " + p + " ";
//            c = connect();
            Statement s = c.createStatement();

            v = s.executeQuery(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return v;

    }
     public int update (String t, String c1,  String v1,String  c2,String  v2,String  c3
             ,int  v3 ,String c4 ,String v4 ,String c5 ,double v5,String c6,
             String v6 ,String c7 ,int v7 ,String c8,String v8 ,String c9,int v9) {
       //not

        try {
String sql="update t set "+c1+" = '"+v1+"' , "+c2+" ='"+v2+"'"
        + " , "+c3+" = '"+v3+"' , "+c4+" ='"+v4+"' , "+c5+" ='"+v5+"' "
        + ", "+c6+" = '"+v6+"' ,"+c7+" ='"+v7+"' "
        + ", "+c8+" ='"+v8+"' where "+c9+" ='"+v9+"'";
           
            Statement s = c.createStatement();

            res = s.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return res;

    }
  
     public int insert(String t,String e,String h,String b,String id, String p_id, String name) {
        String sql = "insert into " + t +  " ( " + e + " , " + h + " , " + b + " ) values('" + id + "','" + p_id + "', '" + name + "')";

        try {
//            c = connect();
            Statement st = c.createStatement();
            res = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(update1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
}
