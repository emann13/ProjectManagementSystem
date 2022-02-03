///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package OOP;
//import DB.db;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.time.LocalTime;
//import java.util.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.swing.JOptionPane;
// /**
// *
// * @author ramy alaa
// */
//public class user extends db{
//   int  id ;
//   private String  name ;
//   private String  pass ;
//   private String  position ;
//   private double  salary ;
//   private int available_vacations;
//   private int vacations_penalties;
//   private LocalTime entry_time ;
//   private LocalTime exit_time ;
//   private Date date;
// 
//   public boolean login (int id, String password){
//       int count=0;
//   
//       try {
//           pass=password;
//           this.id=id;
//           Statement s=c.createStatement();
//           String sql="select count(1)from employee where emp_id='"+this.id+"'and password='"+pass+"'";
////db_login g=new db_login();
//// ResultSet v= g.select( id, password1);
//ResultSet v=s.executeQuery(sql);
//
//while(v.next()){
//    count =v.getInt("count(1)");
//}
// if(count==1){
//    return true;}
// else 
//     return false;
//
//   } catch (SQLException ex) {
//           Logger.getLogger(user.class.getName()).log(Level.SEVERE, null, ex);
//       }
//      if(count==1){
//    return true;}
// else 
//     return false;
//}}
//
