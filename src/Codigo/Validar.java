/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Validar {
    
    public boolean validarNombres(String nombres){
        
        return Pattern.matches("^(?!.*\\s(?:\\s|$))[[A-Za-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙñÑ]\\s]+$", nombres);
    }
    
    public  boolean verificarCedula(String cedula) {
        int total = 0;
        int tamanoLongitudCedula = 10;
        int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int numeroProvincias = 24;
        int tercerDigito = 6;

        if (cedula.matches("[0-9]*") && cedula.length() == tamanoLongitudCedula) {
            int provincia = Integer.parseInt(cedula.charAt(0) + "" + cedula.charAt(1));
            int digitoTres = Integer.parseInt(cedula.charAt(2) + "");
            if ((provincia > 0 && (provincia <= numeroProvincias || provincia == 30)) && digitoTres < tercerDigito) {
                int digitoVerificadorRecibido = Integer.parseInt(cedula.charAt(9) + "");
                for (int i = 0; i < coeficientes.length; i++) {
                    int valor = Integer.parseInt(coeficientes[i] + "")
                            * Integer.parseInt(cedula.charAt(i) + "");
                    total = valor >= 10 ? total + (valor - 9) : total + valor;
                }
                int digitoVerificadorObtenido = total >= 10
                        ? (total % 10) != 0
                                ? 10 - (total % 10)
                                : (total % 10) : total;
                if (digitoVerificadorObtenido == digitoVerificadorRecibido) {
                    return true;
                }

            }
            return false;
        }

        return false;

    }
    
    public boolean validarSalario(Float salario){
        
        boolean cifras=Pattern.matches("^[0-9]+([.][0-9]{0,2})?$", salario.toString());
        
        if(!cifras){
            return cifras;
        }
        
        
        boolean tamanio=false;
        
        if (salario>=0 && salario<=9999.99) {
            tamanio=true;
        }
        
        
        return cifras && tamanio;
    }
    
    public boolean cedulaPerteneceEmpleado(String cedula){
         Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean empleado=false;
      
        
        try{
           ps=conn.getCon().prepareStatement("SELECT cedula FROM empleado;");
                
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                 if(rs.getString("cedula").equals(cedula)){
                     empleado=true;
                 }
            }
            
           
            
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
           
        }finally{
            try{
                if(conn!=null){
                    conn.getCon().close();
                    return empleado;
                }
            }catch(Exception e){
               JOptionPane.showMessageDialog(null, "Error, problema con la base de datos"); 
               return empleado;
            }
        }
        return empleado;
        
    }
    
    public boolean validarFechasInicioFin(Date inicio,Date fin){
        
        
        return inicio.before(fin);
    }
    
   
}