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
import java.sql.Time;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class Cita {

    private int numero;
    private Date fecha;
    private Time hora;
    private String cliente_cedula;
    private String empleado_cedula;
    private String servicio_codigo;
    private Time duracion;
    private String estado;

    public Cita(Date fecha, Time hora, String cliente_cedula, String empleado_cedula, String servicio_codigo, Time duracion) {

        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = conn.getCon().prepareStatement("SELECT COUNT(*) FROM cita;");

            rs = ps.executeQuery();

            this.numero = rs.getInt(1);
            this.fecha = fecha;
            this.hora = hora;
            this.cliente_cedula = cliente_cedula;
            this.empleado_cedula = empleado_cedula;
            this.servicio_codigo = servicio_codigo;
            this.duracion = duracion;
            this.estado = "Registrada";

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, reinicie el sistema");

            }
        }
    }

    public Cita(Date fecha, Time tiempo, String cedulaC, String cedulaE, Time duracion) {
        
    }
    
    public boolean Registrar(){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        //ResultSet rs;
        try{
            ps=conn.con.prepareStatement("INSERT INTO Cita (numero,fecha,hora,cliente_cedula,empleado_cedula servicio_codigo,duracion,estado) values(?,?,?,?,?,?,?,?)");
            
            ps.setInt(1,numero);
            ps.setDate(2,fecha);
            ps.setTime(3,hora);
            ps.setString(4,cliente_cedula);
            ps.setString(5,empleado_cedula);
            ps.setString(6,servicio_codigo);
            ps.setTime(7, duracion);
            ps.setString(8, "Registrada");
                    
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cita registrado con exito");
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

}
