/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



/**
 *
 * @author HP
 */
public class Empleado {
    private String cedula;
    private String nombres;
    private String apellidos;
    private String jornada;
    private String ciudad;
    private String especialidad;
    private float salario;
    private String habilitado;

    public Empleado(String cedula, String nombres, String apellidos, String jornada, String ciudad, float salario,String especialidad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.jornada = jornada;
        this.especialidad=especialidad;
        this.salario = salario;
        this.habilitado="A";
    }
    
    public Empleado(String cedula) {
        Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        
        
        try{
           ps=conn.getCon().prepareStatement("SELECT * FROM empleado WHERE cedula='"+cedula+"';");
                
            
            rs=ps.executeQuery();
            
            while (rs.next())
            {
                this.cedula=rs.getString(1); 
                this.nombres = rs.getString(2);
                this.apellidos = rs.getString(3);
                this.ciudad = rs.getString(4);
                this.jornada = rs.getString(5);
                this.especialidad=rs.getString(6);
                this.salario = rs.getFloat(7);
                this.habilitado=rs.getString(8);
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
            ps=conn.con.prepareStatement("INSERT INTO empleado (cedula,nombres,apellidos,ciudadTrabajo,jornadaTrabajo,especialidad,salario,habilitado) values(?,?,?,?,?,?,?,?)");
            
            ps.setString(1,cedula);
            ps.setString(2,nombres);
            ps.setString(3,apellidos);
            ps.setString(4,ciudad);
            ps.setString(5,jornada);
            ps.setString(6,especialidad);
            ps.setFloat(7, salario);
            ps.setString(8, "A");
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Empleado registrado con exito");
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
    
    public void atualizarSalario(Float salario){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        //ResultSet rs;
        
        
        try{
           ps=conn.getCon().prepareStatement("UPDATE empleado SET salario="+salario+" WHERE cedula='"+cedula+"';");
                
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salario actualizado exitosamente"); 
                      
            
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
    
    public void atualizarJornada(String jornada){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        //ResultSet rs;
        
        
        try{
           ps=conn.getCon().prepareStatement("UPDATE empleado SET jornadaTrabajo='"+jornada+"' WHERE cedula='"+cedula+"';");
                
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Jornada actualizada exitosamente"); 
                      
            
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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(String habilitado) {
        this.habilitado = habilitado;
    }
    
    
    
}
