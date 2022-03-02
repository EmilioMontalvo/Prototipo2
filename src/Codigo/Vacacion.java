/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Vacacion {
    private String cedula;
    private Date inicio;
    private Date fin;

    public Vacacion(String cedula, Date inicio, Date fin) {
        this.cedula = cedula;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    public boolean Registrar(){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        //ResultSet rs;
        try{
            ps=conn.con.prepareStatement("INSERT INTO vacaciones values(?,?,?)");
            
            ps.setDate(1,inicio);
            ps.setDate(2,fin);
            ps.setString(3,cedula);
           
            
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se ha creado un periodo de vacaciones para el empleado");
        }catch(SQLException e){
           if(Pattern.matches("^Duplicate entry.*", e.getMessage())){
                JOptionPane.showMessageDialog(null, "Ya existe este periodo de Vacaciones");
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
    
    
    public void atualizarDia(Date dia,Date diaFin){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        
        
        
        try{
           ps=conn.getCon().prepareStatement("UPDATE vacaciones SET fechaInicio='"+dia+"',fechaFin='"+diaFin+"'WHERE Empleado_cedula1='"+cedula+"' AND fechaInicio='"+inicio+"',fechaFin='"+fin+"';");
                
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Periodo de vacaciones actualizado exitosamente"); 
                      
            
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
