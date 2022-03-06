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
public class Traslado {
    private String cedula;
    private String ciudad;
    private Date ida;
    private Date regreso;

    public Traslado(String cedula, String ciudad, Date ida, Date regreso) {
        this.cedula = cedula;
        this.ciudad = ciudad;
        this.ida = ida;
        this.regreso = regreso;
    }

    public Traslado(String cedula) {
        Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        
        
        try{
           ps=conn.getCon().prepareStatement("SELECT * FROM traslado WHERE Empleado_cedula='"+cedula+"';");
                
            
            rs=ps.executeQuery();
            
            while (rs.next())
            {
                this.ida=rs.getDate(1);
                this.regreso=rs.getDate(2);
                this.ciudad = rs.getString(3);
                this.cedula=rs.getString(4); 
                
                
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
    
    
    
     public boolean Registrar(){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        //ResultSet rs;
        try{
            ps=conn.con.prepareStatement("INSERT INTO traslado values(?,?,?,?)");
            
            ps.setDate(1,ida);
            ps.setDate(2,regreso);
            ps.setString(3,ciudad);
            ps.setString(4,cedula);
            
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Traslado registrado con éxito");
        }catch(SQLException e){
           if(Pattern.matches("^Duplicate entry.*", e.getMessage())){
                JOptionPane.showMessageDialog(null, "Este empleado ya tienen un traslado registrado");
            }else{
                JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
           
            }
            return false;
        }finally{
            try{
                if(conn!=null){
                    conn.con.close();
                }
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error, intentelo de nuevo"); 
               return false;
            }
        }
        
        return true;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Date getIda() {
        return ida;
    }

    public void setIda(Date ida) {
        this.ida = ida;
    }

    public Date getRegreso() {
        return regreso;
    }

    public void setRegreso(Date regreso) {
        this.regreso = regreso;
    }
    
     
}
