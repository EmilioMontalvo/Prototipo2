/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
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

    public Empleado(String cedula, String nombres, String apellidos, String jornada, String ciudad, float salario,String especialidad) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ciudad = ciudad;
        this.jornada = jornada;
        this.especialidad=especialidad;
        this.salario = salario;
    }
    
    
    public boolean Registrar(){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
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
           JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
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
    
    
    
}
