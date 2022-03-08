/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author Danny
 */
public class Cita {

    private int numero;
    private String fecha;
    private String hora;
    private String cliente_cedula;
    private String empleado_cedula;
    private String servicio_codigo;
    private String duracion;
    private String estado;

    Conexion con1 = new Conexion();
    Connection connet;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;

    public Cita(String fecha, String hora, String cliente_cedula, String empleado_cedula, String servicio_codigo, String duracion) {

        this.fecha = fecha;
        this.hora = hora;
        this.cliente_cedula = cliente_cedula;
        this.empleado_cedula = empleado_cedula;
        this.servicio_codigo = servicio_codigo;
        this.duracion = duracion;
        this.estado = "Registrada";

    }

    public Cita() {
    }

    public void Actualizar(String fecha, String tiempo, String duracion, String cedulaE, String Cservicio, String numero) {

        Conexion conn = new Conexion();
        PreparedStatement ps;
        //ResultSet rs;

        try {
            ps = conn.getCon().prepareStatement("UPDATE cita SET fecha='" + fecha + "',hora='" + tiempo + "',duracion='" + duracion + "',Empleado_cedula=" + cedulaE + ",Servicio_codigo='" + Cservicio + "' WHERE numero=" + numero + ";");

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cita actualizada exitosamente");

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

    public void cancelar(String numero) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        //ResultSet rs;

        try {
            ps = conn.getCon().prepareStatement("UPDATE cita SET estado = 'Cancelada' WHERE numero=" + numero + ";");

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cita Cancelada exitosamente");

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

    public void observaciones(String numero, String observaciones) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        //ResultSet rs;

        try {
            ps = conn.getCon().prepareStatement("Insert into observaciones values(?,?);");

            ps.setString(1, observaciones);
            ps.setString(2, numero);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Observacion ingresada exitosamente");

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

    public boolean Registrar() throws ParseException {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        //ResultSet rs;

        try {
            ps = conn.con.prepareStatement("INSERT INTO Cita values(?,?,?,?,?,?,?,?)");
            
            

            ps.setInt(1, numero);
            ps.setString(2, fecha);
            ps.setString(3, hora);
            ps.setString(4, empleado_cedula);
            ps.setString(5, servicio_codigo);
            ps.setString(6, "Registrada");
            ps.setString(7, cliente_cedula);
            ps.setString(8, duracion);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cita registrado con exito");

            try {
                String sql1 = "SELECT count(*) FROM cita;";
                connet = con1.getCon();
                st = connet.createStatement();
                rs = st.executeQuery(sql1);
                rs.next();

                String numero = rs.getString("count(*)");

                JOptionPane.showMessageDialog(null, "Su Número de Cita es : " + numero);

            } catch (SQLException e) {
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
            return false;
        } finally {
            try {
                if (conn != null) {
                    conn.con.close();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, intentelo de nuevo");
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "Cita{" + "numero=" + numero + ", fecha=" + fecha + ", hora=" + hora + ", cliente_cedula=" + cliente_cedula + ", empleado_cedula=" + empleado_cedula + ", servicio_codigo=" + servicio_codigo + ", duracion=" + duracion + ", estado=" + estado + '}';
    }

}
