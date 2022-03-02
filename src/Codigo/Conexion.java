/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



/**
 *
 * @author HP
 */
public class Conexion {
    Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
    public static void main(String[] args) {
        Conexion cn=new Conexion();
        Statement st;
        ResultSet rs;
        try {
            st=cn.con.createStatement();
            rs=st.executeQuery("SHOW tables");
            while (rs.next()) {                
                System.out.println(rs.getString("Tables_in_mydb"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
        
    }

    public Connection getCon() {
        return con;
    }
    
    
}

