/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DiaLibre {
    private String cedulaEmpleado;
    private Date diaLibre;

    public DiaLibre(String cedulaEmpleado, Date diaLibre) {
        this.cedulaEmpleado = cedulaEmpleado;
        this.diaLibre = diaLibre;
    }
    
          
    
    public boolean Registrar(){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        //ResultSet rs;
        try{
            ps=conn.con.prepareStatement("INSERT INTO dia_libre values(?,?)");
            
            ps.setDate(1,diaLibre);
            ps.setString(2,cedulaEmpleado);
            
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha registrado un día libre para el empleado");
        }catch(SQLException e){
            
            if(Pattern.matches("^Duplicate entry.*", e.getMessage())){
                JOptionPane.showMessageDialog(null, "Ya existe este día libre");
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
     
     public void atualizarDia(Date dia){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        
        
        
        try{
           ps=conn.getCon().prepareStatement("UPDATE dia_libre SET dia_Libre='"+dia+"' WHERE Empleado_cedula='"+cedulaEmpleado+"' AND dia_Libre ='"+diaLibre+"';");
                
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Día libre actualizado exitosamente"); 
                      
            
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

    public String getCedulaEmpleado() {
        return cedulaEmpleado;
    }

    public void setCedulaEmpleado(String cedulaEmpleado) {
        this.cedulaEmpleado = cedulaEmpleado;
    }

    public Date getDiaLibre() {
        return diaLibre;
    }

    public void setDiaLibre(Date diaLibre) {
        this.diaLibre = diaLibre;
    }
     
     
}
