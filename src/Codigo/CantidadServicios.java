/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CantidadServicios {

    String cedula;
    int c=0;

    public CantidadServicios(String cedula) {
       Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        
        
        try{
           ps=conn.getCon().prepareStatement("SELECT * FROM empleado WHERE cedula='"+cedula+"';");
                
            
            rs=ps.executeQuery();
            
            while (rs.next())
            {
                this.cedula=rs.getString(1); 
              
            }
            
           
            
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
           
        }finally{
            try{
                if(conn!=null){
                    conn.getCon().close();
                }
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error, reinicie el sistema"); 
               
            }
        }
        
    }
   
    
    
}
