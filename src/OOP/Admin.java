///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package OOP;

import DB.db;

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
public interface Admin extends Employee{

   

    public abstract ResultSet view(String col, String t);

    public abstract int delete_(String t, int id);
     public abstract ResultSet select(String n, String m, String col, String t, String d, String sr);
public abstract int insert (String t, String c1,  String v1,String  c2,String  v2,String  c3
             ,String  v3 ,String c4 ,double v4 ,String c5 ,int v5);

}
