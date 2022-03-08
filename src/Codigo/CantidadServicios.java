/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.Date;
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

    private String cedula;
    private int cantidad=0;

    public CantidadServicios() {
    }

    
    
    public CantidadServicios(String cedula) {
       Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        
        this.cedula=cedula;
        try{
           ps=conn.getCon().prepareStatement("SELECT cantidad FROM serviciosRealizado WHERE Empleado_cedula='"+cedula+"' AND dia=CURDATE();");
                
            
            rs=ps.executeQuery();
            
            while (rs.next())
            {
                cantidad=rs.getInt(1); 
                
              
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
   
    
    
}
