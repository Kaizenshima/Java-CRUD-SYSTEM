/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab3;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author capit
 */
public class db {

    public static Connection conn;
    public static Statement state;
    
    public static Connection java_sql() {

        String url = "jdbc:mysql://localhost:3306/studentdata?useSSL=false";
        String user = "root";
        String pass = "";
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,pass);
            return conn;
        }catch (ClassNotFoundException | SQLException e){
            
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}
