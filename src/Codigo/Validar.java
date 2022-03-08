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

    public boolean validarNombres(String nombres) {

        return Pattern.matches("^(?!.*\\s(?:\\s|$))[[A-Za-zäÄëËïÏöÖüÜáéíóúáéíóúÁÉÍÓÚÂÊÎÔÛâêîôûàèìòùÀÈÌÒÙñÑ]\\s]+$", nombres);
    }

    public boolean validarTelefono(String numero) {
        return Pattern.matches("[0-9]*", numero);
    }

    public boolean verificarCedula(String cedula) {
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

    public boolean validarSalario(Float salario) {

        boolean cifras = Pattern.matches("^[0-9]+([.][0-9]{0,2})?$", salario.toString());

        if (!cifras) {
            return cifras;
        }

        boolean tamanio = false;

        if (salario >= 0 && salario <= 9999.99) {
            tamanio = true;
        }

        return cifras && tamanio;
    }

    public boolean cedulaPerteneceEmpleado(String cedula) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean empleado = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT cedula FROM empleado;");

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("cedula").equals(cedula)) {
                    empleado = true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return empleado;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return empleado;
            }
        }
        return empleado;

    }

    public boolean cedulaTraslado(String cedula) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean empleado = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT Empleado_cedula FROM traslado;");

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("Empleado_cedula").equals(cedula)) {
                    empleado = true;

                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return empleado;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return empleado;
            }
        }
        return empleado;

    }

    public boolean verificarCliente(String cedula) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean cliente = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT cedula FROM cliente;");

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("cedula").equals(cedula)) {
                    cliente = true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return cliente;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return cliente;
            }
        }
        return cliente;

    }

    public boolean verificarEmpleado(String cedula) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean empleado = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT cedula FROM empleado;");

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("cedula").equals(cedula)) {
                    empleado = true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return empleado;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return empleado;
            }
        }
        return empleado;

    }

    public boolean verificarServicio(String codigo) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean servicio = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT codigo FROM servicio;");

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("codigo").equals(codigo)) {
                    servicio = true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return servicio;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return servicio;
            }
        }
        return servicio;

    }

    public boolean validarFechasInicioFin(Date inicio, Date fin) {

        return inicio.before(fin);
    }

    public boolean existeUsuario(String nombre, String tipo, String contrasenia) {

        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean existe = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT * FROM usuarios;");

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("nombreUsuario").equals(nombre) && rs.getString("tipo").equals(tipo) && rs.getString("contrasenia").equals(contrasenia)) {
                    existe = true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return existe;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return existe;
            }
        }
        return existe;

    }

    public boolean usuarioActivoEsEmpleado() {

        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean empleado = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT * FROM activo;");

            rs = ps.executeQuery();
            String activo = "";

            while (rs.next()) {
                activo = rs.getString("Usuarios_nombreUsuario");
            }
            //System.out.println(activo);
            String tipo = "";
            ps = conn.getCon().prepareStatement("SELECT tipo FROM usuarios WHERE nombreUsuario='" + activo + "';");
            rs = ps.executeQuery();

            while (rs.next()) {

                tipo = rs.getString(1);
                //System.out.println(tipo);
                if (tipo.equals("E")) {
                    empleado = true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return empleado;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return empleado;
            }
        }
        return empleado;

    }

    public boolean verificarDisponibilidad(String cedulaE) {
        Conexion conn = new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        boolean disponibilidad = false;

        try {
            ps = conn.getCon().prepareStatement("SELECT * FROM empleado where cedula ='" + cedulaE + "';");

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getString("cedula").equals(cedulaE)) {
                    disponibilidad = true;
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());

        } finally {
            try {
                if (conn != null) {
                    conn.getCon().close();
                    return disponibilidad;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error, problema con la base de datos");
                return disponibilidad;
            }
        }
        return disponibilidad;

    }

}
