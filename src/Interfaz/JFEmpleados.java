/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;
import Codigo.CantidadServicios;
import Codigo.Conexion;
import Codigo.DiaLibre;
import Codigo.Empleado;
import Codigo.Traslado;
import Codigo.Vacacion;
import Codigo.Validar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author HP
 */
public class JFEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form JFEmpleados
     */
    
    ImageIcon aceptar = new ImageIcon(getClass().getResource("/Iconos/aceptar.png")); 

    ImageIcon deshabilitar = new ImageIcon(getClass().getResource("/Iconos/prohibir-usuario.png")); 
    public JFEmpleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        
       
        
        AutoCompleteDecorator.decorate(jCBCedulaSalario);
        AutoCompleteDecorator.decorate(jCBCedulaDiasLibresR);
        AutoCompleteDecorator.decorate(jCBCedulaVacacionesR);
        AutoCompleteDecorator.decorate(jCBCedulaTrasladoR);
                       
        
        AutoCompleteDecorator.decorate(jCBCedulaEmpleadoC);
        AutoCompleteDecorator.decorate(jCBCedulaServiciosC);
        AutoCompleteDecorator.decorate(jCBCedulaDiasLibresC);
        AutoCompleteDecorator.decorate(jCBCedulaVacacionesC);
        AutoCompleteDecorator.decorate(jCBCedulaTrasladoC);
        
        
        AutoCompleteDecorator.decorate(jCBDiasLibreasA);
        AutoCompleteDecorator.decorate(jCBDiasVacacionesA);
        AutoCompleteDecorator.decorate(jCBJornadaA);
        AutoCompleteDecorator.decorate(jCBCedulaTrasladoA);
        
        
        AutoCompleteDecorator.decorate(jCBCedulaEmpleadoE);
        AutoCompleteDecorator.decorate(jCBCedulaDiasLibresE);
        AutoCompleteDecorator.decorate(jCBCedulaVacacionesE);
        AutoCompleteDecorator.decorate(jCBCedulaTrasladoE);
        
        this.actualizarComboBox();
        
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nº");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        
        this.jTVacaciones.setModel(modelo);
        this.jTVacacionesA.setModel(modelo);
        this.jTVacacionesE.setModel(modelo);
                
               
        this.jBActualizarSalario.setEnabled(false);
        this.jBCancelarSalario.setEnabled(false);
        this.jBActualizarJornada.setEnabled(false);
        this.jBCancelarJornada.setEnabled(false);
        this.jBActualizarDia.setEnabled(false);
        this.jBCancelarDia.setEnabled(false);
        jBActualizaTraslado.setEnabled(false);
        jBCancelarTraslado.setEnabled(false);
        jBActualizarVacaciones.setEnabled(false);
        jBCancelarVacaciones.setEnabled(false);
        jBDeshabilitar.setEnabled(false);
        jBEliminarEmpleado.setEnabled(false);
        jBCancelarEmp.setEnabled(false);
        jBEliminarTras.setEnabled(false);
        jBCancelarTras.setEnabled(false);
        jBEliminarDia.setEnabled(false);
        jBCAncelarDiaE.setEnabled(false);
        jBEliminarVaca.setEnabled(false);
        jBCancelarEliminarVaca.setEnabled(false);
        
        
        Validar val=new Validar();
        
        if(val.usuarioActivoEsEmpleado()){
            System.out.println("aaaaaa");
            jTabbedPane1.setSelectedIndex(1);
            jTabbedPane1.setEnabled(false);
        }
        
         if(jCBCedulaTrasladoR.getSelectedIndex()==-1){
            jButton27.setEnabled(false);
            jBRegistrarDiaLibre.setEnabled(false);
            jBRegistrarVacacion.setEnabled(false);
            jButton13.setEnabled(false);
            jButton24.setEnabled(false);
            jButton15.setEnabled(false);
            jButton16.setEnabled(false);
            jButton14.setEnabled(false);
            jButtonBuscarSalario.setEnabled(false);
            jBBuscarJornada.setEnabled(false);
            jBBuscarTraslado.setEnabled(false);
            jBBuscarDia.setEnabled(false);
            jBuscarVacA.setEnabled(false);
            jButton33.setEnabled(false);
            jBBuscarTrasladoE.setEnabled(false);
            jBDiasE.setEnabled(false);
            jBBuscarVacacionE.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jButton8 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel27 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfcedula = new javax.swing.JTextField();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        jTFSalario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCBJornada = new javax.swing.JComboBox<>();
        jLabel56 = new javax.swing.JLabel();
        jTFEspecialidad = new javax.swing.JTextField();
        jCBciudadesR1 = new javax.swing.JComboBox<>();
        jPanel18 = new javax.swing.JPanel();
        jLabel57 = new javax.swing.JLabel();
        jCBCedulaTrasladoR = new javax.swing.JComboBox<>();
        jButton27 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jDCida = new com.toedter.calendar.JDateChooser();
        jDCregreso = new com.toedter.calendar.JDateChooser();
        jButton28 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jCBciudadesR = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jCBCedulaDiasLibresR = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jBRegistrarDiaLibre = new javax.swing.JButton();
        jDCDiaLibre = new com.toedter.calendar.JDateChooser();
        jButton17 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jCBCedulaVacacionesR = new javax.swing.JComboBox<>();
        jBRegistrarVacacion = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jDCinicioVacacion = new com.toedter.calendar.JDateChooser();
        jDCFinVacacion = new com.toedter.calendar.JDateChooser();
        jButton18 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPEmpleadoC = new javax.swing.JPanel();
        jCBCedulaEmpleadoC = new javax.swing.JComboBox<>();
        jLabel26 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLCedulaC = new javax.swing.JLabel();
        jLNombresC = new javax.swing.JLabel();
        jLApellidosC = new javax.swing.JLabel();
        jLCiudadC = new javax.swing.JLabel();
        jLJornadaC = new javax.swing.JLabel();
        jLSalarioC = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLEspecialidadC = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLEstadoC = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jCBCedulaTrasladoC = new javax.swing.JComboBox<>();
        jButton24 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLEmpleadoTrasladoC = new javax.swing.JLabel();
        jLabeFecha = new javax.swing.JLabel();
        jLRegreso = new javax.swing.JLabel();
        jLTraslado = new javax.swing.JLabel();
        jLida = new javax.swing.JLabel();
        jLregreso = new javax.swing.JLabel();
        jLciudad = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jCBCedulaDiasLibresC = new javax.swing.JComboBox<>();
        jLabel40 = new javax.swing.JLabel();
        jLEmpleadoDiasLibresC = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListDiasLibres = new javax.swing.JList<>();
        jLabel42 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jCBCedulaVacacionesC = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        jLEmpleadoVacacionesC = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTVacaciones = new javax.swing.JTable();
        jButton16 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jCBCedulaServiciosC = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLCantidadC = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLEmpleadoC = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jCBCedulaSalario = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLSalario = new javax.swing.JLabel();
        jTFSalarioActualizar = new javax.swing.JTextField();
        jBActualizarSalario = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();
        jLEmpleado = new javax.swing.JLabel();
        jBCancelarSalario = new javax.swing.JButton();
        jButtonBuscarSalario = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jCBJornadaA = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLJornada = new javax.swing.JLabel();
        jBActualizarJornada = new javax.swing.JButton();
        jCNuevaJornada = new javax.swing.JComboBox<>();
        jLabel55 = new javax.swing.JLabel();
        jLEmpleadoJornada = new javax.swing.JLabel();
        jBCancelarJornada = new javax.swing.JButton();
        jBBuscarJornada = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jCBCedulaTrasladoA = new javax.swing.JComboBox<>();
        jBBuscarTraslado = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jDateIda = new com.toedter.calendar.JDateChooser();
        jBActualizaTraslado = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jDateRegreso = new com.toedter.calendar.JDateChooser();
        jBCancelarTraslado = new javax.swing.JButton();
        jCBciudadesA = new javax.swing.JComboBox<>();
        jLabel45 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabeFecha1 = new javax.swing.JLabel();
        jLRegreso1 = new javax.swing.JLabel();
        jLTraslado1 = new javax.swing.JLabel();
        jLida1 = new javax.swing.JLabel();
        jLregreso1 = new javax.swing.JLabel();
        jLEmpleadoTrasladoC6 = new javax.swing.JLabel();
        jLciudad1 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jCBDiasLibreasA = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLDiasLibresActualizar = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jDCdialibreA = new com.toedter.calendar.JDateChooser();
        jBActualizarDia = new javax.swing.JButton();
        jBCancelarDia = new javax.swing.JButton();
        jBBuscarDia = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLEmpleadoDiasLibres = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jCBDiasVacacionesA = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jDateInicio = new com.toedter.calendar.JDateChooser();
        jBActualizarVacaciones = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jDateChooserFin = new com.toedter.calendar.JDateChooser();
        jBCancelarVacaciones = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTVacacionesA = new javax.swing.JTable();
        jBuscarVacA = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLEmpleadoVacacionesA = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPEmpleadoC1 = new javax.swing.JPanel();
        jCBCedulaEmpleadoE = new javax.swing.JComboBox<>();
        jLabel47 = new javax.swing.JLabel();
        jBCancelarEmp = new javax.swing.JButton();
        jBEliminarEmpleado = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jBDeshabilitar = new javax.swing.JButton();
        jPanelEmpleado = new javax.swing.JPanel();
        jLabel73 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLCedulaC2 = new javax.swing.JLabel();
        jLNombresC2 = new javax.swing.JLabel();
        jLApellidosC2 = new javax.swing.JLabel();
        jLCiudadC2 = new javax.swing.JLabel();
        jLJornadaC2 = new javax.swing.JLabel();
        jLSalarioC3 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLEspecialidadC1 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLEstadoC1 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel75 = new javax.swing.JLabel();
        jCBCedulaTrasladoE = new javax.swing.JComboBox<>();
        jBBuscarTrasladoE = new javax.swing.JButton();
        jBEliminarTras = new javax.swing.JButton();
        jBCancelarTras = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jLEmpleadoTrasladoE = new javax.swing.JLabel();
        jLabeFecha2 = new javax.swing.JLabel();
        jLRegreso2 = new javax.swing.JLabel();
        jLregreso2 = new javax.swing.JLabel();
        jLida2 = new javax.swing.JLabel();
        jLTraslado2 = new javax.swing.JLabel();
        jLciudad2 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        jCBCedulaDiasLibresE = new javax.swing.JComboBox<>();
        jLabel60 = new javax.swing.JLabel();
        jLEmpleadoDiaE = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListaDiasE = new javax.swing.JList<>();
        jLabel62 = new javax.swing.JLabel();
        jBEliminarDia = new javax.swing.JButton();
        jBCAncelarDiaE = new javax.swing.JButton();
        jBDiasE = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jCBCedulaVacacionesE = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        jLEmpleadoVacE = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTVacacionesE = new javax.swing.JTable();
        jBCancelarEliminarVaca = new javax.swing.JButton();
        jBEliminarVaca = new javax.swing.JButton();
        jBBuscarVacacionE = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton8.setText("jButton8");

        jLabel27.setText("jLabel27");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("S-Brush");

        jPanel3.setBackground(new java.awt.Color(255, 204, 204));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Cédula:");

        jLabel2.setText("Nombres:");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Ciudad Permanente de Trabajo:");

        jLabel5.setText("Salario:");

        jtfcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfcedulaActionPerformed(evt);
            }
        });
        jtfcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfcedulaKeyTyped(evt);
            }
        });

        jTFNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombresActionPerformed(evt);
            }
        });
        jTFNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFNombresKeyTyped(evt);
            }
        });

        jTFApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidosActionPerformed(evt);
            }
        });
        jTFApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFApellidosKeyTyped(evt);
            }
        });

        jTFSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFSalarioActionPerformed(evt);
            }
        });
        jTFSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFSalarioKeyTyped(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png"))); // NOI18N
        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Jornada:");

        jCBJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutina", "Vespertina" }));

        jLabel56.setText("Especialidad:");

        jTFEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEspecialidadActionPerformed(evt);
            }
        });
        jTFEspecialidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFEspecialidadKeyTyped(evt);
            }
        });

        jCBciudadesR1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenca", "Latacunga" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jCBciudadesR1, 0, 212, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFApellidos)
                            .addComponent(jCBJornada, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFNombres)
                            .addComponent(jtfcedula)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFEspecialidad)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBciudadesR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jTFEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Empleado", new javax.swing.ImageIcon(getClass().getResource("/Iconos/perfil-del-usuario.png")), jPanel1); // NOI18N

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel57.setText("Ingrese el número de cédula del empleado al que desea trasladar temporalmente");

        jCBCedulaTrasladoR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png"))); // NOI18N
        jButton27.setText("Registrar");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jLabel58.setText("Fecha de ida:");

        jLabel67.setText("Fecha de regreso:");

        jDCida.setDateFormatString("dd/MM/yyyy");

        jDCregreso.setDateFormatString("dd/MM/yyyy");

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton28.setText("Cancelar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jLabel68.setText("Ciudad de Traslado:");

        jCBciudadesR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenca", "Latacunga" }));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBCedulaTrasladoR, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel67))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDCida, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                    .addComponent(jDCregreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCBciudadesR, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton27)
                .addGap(18, 18, 18)
                .addComponent(jButton28)
                .addGap(79, 79, 79))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel57)
                .addGap(18, 18, 18)
                .addComponent(jCBCedulaTrasladoR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel58)
                    .addComponent(jDCida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67)
                    .addComponent(jDCregreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jCBciudadesR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton27)
                    .addComponent(jButton28))
                .addGap(17, 17, 17))
        );

        jTabbedPane4.addTab("Traslado", new javax.swing.ImageIcon(getClass().getResource("/Iconos/destino.png")), jPanel18); // NOI18N

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setText("Ingrese el número de cédula del empleado al que desea asignar un día libre");

        jCBCedulaDiasLibresR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel17.setText("Nuevo día Libre:");

        jBRegistrarDiaLibre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png"))); // NOI18N
        jBRegistrarDiaLibre.setText("Registar");
        jBRegistrarDiaLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarDiaLibreActionPerformed(evt);
            }
        });

        jDCDiaLibre.setDateFormatString("dd/MM/yyyy");

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton17.setText("Cancelar");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(jDCDiaLibre, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBCedulaDiasLibresR, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(131, Short.MAX_VALUE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jBRegistrarDiaLibre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton17)
                        .addGap(76, 76, 76))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jCBCedulaDiasLibresR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jDCDiaLibre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistrarDiaLibre)
                    .addComponent(jButton17))
                .addGap(70, 70, 70))
        );

        jTabbedPane4.addTab("Día Libre", new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendario.png")), jPanel14); // NOI18N

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setText("Ingrese el número de cédula del empleado al que desea asignar un periodo de Vacaciones");

        jCBCedulaVacacionesR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBRegistrarVacacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png"))); // NOI18N
        jBRegistrarVacacion.setText("Registrar");
        jBRegistrarVacacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarVacacionActionPerformed(evt);
            }
        });

        jLabel24.setText("Inicio:");

        jLabel25.setText("Fin:");

        jDCinicioVacacion.setDateFormatString("dd/MM/yyyy");

        jDCFinVacacion.setDateFormatString("dd/MM/yyyy");

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton18.setText("Cancelar");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jCBCedulaVacacionesR, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBRegistrarVacacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(31, 31, 31)
                                .addComponent(jDCFinVacacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jDCinicioVacacion, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jCBCedulaVacacionesR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24)
                    .addComponent(jDCinicioVacacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jDCFinVacacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRegistrarVacacion)
                    .addComponent(jButton18))
                .addGap(74, 74, 74))
        );

        jTabbedPane4.addTab("Vacaciones", new javax.swing.ImageIcon(getClass().getResource("/Iconos/vacaciones-de-verano.png")), jPanel13); // NOI18N

        jTabbedPane1.addTab("Registrar", new javax.swing.ImageIcon(getClass().getResource("/Iconos/salvar.png")), jTabbedPane4); // NOI18N

        jPEmpleadoC.setBackground(new java.awt.Color(255, 255, 255));

        jCBCedulaEmpleadoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel26.setText("Cédula");

        jLabel28.setText("Cédula:");

        jLabel29.setText("Nombres:");

        jLabel30.setText("Apellidos:");

        jLabel31.setText("Ciudad Permanente de Trabajo:");

        jLabel32.setText("Salario:");

        jLabel33.setText("Jornada:");

        jLCedulaC.setText("******");

        jLNombresC.setText("******");

        jLApellidosC.setText("******");

        jLCiudadC.setText("******");

        jLJornadaC.setText("******");

        jLSalarioC.setText("******");

        jLabel69.setText("Especialidad:");

        jLEspecialidadC.setText("******");

        jLabel70.setText("Estado:");

        jLEstadoC.setText("******");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel69)
                        .addGap(18, 18, 18)
                        .addComponent(jLEspecialidadC))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLCiudadC))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(jLNombresC))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(30, 30, 30)
                        .addComponent(jLCedulaC))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(jLabel33))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLApellidosC)
                            .addComponent(jLJornadaC)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addComponent(jLabel70))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstadoC)
                            .addComponent(jLSalarioC))))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jLCedulaC))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLNombresC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(jLApellidosC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLJornadaC, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCiudadC)
                    .addComponent(jLabel31))
                .addGap(11, 11, 11)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jLEspecialidadC))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLSalarioC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLEstadoC))
                .addGap(38, 38, 38))
        );

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton13.setText("Buscar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPEmpleadoCLayout = new javax.swing.GroupLayout(jPEmpleadoC);
        jPEmpleadoC.setLayout(jPEmpleadoCLayout);
        jPEmpleadoCLayout.setHorizontalGroup(
            jPEmpleadoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpleadoCLayout.createSequentialGroup()
                .addGroup(jPEmpleadoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPEmpleadoCLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel26)
                        .addGap(48, 48, 48)
                        .addComponent(jCBCedulaEmpleadoC, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton13))
                    .addGroup(jPEmpleadoCLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPEmpleadoCLayout.setVerticalGroup(
            jPEmpleadoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpleadoCLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPEmpleadoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCedulaEmpleadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jButton13))
                .addGap(19, 19, 19)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Empleado", new javax.swing.ImageIcon(getClass().getResource("/Iconos/perfil-del-usuario.png")), jPEmpleadoC); // NOI18N

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel74.setText("Ingrese el número de cédula del empleado al que desea trasladar temporalmente");

        jCBCedulaTrasladoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton24.setText("Buscar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jLabel76.setText("Empleado:");

        jLEmpleadoTrasladoC.setText("****");

        jLabeFecha.setText("Fecha de ida:");

        jLRegreso.setText("Fecha de regreso:");

        jLTraslado.setText("Ciudad de Traslado:");

        jLida.setText("****");

        jLregreso.setText("****");

        jLciudad.setText("****");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabel76)
                                .addGap(18, 18, 18)
                                .addComponent(jLEmpleadoTrasladoC))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jCBCedulaTrasladoC, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLTraslado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLciudad))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLRegreso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLregreso))
                            .addGroup(jPanel21Layout.createSequentialGroup()
                                .addComponent(jLabeFecha)
                                .addGap(18, 18, 18)
                                .addComponent(jLida)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCedulaTrasladoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLEmpleadoTrasladoC))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeFecha)
                    .addComponent(jLida))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRegreso)
                    .addComponent(jLregreso))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTraslado)
                    .addComponent(jLciudad))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Traslado", new javax.swing.ImageIcon(getClass().getResource("/Iconos/destino.png")), jPanel21); // NOI18N

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel37.setText("Cédula");

        jCBCedulaDiasLibresC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel40.setText("Empleado:");

        jLEmpleadoDiasLibresC.setText("****");

        jScrollPane1.setViewportView(jListDiasLibres);

        jLabel42.setText("Días Libres:");

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton15.setText("Buscar");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel42)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel40)
                        .addGap(18, 18, 18)
                        .addComponent(jLEmpleadoDiasLibresC))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(33, 33, 33)
                        .addComponent(jCBCedulaDiasLibresC, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jButton15))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jCBCedulaDiasLibresC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15))
                .addGap(26, 26, 26)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jLEmpleadoDiasLibresC))
                .addGap(33, 33, 33)
                .addComponent(jLabel42)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Día Libre", new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendario.png")), jPanel10); // NOI18N

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel43.setText("Cédula");

        jCBCedulaVacacionesC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel44.setText("Empleado:");

        jLEmpleadoVacacionesC.setText("****");

        jLabel46.setText("Vacaciones:");

        jTVacaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTVacaciones);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton16.setText("Buscar");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel46)
                                    .addGroup(jPanel16Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLEmpleadoVacacionesC)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 333, Short.MAX_VALUE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(33, 33, 33)
                                .addComponent(jCBCedulaVacacionesC, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton16))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap(96, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(86, 86, 86))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jCBCedulaVacacionesC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16))
                .addGap(26, 26, 26)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(jLEmpleadoVacacionesC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel46)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
        );

        jTabbedPane3.addTab("Vacaciones", new javax.swing.ImageIcon(getClass().getResource("/Iconos/vacaciones-de-verano.png")), jPanel16); // NOI18N

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel34.setText("Cédula");

        jCBCedulaServiciosC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel35.setText("Cantidad de Servicios del Día:");

        jLCantidadC.setText("***");

        jLabel38.setText("Empleado:");

        jLEmpleadoC.setText("***");

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton14.setText("Buscar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addGap(18, 18, 18)
                        .addComponent(jLEmpleadoC))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addGap(18, 18, 18)
                        .addComponent(jLCantidadC))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel34)
                        .addGap(27, 27, 27)
                        .addComponent(jCBCedulaServiciosC, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jButton14)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jCBCedulaServiciosC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14))
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jLEmpleadoC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jLCantidadC))
                .addContainerGap(235, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Cantidad de Servicios", new javax.swing.ImageIcon(getClass().getResource("/Iconos/tijeras.png")), jPanel9); // NOI18N

        jTabbedPane1.addTab("Consultar", new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png")), jTabbedPane3); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("Ingrese el número de cédula del empleado que desea actualizar");

        jCBCedulaSalario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel9.setText("Salario Actual:");

        jLabel10.setText("Nuevo Salario:");

        jLSalario.setText("*****");

        jTFSalarioActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTFSalarioActualizarKeyTyped(evt);
            }
        });

        jBActualizarSalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBActualizarSalario.setText("Actualizar");
        jBActualizarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarSalarioActionPerformed(evt);
            }
        });

        jLabel54.setText("Empleado: ");

        jLEmpleado.setText("*****");

        jBCancelarSalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarSalario.setText("Cancelar");
        jBCancelarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarSalarioActionPerformed(evt);
            }
        });

        jButtonBuscarSalario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButtonBuscarSalario.setText("Buscar");
        jButtonBuscarSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarSalarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel54))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLSalario)
                                    .addComponent(jTFSalarioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLEmpleado))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCBCedulaSalario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonBuscarSalario))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBActualizarSalario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBCancelarSalario)))
                .addGap(62, 62, 62))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCedulaSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscarSalario))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(jLEmpleado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLSalario))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTFSalarioActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizarSalario)
                    .addComponent(jBCancelarSalario))
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Salario", new javax.swing.ImageIcon(getClass().getResource("/Iconos/salario.png")), jPanel4); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("Ingrese el número de cédula del empleado que desea actualizar");

        jCBJornadaA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel12.setText("Jornada Actual:");

        jLabel13.setText("Nueva Jornada:");

        jLJornada.setText("*****");

        jBActualizarJornada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBActualizarJornada.setText("Actualizar");
        jBActualizarJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarJornadaActionPerformed(evt);
            }
        });

        jCNuevaJornada.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matutina", "Vespertina" }));

        jLabel55.setText("Empleado: ");

        jLEmpleadoJornada.setText("*****");

        jBCancelarJornada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarJornada.setText("Cancelar");
        jBCancelarJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarJornadaActionPerformed(evt);
            }
        });

        jBBuscarJornada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jBBuscarJornada.setText("Buscar");
        jBBuscarJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarJornadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBActualizarJornada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBJornadaA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel55))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLJornada)
                                    .addComponent(jCNuevaJornada, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLEmpleadoJornada))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBCancelarJornada)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jBBuscarJornada)))
                .addGap(50, 50, 50))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBJornadaA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarJornada))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(jLEmpleadoJornada))
                .addGap(4, 4, 4)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLJornada))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jCNuevaJornada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizarJornada)
                    .addComponent(jBCancelarJornada))
                .addGap(73, 73, 73))
        );

        jTabbedPane2.addTab("Jornada", new javax.swing.ImageIcon(getClass().getResource("/Iconos/atras-en-el-tiempo.png")), jPanel11); // NOI18N

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel78.setText("Ingrese el número de cédula del empleado al que desea trasladar temporalmente");

        jCBCedulaTrasladoA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBBuscarTraslado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jBBuscarTraslado.setText("Buscar");
        jBBuscarTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTrasladoActionPerformed(evt);
            }
        });

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder("Traslado"));

        jLabel39.setText("Ida");

        jDateIda.setDateFormatString("dd/MM/yyyy");

        jBActualizaTraslado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBActualizaTraslado.setText("Actualizar");
        jBActualizaTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizaTrasladoActionPerformed(evt);
            }
        });

        jLabel41.setText("Ciudad");

        jDateRegreso.setDateFormatString("dd/MM/yyyy");

        jBCancelarTraslado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarTraslado.setText("Cancelar");
        jBCancelarTraslado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarTrasladoActionPerformed(evt);
            }
        });

        jCBciudadesA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenca", "Latacunga" }));

        jLabel45.setText("Regreso");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jBActualizaTraslado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jBCancelarTraslado)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addGap(30, 30, 30))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel23Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBciudadesA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jDateIda, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(jDateRegreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(35, 35, 35))))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBciudadesA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizaTraslado)
                    .addComponent(jBCancelarTraslado))
                .addContainerGap())
        );

        jLabel81.setText("Empleado:");

        jLabeFecha1.setText("Fecha de ida:");

        jLRegreso1.setText("Fecha de regreso:");

        jLTraslado1.setText("Ciudad de Traslado:");

        jLida1.setText("****");

        jLregreso1.setText("****");

        jLEmpleadoTrasladoC6.setText("****");

        jLciudad1.setText("****");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jCBCedulaTrasladoA, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBBuscarTraslado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel81)
                                .addGap(18, 18, 18)
                                .addComponent(jLEmpleadoTrasladoC6))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabeFecha1)
                                .addGap(18, 18, 18)
                                .addComponent(jLida1))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLRegreso1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLregreso1))
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLTraslado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLciudad1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel78)
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCedulaTrasladoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarTraslado))
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel81)
                            .addComponent(jLEmpleadoTrasladoC6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabeFecha1)
                            .addComponent(jLida1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLRegreso1)
                            .addComponent(jLregreso1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTraslado1)
                            .addComponent(jLciudad1)))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Traslado", new javax.swing.ImageIcon(getClass().getResource("/Iconos/destino.png")), jPanel22); // NOI18N

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("Ingrese el número de cédula del empleado que desea actualizar");

        jCBDiasLibreasA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel15.setText("Seleccione el día libre:");

        jScrollPane2.setViewportView(jLDiasLibresActualizar);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva Fecha"));

        jLabel20.setText("Fecha");

        jDCdialibreA.setDateFormatString("dd/MM/yyyy");

        jBActualizarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBActualizarDia.setText("Actualizar");
        jBActualizarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarDiaActionPerformed(evt);
            }
        });

        jBCancelarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarDia.setText("Cancelar");
        jBCancelarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarDiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(jDCdialibreA, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBActualizarDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jBCancelarDia)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDCdialibreA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizarDia)
                    .addComponent(jBCancelarDia)))
        );

        jBBuscarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jBBuscarDia.setText("Buscar");
        jBBuscarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarDiaActionPerformed(evt);
            }
        });

        jLabel71.setText("Empleado: ");

        jLEmpleadoDiasLibres.setText("*****");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLEmpleadoDiasLibres))
                    .addComponent(jLabel15)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCBDiasLibreasA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBBuscarDia))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBDiasLibreasA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarDia))
                .addGap(1, 1, 1)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLEmpleadoDiasLibres))
                .addGap(13, 13, 13)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Día Libre", new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendario.png")), jPanel12); // NOI18N

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setText("Ingrese el número de cédula del empleado que desea actualizar");

        jCBDiasVacacionesA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("Seleccione un periodo de vacaciones");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nuevo Periodo"));

        jLabel21.setText("Inicio");

        jDateInicio.setDateFormatString("dd/MM/yyyy");

        jBActualizarVacaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png"))); // NOI18N
        jBActualizarVacaciones.setText("Actualizar");
        jBActualizarVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarVacacionesActionPerformed(evt);
            }
        });

        jLabel22.setText("Fin");

        jDateChooserFin.setDateFormatString("dd/MM/yyyy");

        jBCancelarVacaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarVacaciones.setText("Cancelar");
        jBCancelarVacaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarVacacionesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jBActualizarVacaciones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBCancelarVacaciones)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jDateChooserFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(35, 35, 35))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooserFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBActualizarVacaciones)
                    .addComponent(jBCancelarVacaciones))
                .addContainerGap())
        );

        jTVacacionesA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jTVacacionesA);

        jBuscarVacA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jBuscarVacA.setText("Buscar");
        jBuscarVacA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarVacAActionPerformed(evt);
            }
        });

        jLabel72.setText("Empleado: ");

        jLEmpleadoVacacionesA.setText("*****");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBDiasVacacionesA, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addComponent(jBuscarVacA))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jLabel72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLEmpleadoVacacionesA))
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBDiasVacacionesA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscarVacA))
                .addGap(1, 1, 1)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLEmpleadoVacacionesA)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Vacaciones", new javax.swing.ImageIcon(getClass().getResource("/Iconos/vacaciones-de-verano.png")), jPanel15); // NOI18N

        jTabbedPane1.addTab("Actualizar", new javax.swing.ImageIcon(getClass().getResource("/Iconos/actualizar.png")), jTabbedPane2); // NOI18N

        jTabbedPane5.setBackground(new java.awt.Color(255, 255, 255));

        jPEmpleadoC1.setBackground(new java.awt.Color(255, 255, 255));

        jCBCedulaEmpleadoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel47.setText("Cédula");

        jBCancelarEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarEmp.setText("Cancelar");
        jBCancelarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarEmpActionPerformed(evt);
            }
        });

        jBEliminarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jBEliminarEmpleado.setText("Eliminar");
        jBEliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarEmpleadoActionPerformed(evt);
            }
        });

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton33.setText("Buscar");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jBDeshabilitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/prohibir-usuario.png"))); // NOI18N
        jBDeshabilitar.setText("Deshabilitar");
        jBDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDeshabilitarActionPerformed(evt);
            }
        });

        jPanelEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado Seleccionado"));

        jLabel73.setText("Cédula:");

        jLabel77.setText("Nombres:");

        jLabel79.setText("Apellidos:");

        jLabel80.setText("Ciudad Permanente de Trabajo:");

        jLabel82.setText("Salario:");

        jLabel83.setText("Jornada:");

        jLCedulaC2.setText("******");

        jLNombresC2.setText("******");

        jLApellidosC2.setText("******");

        jLCiudadC2.setText("******");

        jLJornadaC2.setText("******");

        jLSalarioC3.setText("******");

        jLabel84.setText("Especialidad:");

        jLEspecialidadC1.setText("******");

        jLabel89.setText("Estado:");

        jLEstadoC1.setText("******");

        javax.swing.GroupLayout jPanelEmpleadoLayout = new javax.swing.GroupLayout(jPanelEmpleado);
        jPanelEmpleado.setLayout(jPanelEmpleadoLayout);
        jPanelEmpleadoLayout.setHorizontalGroup(
            jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel84)
                        .addGap(18, 18, 18)
                        .addComponent(jLEspecialidadC1))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLCiudadC2))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel77)
                        .addGap(18, 18, 18)
                        .addComponent(jLNombresC2))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addComponent(jLabel73)
                        .addGap(30, 30, 30)
                        .addComponent(jLCedulaC2))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel79)
                            .addComponent(jLabel83))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLApellidosC2)
                            .addComponent(jLJornadaC2)))
                    .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                        .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel82)
                            .addComponent(jLabel89))
                        .addGap(33, 33, 33)
                        .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEstadoC1)
                            .addComponent(jLSalarioC3))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanelEmpleadoLayout.setVerticalGroup(
            jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEmpleadoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLCedulaC2))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel77)
                    .addComponent(jLNombresC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(jLApellidosC2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLJornadaC2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCiudadC2)
                    .addComponent(jLabel80))
                .addGap(11, 11, 11)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel84)
                    .addComponent(jLEspecialidadC1))
                .addGap(18, 18, 18)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82)
                    .addComponent(jLSalarioC3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEmpleadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel89)
                    .addComponent(jLEstadoC1))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPEmpleadoC1Layout = new javax.swing.GroupLayout(jPEmpleadoC1);
        jPEmpleadoC1.setLayout(jPEmpleadoC1Layout);
        jPEmpleadoC1Layout.setHorizontalGroup(
            jPEmpleadoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpleadoC1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPEmpleadoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPEmpleadoC1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPEmpleadoC1Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(48, 48, 48)
                        .addComponent(jCBCedulaEmpleadoE, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPEmpleadoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBEliminarEmpleado)
                    .addComponent(jBDeshabilitar)
                    .addComponent(jBCancelarEmp)
                    .addComponent(jButton33))
                .addGap(532, 532, 532))
        );
        jPEmpleadoC1Layout.setVerticalGroup(
            jPEmpleadoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPEmpleadoC1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPEmpleadoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPEmpleadoC1Layout.createSequentialGroup()
                        .addComponent(jBDeshabilitar)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminarEmpleado)
                        .addGap(18, 18, 18)
                        .addComponent(jBCancelarEmp)
                        .addGap(40, 40, 40))
                    .addGroup(jPEmpleadoC1Layout.createSequentialGroup()
                        .addGroup(jPEmpleadoC1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBCedulaEmpleadoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel47)
                            .addComponent(jButton33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanelEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 297, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jTabbedPane5.addTab("Empleado", new javax.swing.ImageIcon(getClass().getResource("/Iconos/perfil-del-usuario.png")), jPEmpleadoC1); // NOI18N

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        jLabel75.setText("Ingrese el número de cédula del empleado al que desea trasladar temporalmente");

        jCBCedulaTrasladoE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jBBuscarTrasladoE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jBBuscarTrasladoE.setText("Buscar");
        jBBuscarTrasladoE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTrasladoEActionPerformed(evt);
            }
        });

        jBEliminarTras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jBEliminarTras.setText("Eliminar");
        jBEliminarTras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarTrasActionPerformed(evt);
            }
        });

        jBCancelarTras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarTras.setText("Cancelar");
        jBCancelarTras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarTrasActionPerformed(evt);
            }
        });

        jLabel85.setText("Empleado: ");

        jLEmpleadoTrasladoE.setText("*****");

        jLabeFecha2.setText("Fecha de ida:");

        jLRegreso2.setText("Fecha de regreso:");

        jLregreso2.setText("****");

        jLida2.setText("****");

        jLTraslado2.setText("Ciudad de Traslado:");

        jLciudad2.setText("****");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(118, 118, 118))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jBEliminarTras)
                                    .addComponent(jCBCedulaTrasladoE, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jBBuscarTrasladoE)
                                    .addComponent(jBCancelarTras)))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabel85)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLEmpleadoTrasladoE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLTraslado2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLciudad2))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLRegreso2)
                                .addGap(18, 18, 18)
                                .addComponent(jLregreso2))
                            .addGroup(jPanel24Layout.createSequentialGroup()
                                .addComponent(jLabeFecha2)
                                .addGap(18, 18, 18)
                                .addComponent(jLida2)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel75)
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCedulaTrasladoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarTrasladoE))
                .addGap(29, 29, 29)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel85)
                    .addComponent(jLEmpleadoTrasladoE))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeFecha2)
                    .addComponent(jLida2))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLRegreso2)
                    .addComponent(jLregreso2))
                .addGap(18, 18, 18)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTraslado2)
                    .addComponent(jLciudad2))
                .addGap(64, 64, 64)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBEliminarTras)
                    .addComponent(jBCancelarTras))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Traslado", new javax.swing.ImageIcon(getClass().getResource("/Iconos/destino.png")), jPanel24); // NOI18N

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));

        jLabel59.setText("Cédula");

        jCBCedulaDiasLibresE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel60.setText("Empleado:");

        jLEmpleadoDiaE.setText("****");

        jScrollPane4.setViewportView(jListaDiasE);

        jLabel62.setText("Selecione el día libre a eliminar:");

        jBEliminarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jBEliminarDia.setText("Eliminar");
        jBEliminarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarDiaActionPerformed(evt);
            }
        });

        jBCAncelarDiaE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCAncelarDiaE.setText("Cancelar");
        jBCAncelarDiaE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCAncelarDiaEActionPerformed(evt);
            }
        });

        jBDiasE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jBDiasE.setText("Buscar");
        jBDiasE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBDiasEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel62)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel60)
                        .addGap(18, 18, 18)
                        .addComponent(jLEmpleadoDiaE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel59)
                        .addGap(33, 33, 33)
                        .addComponent(jCBCedulaDiasLibresE, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jBDiasE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(jBEliminarDia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCAncelarDiaE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(jCBCedulaDiasLibresE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBDiasE))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(jLEmpleadoDiaE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel62)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 39, Short.MAX_VALUE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEliminarDia)
                            .addComponent(jBCAncelarDiaE))))
                .addGap(43, 43, 43))
        );

        jTabbedPane5.addTab("Día Libre", new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendario.png")), jPanel19); // NOI18N

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel63.setText("Cédula");

        jCBCedulaVacacionesE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel64.setText("Empleado:");

        jLEmpleadoVacE.setText("****");

        jLabel66.setText("Seleccione el periodo de vacaciones a eliminar:");

        jTVacacionesE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTVacacionesE);

        jBCancelarEliminarVaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jBCancelarEliminarVaca.setText("Cancelar");
        jBCancelarEliminarVaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCancelarEliminarVacaActionPerformed(evt);
            }
        });

        jBEliminarVaca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jBEliminarVaca.setText("Eliminar");
        jBEliminarVaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarVacaActionPerformed(evt);
            }
        });

        jBBuscarVacacionE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jBBuscarVacacionE.setText("Buscar");
        jBBuscarVacacionE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarVacacionEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBBuscarVacacionE)
                        .addGap(86, 86, 86))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel64)
                                .addGap(18, 18, 18)
                                .addComponent(jLEmpleadoVacE))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(jLabel63)
                                .addGap(33, 33, 33)
                                .addComponent(jCBCedulaVacacionesE, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jBEliminarVaca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBCancelarEliminarVaca)
                        .addGap(56, 56, 56))))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(jCBCedulaVacacionesE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarVacacionE))
                .addGap(26, 26, 26)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jLEmpleadoVacE))
                .addGap(18, 18, 18)
                .addComponent(jLabel66)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBEliminarVaca)
                            .addComponent(jBCancelarEliminarVaca))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Vacaciones", new javax.swing.ImageIcon(getClass().getResource("/Iconos/vacaciones-de-verano.png")), jPanel20); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane5)
        );

        jTabbedPane1.addTab("Eliminar", new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png")), jPanel7); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel6.setText("Administrar Empleados");

        jButton12.setBackground(new java.awt.Color(255, 153, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atras.png"))); // NOI18N
        jButton12.setBorder(null);
        jButton12.setBorderPainted(false);
        jButton12.setContentAreaFilled(false);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(103, 103, 103))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTFSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFSalarioActionPerformed

    private void jTFApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFApellidosActionPerformed

    private void jTFNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombresActionPerformed

    private void jtfcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfcedulaActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        JFMenu fjmenu = new JFMenu();
        fjmenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Validar val=new Validar();
        
        String cedula=this.jtfcedula.getText();
        
        if (!val.verificarCedula(cedula)) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido", "ERROR!", 0);
            this.jtfcedula.setText("");
            return;
        }
        
        if(val.cedulaPerteneceEmpleado(cedula)){
            JOptionPane.showMessageDialog(null, "El número de cédula ya pertenece a otro empleado", "ERROR!", 0);
            this.jtfcedula.setText("");
            return;
        }
            
            
        
        String nombres=this.jTFNombres.getText();
        
        if(!val.validarNombres(nombres)){
            JOptionPane.showMessageDialog(null, "Ingrese nombres válidos", "ERROR!", 0);
            this.jTFNombres.setText("");
            return;
        }
                
        String apellidos=this.jTFApellidos.getText();
        if(!val.validarNombres(apellidos)){
            JOptionPane.showMessageDialog(null, "Ingrese apellidos válidos", "ERROR!", 0);
            this.jTFApellidos.setText("");
            return;
        }
        
        String ciudad=this.jCBciudadesR1.getSelectedItem().toString();
        
        String jornada=this.jCBJornada.getSelectedItem().toString();
        
        String especialidad=this.jTFEspecialidad.getText();
        
        if(!val.validarNombres(especialidad)){
            JOptionPane.showMessageDialog(null, "Ingrese una especialidad válida", "ERROR!", 0);
            this.jTFEspecialidad.setText("");
            return;
        }

        try{
        float salario=Float.parseFloat(this.jTFSalario.getText());
        
        if(!val.validarSalario(salario)){
            JOptionPane.showMessageDialog(null, "Ingrese un salario válido", "ERROR!", 0);
            this.jTFSalario.setText("");
            return;
        }
        
        Empleado empleado=new Empleado(cedula, nombres, apellidos, jornada, ciudad, salario,especialidad);
        empleado.Registrar();
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un salario válido", "ERROR!", 0);
            this.jTFSalario.setText("");
            return;
        }
        
        
        
        
       this.jtfcedula.setText("");
       this.jTFNombres.setText("");
       this.jTFApellidos.setText("");
       //this.jTFCiudad.setText("");
       this.jTFEspecialidad.setText("");
       this.jTFSalario.setText("");
       
       this.actualizarComboBox();
       jButton27.setEnabled(true);
            jBRegistrarDiaLibre.setEnabled(true);
            jBRegistrarVacacion.setEnabled(true);
            jButton13.setEnabled(true);
            jButton24.setEnabled(true);
            jButton15.setEnabled(true);
            jButton16.setEnabled(true);
            jButton14.setEnabled(true);
            jButtonBuscarSalario.setEnabled(true);
            jBBuscarJornada.setEnabled(true);
            jBBuscarTraslado.setEnabled(true);
            jBBuscarDia.setEnabled(true);
            jBuscarVacA.setEnabled(true);
            jButton33.setEnabled(true);
            jBBuscarTrasladoE.setEnabled(true);
            jBDiasE.setEnabled(true);
            jBBuscarVacacionE.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTFEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEspecialidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEspecialidadActionPerformed

    private void jBRegistrarDiaLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarDiaLibreActionPerformed
       Date diaLibre=jDCDiaLibre.getDate();
       
       String cedula=jCBCedulaDiasLibresR.getSelectedItem().toString();
       Validar val=new Validar();
        System.out.println(cedula);
       
        /*
     if (!val.verificarCedula(cedula)) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido", "ERROR!", 0);
           
            return;
       }
     
     if (!val.cedulaPerteneceEmpleado(cedula)) {
            JOptionPane.showMessageDialog(null, "La cédula no corresponde a ningun empleado", "ERROR!", 0);
           
            return;
       }*/
       
       if(diaLibre==null){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
           return;
       }
       
       if(diaLibre.before(new Date(System.currentTimeMillis()))){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
           return;
       }
       
       
       DiaLibre dl=new DiaLibre(cedula, new java.sql.Date(diaLibre.getTime()));
       
       
           dl.Registrar();
        this.jDCDiaLibre.setDate(null);
    }//GEN-LAST:event_jBRegistrarDiaLibreActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
       String cedula=jCBCedulaTrasladoR.getSelectedItem().toString();
       Validar val=new Validar();
        System.out.println(cedula);
     /*  
     if (!val.verificarCedula(cedula)) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido", "ERROR!", 0);
           
            return;
       }
     
     if (!val.cedulaPerteneceEmpleado(cedula)) {
            JOptionPane.showMessageDialog(null, "La cédula no corresponde a ningun empleado", "ERROR!", 0);
           
            return;
       }*/
       
     Date inicio=jDCida.getDate();
     
      if(inicio==null){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
           jDCida.setDate(null);
           return;
       }
       
       if(inicio.before(new Date(System.currentTimeMillis()))){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
           jDCida.setDate(null);
           return;
       }
        
       Date fin=jDCregreso.getDate();
       
       if(fin==null){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha de regreso válida", "ERROR!", 0);
           jDCregreso.setDate(null);
           return;
       }
       
       if(!val.validarFechasInicioFin(inicio, fin)){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha de regreso válida", "ERROR!", 0);
           jDCregreso.setDate(null);
           return;
       }
       
       String ciudad=jCBciudadesR.getSelectedItem().toString();
       
       Traslado tr=new Traslado(cedula, ciudad, new java.sql.Date(inicio.getTime()),new java.sql.Date( fin.getTime()));
       tr.Registrar();
       this.jDCida.setDate(null);
       this.jDCregreso.setDate(null);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jBRegistrarVacacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarVacacionActionPerformed
        
       
       String cedula=jCBCedulaVacacionesR.getSelectedItem().toString();
       Validar val=new Validar();
        System.out.println(cedula);
       
     if (!val.verificarCedula(cedula)) {
            JOptionPane.showMessageDialog(null, "Ingrese un número de cédula válido", "ERROR!", 0);
           
            return;
       }
     
     if (!val.cedulaPerteneceEmpleado(cedula)) {
            JOptionPane.showMessageDialog(null, "La cédula no corresponde a ningun empleado", "ERROR!", 0);
           
            return;
       }
       
     Date inicio=jDCinicioVacacion.getDate();
     
      if(inicio==null){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
           jDCinicioVacacion.setDate(null);
           return;
       }
       
       if(inicio.before(new Date(System.currentTimeMillis()))){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
           jDCinicioVacacion.setDate(null);
           return;
       }
        
       Date fin=jDCFinVacacion.getDate();
       
       if(fin==null){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha de final válida", "ERROR!", 0);
           jDCFinVacacion.setDate(null);
           return;
       }
       
       if(!val.validarFechasInicioFin(inicio, fin)){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha de final válida", "ERROR!", 0);
           jDCFinVacacion.setDate(null);
           return;
       }
     
       Vacacion vc=new Vacacion(cedula, new java.sql.Date(inicio.getTime()),new java.sql.Date( fin.getTime()));
       vc.Registrar();
       
       rellenarCedulas(jCBCedulaSalario);
        rellenarCedulas(jCBCedulaDiasLibresR);
        rellenarCedulas(jCBCedulaVacacionesR);
        rellenarCedulas(jCBCedulaTrasladoR);   
         rellenarCedulas(jCBCedulaEmpleadoC);
        rellenarCedulas(jCBCedulaServiciosC);
        rellenarCedulas(jCBCedulaDiasLibresC);
        rellenarCedulas(jCBCedulaVacacionesC);
        rellenarCedulas(jCBDiasLibreasA);
        rellenarCedulas(jCBDiasVacacionesA);
        rellenarCedulas(jCBJornadaA);
         rellenarCedulas(jCBCedulaEmpleadoE);
        rellenarCedulas(jCBCedulaDiasLibresE);
        rellenarCedulas(jCBCedulaVacacionesE); 
       
    }//GEN-LAST:event_jBRegistrarVacacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.jtfcedula.setText("");
       this.jTFNombres.setText("");
       this.jTFApellidos.setText("");
      // this.jTFCiudad.setText("");
       this.jTFEspecialidad.setText("");
       this.jTFSalario.setText("");
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
       this.jDCida.setDate(null);
       this.jDCregreso.setDate(null);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        this.jDCDiaLibre.setDate(null);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        this.jDCinicioVacacion.setDate(null);
        this.jDCFinVacacion.setDate(null);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        
        if(this.jCBCedulaEmpleadoC.getSelectedIndex()==-1){
            return;
        }
                
        Empleado emp=new Empleado(this.jCBCedulaEmpleadoC.getSelectedItem().toString());
        
        this.jLCedulaC.setText(emp.getCedula());
        this.jLNombresC.setText(emp.getNombres());
        this.jLApellidosC.setText(emp.getApellidos());
        this.jLJornadaC.setText(emp.getJornada());
        this.jLCiudadC.setText(emp.getCiudad());
        this.jLEspecialidadC.setText(emp.getEspecialidad());
        this.jLSalarioC.setText(Float.toString(emp.getSalario()));
        
        
        String hab=emp.getHabilitado();
        if(hab.equals("A")){
        this.jLEstadoC.setText("Habilitado");
        }else{
        this.jLEstadoC.setText("Deshabilitado");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        Empleado emp=new Empleado(this.jCBCedulaServiciosC.getSelectedItem().toString());
        
        this.jLEmpleadoC.setText(emp.getNombres()+" "+emp.getApellidos());
        
        CantidadServicios cs=new CantidadServicios(emp.getCedula());
        
        jLCantidadC.setText(""+cs.getCantidad());
        
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        Empleado emp=new Empleado(this.jCBCedulaDiasLibresC.getSelectedItem().toString());
        
        this.jLEmpleadoDiasLibresC.setText(emp.getNombres()+" "+emp.getApellidos());
        
        rellenarLista(this.jListDiasLibres, emp);
        if(this.jListDiasLibres.getModel().getSize()==0){
        JOptionPane.showMessageDialog(null, "El empleado no tienen ningun día libre registrado");
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        Empleado emp=new Empleado(this.jCBCedulaVacacionesC.getSelectedItem().toString());
        
        this.jLEmpleadoVacacionesC.setText(emp.getNombres()+" "+emp.getApellidos());
        
        rellenarTabla(this.jTVacaciones, emp);
        
        if(this.jTVacaciones.getModel().getRowCount()==0){
        JOptionPane.showMessageDialog(null, "El empleado no tiene vacaciones registradas");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButtonBuscarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarSalarioActionPerformed
        
        if(this.jCBCedulaSalario.getSelectedItem().toString()==""){
            return;
        }
        
        
        Empleado emp=new Empleado(this.jCBCedulaSalario.getSelectedItem().toString());
        
        this.jLEmpleado.setText(emp.getNombres()+" "+emp.getApellidos());
        this.jLSalario.setText(Float.toString(emp.getSalario()));
        
        this.jBActualizarSalario.setEnabled(true);
        this.jBCancelarSalario.setEnabled(true);
        
        
        jCBCedulaSalario.setEnabled(false);
        jButtonBuscarSalario.setEnabled(false);
        /*
        float salario=Float.parseFloat(this.jTFSalario.getText());
        
        if(!val.validarSalario(salario)){
            JOptionPane.showMessageDialog(null, "Ingrese un salario válido", "ERROR!", 0);
            this.jTFApellidos.setText("");
            return;
        }
        
        
        emp.atualizarSalario(salario);*/
    }//GEN-LAST:event_jButtonBuscarSalarioActionPerformed

    private void jBBuscarJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarJornadaActionPerformed
          Empleado emp=new Empleado(this.jCBJornadaA.getSelectedItem().toString());
        
        this.jLEmpleadoJornada.setText(emp.getNombres()+" "+emp.getApellidos());
        this.jLJornada.setText(emp.getJornada());
        
        this.jBActualizarJornada.setEnabled(true);
        this.jBCancelarJornada.setEnabled(true);
        jBBuscarJornada.setEnabled(false);
        
    }//GEN-LAST:event_jBBuscarJornadaActionPerformed

    private void jBBuscarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarDiaActionPerformed
        Empleado emp=new Empleado(this.jCBDiasLibreasA.getSelectedItem().toString());
        
        this.jLEmpleadoDiasLibres.setText(emp.getNombres()+" "+emp.getApellidos());
        
        rellenarLista(this.jLDiasLibresActualizar, emp);
        this.jBActualizarDia.setEnabled(true);
        this.jBCancelarDia.setEnabled(true);
        jBBuscarDia.setEnabled(false); 
        
        if(this.jLDiasLibresActualizar.getModel().getSize()==0){
        JOptionPane.showMessageDialog(null, "El empleado no tienen ningun día libre registrado");
        this.jBActualizarDia.setEnabled(false);
        this.jBCancelarDia.setEnabled(false);
        jBBuscarDia.setEnabled(true);   
        }
        
     
    }//GEN-LAST:event_jBBuscarDiaActionPerformed

    private void jBuscarVacAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarVacAActionPerformed
        Empleado emp=new Empleado(this.jCBDiasVacacionesA.getSelectedItem().toString());
        
        this.jLEmpleadoVacacionesA.setText(emp.getNombres()+" "+emp.getApellidos());
        
        rellenarTabla(this.jTVacacionesA, emp);
        this.jBActualizarVacaciones.setEnabled(true);
        this.jBCancelarVacaciones.setEnabled(true);
        jBuscarVacA.setEnabled(false);
        jCBDiasVacacionesA.setEnabled(false);
        if(this.jTVacacionesA.getModel().getRowCount()==0){
        JOptionPane.showMessageDialog(null, "El empleado no tiene vacaciones registradas");
        this.jBActualizarVacaciones.setEnabled(false);
        this.jBCancelarVacaciones.setEnabled(false);
        jBuscarVacA.setEnabled(true);
        jCBDiasVacacionesA.setEnabled(true);
        }
        
    }//GEN-LAST:event_jBuscarVacAActionPerformed

    private void jBActualizarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarSalarioActionPerformed
        Empleado emp=new Empleado(this.jCBCedulaSalario.getSelectedItem().toString());
        Validar val=new Validar();
        
        Float salario=emp.getSalario();
        try{
            salario=Float.parseFloat(this.jTFSalarioActualizar.getText());
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ingrese un salario válido", "ERROR!", 0);
            System.out.println(e);
            this.jTFSalarioActualizar.setText("");
            return;
        }
        
        
        if(!val.validarSalario(salario)){
            System.out.println("Hola");
            JOptionPane.showMessageDialog(null, "Ingrese un salario válido", "ERROR!", 0);
            this.jTFSalarioActualizar.setText("");
            return;
        }
        
        
        emp.atualizarSalario(salario);
        this.jBActualizarSalario.setEnabled(false);
        this.jTFSalarioActualizar.setText("");
        this.jBCancelarSalario.setEnabled(false);
        this.jLEmpleado.setText("");
        this.jLSalario.setText("");
        this.jCBCedulaSalario.setEnabled(true);
        jButtonBuscarSalario.setEnabled(true);
    }//GEN-LAST:event_jBActualizarSalarioActionPerformed

    private void jBCancelarSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarSalarioActionPerformed
        this.jBActualizarSalario.setEnabled(false);
        this.jTFSalarioActualizar.setText("");
        this.jBCancelarSalario.setEnabled(false);
        this.jLEmpleado.setText("");
        this.jLSalario.setText("");
        this.jCBCedulaSalario.setEnabled(true);
        jButtonBuscarSalario.setEnabled(true);
    }//GEN-LAST:event_jBCancelarSalarioActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jPanelEmpleado.setVisible(true);
        
        Empleado emp=new Empleado(this.jCBCedulaEmpleadoE.getSelectedItem().toString());
        
        this.jLCedulaC2.setText(emp.getCedula());
        this.jLNombresC2.setText(emp.getNombres());
        this.jLApellidosC2.setText(emp.getApellidos());
        this.jLJornadaC2.setText(emp.getJornada());
        this.jLCiudadC2.setText(emp.getCiudad());
        this.jLEspecialidadC1.setText(emp.getEspecialidad());
        this.jLSalarioC3.setText(Float.toString(emp.getSalario()));
        
        
        String hab=emp.getHabilitado();
        if(hab.equals("A")){
        this.jLEstadoC1.setText("Habilitado");
        this.jBDeshabilitar.setText("Deshabilitar");
        this.jBDeshabilitar.setIcon(deshabilitar);
        }else{
        this.jLEstadoC1.setText("Deshabilitado");
        this.jBDeshabilitar.setText("Habilitar");
        this.jBDeshabilitar.setIcon(aceptar);
        }
        
        jBDeshabilitar.setEnabled(true);
        jBEliminarEmpleado.setEnabled(true);
        jBCancelarEmp.setEnabled(true);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jBDiasEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDiasEActionPerformed
        Empleado emp=new Empleado(this.jCBCedulaDiasLibresE.getSelectedItem().toString());
        
        this.jLEmpleadoDiaE.setText(emp.getNombres()+" "+emp.getApellidos());
        
        rellenarLista(this.jListaDiasE, emp);
        this.jBEliminarDia.setEnabled(true);
        this.jBCAncelarDiaE.setEnabled(true);
       
        jBDiasE.setEnabled(false); 
        jCBCedulaDiasLibresE.setEnabled(false); 
        
        if(this.jListaDiasE.getModel().getSize()==0){
        JOptionPane.showMessageDialog(null, "El empleado no tiene ningún día libre registrado");
        this.jBEliminarDia.setEnabled(false);
        this.jBCAncelarDiaE.setEnabled(false);
        jBDiasE.setEnabled(true); 
        jCBCedulaDiasLibresE.setEnabled(true); 
        }
        
    }//GEN-LAST:event_jBDiasEActionPerformed

    private void jBBuscarVacacionEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarVacacionEActionPerformed
        Empleado emp=new Empleado(this.jCBCedulaVacacionesE.getSelectedItem().toString());
        
        this.jLEmpleadoVacE.setText(emp.getNombres()+" "+emp.getApellidos());
        
        rellenarTabla(this.jTVacacionesE, emp);
        this.jBEliminarVaca.setEnabled(true);
        this.jBCancelarEliminarVaca.setEnabled(true);
        jBBuscarVacacionE.setEnabled(false);
        if(this.jTVacacionesE.getModel().getRowCount()==0){
            JOptionPane.showMessageDialog(null, "El empleado no tiene vacaciones registradas");
            this.jBEliminarVaca.setEnabled(false);
            this.jBCancelarEliminarVaca.setEnabled(false);
            jBBuscarVacacionE.setEnabled(true);
        }
    }//GEN-LAST:event_jBBuscarVacacionEActionPerformed

    private void jBActualizarJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarJornadaActionPerformed
        Empleado emp=new Empleado(this.jCBJornadaA.getSelectedItem().toString());
        
        emp.atualizarJornada(this.jCNuevaJornada.getSelectedItem().toString());
        
        this.jLJornada.setText(this.jCNuevaJornada.getSelectedItem().toString());
        
        this.jBActualizarJornada.setEnabled(false);
        this.jBCancelarJornada.setEnabled(false);
        jBBuscarJornada.setEnabled(true);
    }//GEN-LAST:event_jBActualizarJornadaActionPerformed

    private void jBActualizarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarDiaActionPerformed
        Empleado emp=new Empleado(this.jCBDiasLibreasA.getSelectedItem().toString());
        String dia=this.jLDiasLibresActualizar.getSelectedValue();
        System.out.print(dia);
        
        if(dia==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un día primero", "ERROR!", 0);
           
            return;
        }
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date diaviejo=formato.parse(dia);
            
            Date dianuevo=this.jDCdialibreA.getDate();
        
        if(dianuevo==null){
            JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
            this.jDCdialibreA.setDate(null);
            return;
        }
        
        if(dianuevo.before(new Date(System.currentTimeMillis()))){
           JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "ERROR!", 0);
           return;
       }
            DiaLibre day=new DiaLibre(emp.getCedula(),new java.sql.Date(diaviejo.getTime()));
            day.atualizarDia(new java.sql.Date(dianuevo.getTime()));
            rellenarLista(this.jLDiasLibresActualizar, emp);
            this.jDCdialibreA.setDate(null);
        
        this.jBActualizarDia.setEnabled(false);
        this.jBCancelarDia.setEnabled(false);
        //jLEmpleadoDiasLibres.setText("");
        jBBuscarDia.setEnabled(true); 
       
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un día primero", "ERROR!", 0);
            return;
        }
        
        
        
    }//GEN-LAST:event_jBActualizarDiaActionPerformed

    private void jBActualizarVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarVacacionesActionPerformed
          Empleado emp=new Empleado(this.jCBDiasVacacionesA.getSelectedItem().toString());
          Validar val=new Validar();
          int r=this.jTVacacionesA.getSelectedRow();
          if(r==-1){
              JOptionPane.showMessageDialog(null, "Seleccione un periodo de vacaciones", "ERROR!", 0);
              return;
          }
          
          DefaultTableModel modelodatos = (DefaultTableModel) this.jTVacacionesA.getModel();
         
         String diainicioviejoS=modelodatos.getValueAt(r, 1).toString();
          
         String diafinviejoS=modelodatos.getValueAt(r, 2).toString();
          
          
          SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
          
        
          try {
              
            Date diainicioviejo=formato.parse(diainicioviejoS);
            Date diaifinviejo=formato.parse(diafinviejoS);
            
            //System.out.print(diainicioviejo+" "+diaifinviejo);
            
            
            Date diainicionuevo=this.jDateInicio.getDate();
            Date diafinnuevo=this.jDateChooserFin.getDate();
           
            if(diainicionuevo==null){
                JOptionPane.showMessageDialog(null, "Seleccione una fecha válida", "ERROR!", 0);
                this.jDateInicio.setDate(null);
                return;
            }
            
            if(diainicionuevo.before(new Date(System.currentTimeMillis()))){
            JOptionPane.showMessageDialog(null, "Seleccione una fecha válida", "ERROR!", 0);
            return;
            }
            
            if(diafinnuevo==null || !val.validarFechasInicioFin(diainicionuevo, diafinnuevo)){
                JOptionPane.showMessageDialog(null, "Seleccione una fecha final válida", "ERROR!", 0);
                this.jDateChooserFin.setDate(null);
                return;
            }
            
            
            
            Vacacion vac=new Vacacion(emp.getCedula(), new java.sql.Date(diainicioviejo.getTime()), new java.sql.Date(diaifinviejo.getTime()));
            
            
             
            
            vac.atualizarDia(new java.sql.Date(diainicionuevo.getTime()),new java.sql.Date(diafinnuevo.getTime()));
            rellenarTabla(jTVacacionesA, emp);
            this.jDateInicio.setDate(null);
            this.jDateChooserFin.setDate(null);
            
        } catch (Exception ex) {
              ex.toString();
        }
            
            
            
    }//GEN-LAST:event_jBActualizarVacacionesActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
    


        jLida.setText("");
        jLregreso.setText("");
        jLciudad.setText("");
        jLabeFecha.setVisible(false);
        jLRegreso.setVisible(false);
        jLTraslado.setVisible(false);
        Empleado emp=new Empleado(this.jCBCedulaTrasladoC.getSelectedItem().toString());
        
        this.jLEmpleadoTrasladoC.setText(emp.getNombres()+" "+emp.getApellidos());
        
        Validar val=new Validar();
        
        if(val.cedulaTraslado(emp.getCedula())){
            Traslado tr=new Traslado(emp.getCedula());
            jLida.setText(tr.getIda().toString());
            jLregreso.setText(tr.getRegreso().toString());
            jLciudad.setText(tr.getCiudad());
            jLabeFecha.setVisible(true);
            jLRegreso.setVisible(true);
            jLTraslado.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "El empleado no tiene ningún traslado registrado");
        }
        
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jBBuscarTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTrasladoActionPerformed
        jLida1.setText("");
        jLregreso1.setText("");
        jLciudad1.setText("");
        jLabeFecha1.setVisible(false);
        jLRegreso1.setVisible(false);
        jLTraslado1.setVisible(false);
        Empleado emp=new Empleado(this.jCBCedulaTrasladoA.getSelectedItem().toString());
        
        this.jLEmpleadoTrasladoC6.setText(emp.getNombres()+" "+emp.getApellidos());
        
        Validar val=new Validar();
        
        if(val.cedulaTraslado(emp.getCedula())){
            Traslado tr=new Traslado(emp.getCedula());
            jLida1.setText(tr.getIda().toString());
            jLregreso1.setText(tr.getRegreso().toString());
            jLciudad1.setText(tr.getCiudad());
            jLabeFecha1.setVisible(true);
            jLRegreso1.setVisible(true);
            jLTraslado1.setVisible(true);
            jBActualizaTraslado.setEnabled(true);
            jBCancelarTraslado.setEnabled(true);
            jBBuscarTraslado.setEnabled(false);
        }else{
            JOptionPane.showMessageDialog(null, "El empleado no tiene ningún traslado registrado");
            jBActualizaTraslado.setEnabled(false);
            jBCancelarTraslado.setEnabled(false);
            jBBuscarTraslado.setEnabled(true);
        }
       
    }//GEN-LAST:event_jBBuscarTrasladoActionPerformed

    private void jBActualizaTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizaTrasladoActionPerformed
        
        Empleado emp=new Empleado(this.jCBCedulaTrasladoA.getSelectedItem().toString());
        Validar val=new Validar();
        Date ida=jDateIda.getDate();
        Date regreso=jDateRegreso.getDate();
        String ciudad=this.jCBciudadesA.getSelectedItem().toString();
        
        if(ida==null){
            JOptionPane.showMessageDialog(null, "Seleccione una fecha válida", "ERROR!", 0);
            this.jDateIda.setDate(null);
            return;
        }
            
        if(regreso==null || !val.validarFechasInicioFin(ida, regreso)){
             JOptionPane.showMessageDialog(null, "Seleccione una fecha de regreso válida", "ERROR!", 0);
             this.jDateRegreso.setDate(null);
             return;
        }
        
        Traslado tras=new Traslado(emp.getCedula());
        
        tras.atualizar(ciudad, new java.sql.Date(ida.getTime()), new java.sql.Date(regreso.getTime()));
        jLida1.setText(tras.getIda().toString());
        jLregreso1.setText(tras.getRegreso().toString());
        jLciudad1.setText(tras.getCiudad());
        
        jBBuscarTraslado.setEnabled(true);
        jBActualizaTraslado.setEnabled(false);
            jBCancelarTraslado.setEnabled(false);
    }//GEN-LAST:event_jBActualizaTrasladoActionPerformed

    private void jBBuscarTrasladoEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTrasladoEActionPerformed
        jLida2.setText("");
        jLregreso2.setText("");
        jLciudad2.setText("");
        jLabeFecha2.setVisible(false);
        jLRegreso2.setVisible(false);
        jLTraslado2.setVisible(false);
        Empleado emp=new Empleado(this.jCBCedulaTrasladoE.getSelectedItem().toString());
        
        this.jLEmpleadoTrasladoE.setText(emp.getNombres()+" "+emp.getApellidos());
        
        Validar val=new Validar();
        
        if(val.cedulaTraslado(emp.getCedula())){
            Traslado tr=new Traslado(emp.getCedula());
            jLida2.setText(tr.getIda().toString());
            jLregreso2.setText(tr.getRegreso().toString());
            jLciudad2.setText(tr.getCiudad());
            jLabeFecha2.setVisible(true);
            jLRegreso2.setVisible(true);
            jLTraslado2.setVisible(true);
            jBEliminarTras.setEnabled(true);
            jBCancelarTras.setEnabled(true);
            jBBuscarTrasladoE.setEnabled(false);
            this.jCBCedulaTrasladoE.setEnabled(false);
          
        }else{
            JOptionPane.showMessageDialog(null, "El empleado no tiene ningun traslado registrado");
            jBEliminarTras.setEnabled(false);
            jBCancelarTras.setEnabled(false);
            jBBuscarTrasladoE.setEnabled(true);
            this.jCBCedulaTrasladoE.setEnabled(true);
        }
        
        
        
    }//GEN-LAST:event_jBBuscarTrasladoEActionPerformed

    private void jBCancelarJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarJornadaActionPerformed
       jLEmpleadoJornada.setText("");
       jLJornada.setText("");
       this.jBActualizarJornada.setEnabled(false);
        this.jBCancelarJornada.setEnabled(false);
        jBBuscarJornada.setEnabled(true);
    }//GEN-LAST:event_jBCancelarJornadaActionPerformed

    private void jBCancelarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarDiaActionPerformed
        this.jDCdialibreA.setDate(null);
        DefaultListModel modelo = new DefaultListModel();
        modelo.removeAllElements();
        jLDiasLibresActualizar.setModel(modelo);
        this.jBActualizarDia.setEnabled(false);
        this.jBCancelarDia.setEnabled(false);
        jLEmpleadoDiasLibres.setText("");
        jBBuscarDia.setEnabled(true);   
    }//GEN-LAST:event_jBCancelarDiaActionPerformed

    private void jBDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBDeshabilitarActionPerformed
        Empleado emp=new Empleado(this.jLCedulaC2.getText());
        
        
        if(emp.getHabilitado().equals("A")){
            
        emp.atualizarEstado("D");
        this.jLEstadoC1.setText("Habilitado");
        this.jBDeshabilitar.setText("Habilitar");
        this.jBDeshabilitar.setIcon(aceptar);
        
        jLEstadoC1.setText("Deshabilitado");
        JOptionPane.showMessageDialog(null, "El empleado ha sido deshabilitado"); 
        }else{
        emp.atualizarEstado("A");
        this.jLEstadoC1.setText("Deshabilitado");
        this.jBDeshabilitar.setText("Deshabilitar");
        this.jBDeshabilitar.setIcon(deshabilitar);
        jLEstadoC1.setText("Habilitado");
        JOptionPane.showMessageDialog(null, "El empleado ha sido habilitado"); 
        }
        
        
    }//GEN-LAST:event_jBDeshabilitarActionPerformed

    private void jBEliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarEmpleadoActionPerformed
        
        if(0==JOptionPane.showConfirmDialog(null,"¿Está seguro de que quiere eliminar este empleado?", "confirmación",JOptionPane.YES_NO_OPTION)){
            //System.out.println("si");
            Empleado emp=new Empleado(this.jCBCedulaEmpleadoE.getSelectedItem().toString());
            emp.Eliminar();
            jBDeshabilitar.setEnabled(false);
            jBEliminarEmpleado.setEnabled(false);
            jBCancelarEmp.setEnabled(false);
            this.jLCedulaC2.setText("");
            this.jLNombresC2.setText("");
            this.jLApellidosC2.setText("");
            this.jLJornadaC2.setText("");
            this.jLCiudadC2.setText("");
            this.jLEspecialidadC1.setText("");
            this.jLSalarioC3.setText("");
            this.jLEstadoC1.setText("");
            this.actualizarComboBox();
            
            if(jCBCedulaTrasladoR.getSelectedIndex()==-1){
            jButton27.setEnabled(false);
            jBRegistrarDiaLibre.setEnabled(false);
            jBRegistrarVacacion.setEnabled(false);
            jButton13.setEnabled(false);
            jButton24.setEnabled(false);
            jButton15.setEnabled(false);
            jButton16.setEnabled(false);
            jButton14.setEnabled(false);
            jButtonBuscarSalario.setEnabled(false);
            jBBuscarJornada.setEnabled(false);
            jBBuscarTraslado.setEnabled(false);
            jBBuscarDia.setEnabled(false);
            jBuscarVacA.setEnabled(false);
            jButton33.setEnabled(false);
            jBBuscarTrasladoE.setEnabled(false);
            jBDiasE.setEnabled(false);
            jBBuscarVacacionE.setEnabled(false);
        }
            
        }else{
            JOptionPane.showMessageDialog(null, "El empleado NO ha sido eliminado");
            
        }
        
        
    }//GEN-LAST:event_jBEliminarEmpleadoActionPerformed

    private void jBCancelarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarEmpActionPerformed
        jBDeshabilitar.setEnabled(false);
            jBEliminarEmpleado.setEnabled(false);
            jBCancelarEmp.setEnabled(false);
            this.jLCedulaC2.setText("");
            this.jLNombresC2.setText("");
            this.jLApellidosC2.setText("");
            this.jLJornadaC2.setText("");
            this.jLCiudadC2.setText("");
            this.jLEspecialidadC1.setText("");
            this.jLSalarioC3.setText("");
            this.jLEstadoC1.setText("");
    }//GEN-LAST:event_jBCancelarEmpActionPerformed

    private void jBCancelarTrasladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarTrasladoActionPerformed
        jBActualizaTraslado.setEnabled(false);
        jBCancelarTraslado.setEnabled(false);
        jLida1.setText("");
        jLregreso1.setText("");
        jLciudad1.setText("");
        jLabeFecha1.setVisible(true);
        jLRegreso1.setVisible(true);
        jLTraslado1.setVisible(true);
        this.jLEmpleadoTrasladoC6.setText("");
        jDateIda.setDate(null);
        jDateRegreso.setDate(null);
        jBBuscarTraslado.setEnabled(true);
    }//GEN-LAST:event_jBCancelarTrasladoActionPerformed

    private void jBEliminarTrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarTrasActionPerformed
        if(0==JOptionPane.showConfirmDialog(null,"¿Está seguro de que quiere eliminar este traslado?", "Confirmación",JOptionPane.YES_NO_OPTION)){
            
            Traslado tras=new Traslado(this.jCBCedulaTrasladoE.getSelectedItem().toString());
            tras.Eliminar();
            
            jLida2.setText("");
            jLregreso2.setText("");
            jLciudad2.setText("");
            jLabeFecha2.setVisible(false);
            jLRegreso2.setVisible(false);
            jLTraslado2.setVisible(false);
            
            jBBuscarTrasladoE.setEnabled(true);
            jBEliminarTras.setEnabled(false);
            jBCancelarTras.setEnabled(false);
            jCBCedulaTrasladoE.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(null, "El traslado NO ha sido eliminado");
            
            return;
        }
    }//GEN-LAST:event_jBEliminarTrasActionPerformed

    private void jBCancelarTrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarTrasActionPerformed
        jBEliminarTras.setEnabled(false);
        jBCancelarTras.setEnabled(false);
        jBBuscarTrasladoE.setEnabled(true);
         jLida2.setText("");
        jLregreso2.setText("");
        jLciudad2.setText("");
        jLabeFecha2.setVisible(true);
        jLRegreso2.setVisible(true);
        jLTraslado2.setVisible(true);
        jLEmpleadoTrasladoE.setText("");
        jCBCedulaTrasladoE.setEnabled(true);
    }//GEN-LAST:event_jBCancelarTrasActionPerformed

    private void jBEliminarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarDiaActionPerformed
        Empleado emp=new Empleado(this.jCBCedulaDiasLibresE.getSelectedItem().toString());
        String dia=this.jListaDiasE.getSelectedValue();
        //System.out.print(dia);
        
        if(dia==null){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un día primero", "ERROR!", 0);
           
            return;
        }
        
        if(0==JOptionPane.showConfirmDialog(null,"¿Está seguro de que quiere eliminar este día libre?", "Confirmación",JOptionPane.YES_NO_OPTION)){
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date diaviejo=formato.parse(dia);
            
            DiaLibre day=new DiaLibre(emp.getCedula(),new java.sql.Date(diaviejo.getTime()));
            day.Eliminar();
            rellenarLista(this.jListaDiasE, emp);
            
        
        this.jBEliminarDia.setEnabled(false);
        this.jBCAncelarDiaE.setEnabled(false);
        jLEmpleadoDiasLibres.setText("");
        jBDiasE.setEnabled(true);    
         jCBCedulaDiasLibresE.setEnabled(true); 
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un día primero", "ERROR!", 0);
            
        }
        }else{
            JOptionPane.showMessageDialog(null, "El día NO ha sido eliminado");
        }
        
    }//GEN-LAST:event_jBEliminarDiaActionPerformed

    private void jBCAncelarDiaEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCAncelarDiaEActionPerformed
        this.jBEliminarDia.setEnabled(false);
        this.jBCAncelarDiaE.setEnabled(false);
        jLEmpleadoDiaE.setText("");
        jBDiasE.setEnabled(true); 
        DefaultListModel modelo = new DefaultListModel();
        modelo.removeAllElements();
        jListaDiasE.setModel(modelo);
         jCBCedulaDiasLibresE.setEnabled(true); 
    }//GEN-LAST:event_jBCAncelarDiaEActionPerformed

    private void jBEliminarVacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarVacaActionPerformed
         
         if(0==JOptionPane.showConfirmDialog(null,"¿Está seguro de que quiere eliminar este periodo de vacaciones?", "Confirmación",JOptionPane.YES_NO_OPTION)){
        Empleado emp=new Empleado(this.jCBCedulaVacacionesE.getSelectedItem().toString());
          
          int r=this.jTVacacionesE.getSelectedRow();
          if(r==-1){
              JOptionPane.showMessageDialog(null, "Seleccione un periodo de vacaciones", "ERROR!", 0);
              return;
          }
          
          DefaultTableModel modelodatos = (DefaultTableModel) this.jTVacacionesE.getModel();
         
         String diainicioviejoS=modelodatos.getValueAt(r, 1).toString();
          
         String diafinviejoS=modelodatos.getValueAt(r, 2).toString();
          
          
          SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
          
        
          try {
              
            Date diainicioviejo=formato.parse(diainicioviejoS);
            Date diaifinviejo=formato.parse(diafinviejoS);
            
            //System.out.print(diainicioviejo+" "+diaifinviejo);
            
            
            
            
            Vacacion vac=new Vacacion(emp.getCedula(), new java.sql.Date(diainicioviejo.getTime()), new java.sql.Date(diaifinviejo.getTime()));
            
            vac.Eliminar();
            rellenarTabla(jTVacacionesE, emp);
            
            
        } catch (Exception ex) {
              ex.toString();
        }
         }else{
             JOptionPane.showMessageDialog(null, "El periodo de vacaciones NO ha sido eliminado");
         }
    }//GEN-LAST:event_jBEliminarVacaActionPerformed

    private void jBCancelarVacacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarVacacionesActionPerformed
       this.jDateInicio.setDate(null);
       this.jDateChooserFin.setDate(null);
       jBuscarVacA.setEnabled(true);
       jCBDiasVacacionesA.setEnabled(true);
       this.jBActualizarVacaciones.setEnabled(false);
       this.jBCancelarVacaciones.setEnabled(false);
       jLEmpleadoVacacionesA.setText("");
    }//GEN-LAST:event_jBCancelarVacacionesActionPerformed

    private void jBCancelarEliminarVacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCancelarEliminarVacaActionPerformed
        jLEmpleadoVacE.setText("");
       jBBuscarVacacionE.setEnabled(true);
       jCBCedulaVacacionesE.setEnabled(true);
       this.jBEliminarVaca.setEnabled(false);
       this.jBCancelarEliminarVaca.setEnabled(false);
       
    }//GEN-LAST:event_jBCancelarEliminarVacaActionPerformed

    private void jtfcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfcedulaKeyTyped
         if(jtfcedula.getText().length() >= 10)
            {
                evt.consume();
            }
    }//GEN-LAST:event_jtfcedulaKeyTyped

    private void jTFNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFNombresKeyTyped
        if(jTFNombres.getText().length() >= 60)
            {
                evt.consume();
            }
    }//GEN-LAST:event_jTFNombresKeyTyped

    private void jTFApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFApellidosKeyTyped
         if(jTFApellidos.getText().length() >= 60)
            {
                evt.consume();
            }
    }//GEN-LAST:event_jTFApellidosKeyTyped

    private void jTFEspecialidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFEspecialidadKeyTyped
        if(jTFEspecialidad.getText().length() >= 60)
            {
                evt.consume();
            }
    }//GEN-LAST:event_jTFEspecialidadKeyTyped

    private void jTFSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFSalarioKeyTyped
       if(jTFSalario.getText().length() >= 10)
            {
                evt.consume();
            }
    }//GEN-LAST:event_jTFSalarioKeyTyped

    private void jTFSalarioActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTFSalarioActualizarKeyTyped
        if(jTFSalarioActualizar.getText().length() >= 10)
            {
                evt.consume();
            }
    }//GEN-LAST:event_jTFSalarioActualizarKeyTyped

    
    public static void rellenarCedulas(JComboBox combox){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        combox.removeAllItems();
        
        try{
           ps=conn.getCon().prepareStatement("SELECT cedula FROM empleado;");
                
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                 combox.addItem(rs.getString("cedula"));
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
    
    
    public static void rellenarLista(JList list,Empleado emp){
        Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        int c=0;
       
        DefaultListModel modelo = new DefaultListModel();
        modelo.removeAllElements();
        try{
           ps=conn.getCon().prepareStatement("SELECT dia_Libre FROM dia_libre WHERE Empleado_cedula='"+emp.getCedula()+"';");
                
            
            rs=ps.executeQuery();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            while(rs.next()){
                Date fecha=new java.util.Date(rs.getDate(1).getTime());
               
                modelo.addElement(formato.format(fecha).toString());
                c++;
            }
            
          list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION );
          list.setModel(modelo);
           /*
           if(c==0){
               JOptionPane.showMessageDialog(null, "El empleado no tiene días libres"); 
           }*/
            
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
    
    public static void rellenarTabla(JTable tabla,Empleado emp){
         Conexion conn=new Conexion();
        PreparedStatement ps;
        ResultSet rs;
        int c=0;
       
        DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.addColumn("Nº");
        modelo.addColumn("Inicio");
        modelo.addColumn("Fin");
        
       
        
        try{
           ps=conn.getCon().prepareStatement("SELECT  fechaInicio,fechaFin FROM vacaciones WHERE Empleado_cedula1='"+emp.getCedula()+"';");
                
            
            rs=ps.executeQuery();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            
            while(rs.next()){
                Date fecha1=new java.util.Date(rs.getDate(1).getTime());
                Date fecha2=new java.util.Date(rs.getDate(2).getTime());
                c++;
                modelo.addRow(new Object[]{c, formato.format(fecha1).toString(),formato.format(fecha2).toString()});
                
            }
            
           
           tabla.setModel(modelo);
         
            
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
    
    public void actualizarComboBox(){
        rellenarCedulas(jCBCedulaSalario);
        rellenarCedulas(jCBCedulaDiasLibresR);
        rellenarCedulas(jCBCedulaVacacionesR);
        rellenarCedulas(jCBCedulaTrasladoR); 
        rellenarCedulas(jCBCedulaEmpleadoC);
        rellenarCedulas(jCBCedulaServiciosC);
        rellenarCedulas(jCBCedulaDiasLibresC);
        rellenarCedulas(jCBCedulaVacacionesC); 
        rellenarCedulas(jCBCedulaTrasladoC); 
        rellenarCedulas(jCBDiasLibreasA);
        rellenarCedulas(jCBDiasVacacionesA);
        rellenarCedulas(jCBJornadaA);    
        rellenarCedulas(jCBCedulaTrasladoA);    
        rellenarCedulas(jCBCedulaEmpleadoE);
        rellenarCedulas(jCBCedulaDiasLibresE);
        rellenarCedulas(jCBCedulaVacacionesE);   
        rellenarCedulas(jCBCedulaTrasladoE);  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizaTraslado;
    private javax.swing.JButton jBActualizarDia;
    private javax.swing.JButton jBActualizarJornada;
    private javax.swing.JButton jBActualizarSalario;
    private javax.swing.JButton jBActualizarVacaciones;
    private javax.swing.JButton jBBuscarDia;
    private javax.swing.JButton jBBuscarJornada;
    private javax.swing.JButton jBBuscarTraslado;
    private javax.swing.JButton jBBuscarTrasladoE;
    private javax.swing.JButton jBBuscarVacacionE;
    private javax.swing.JButton jBCAncelarDiaE;
    private javax.swing.JButton jBCancelarDia;
    private javax.swing.JButton jBCancelarEliminarVaca;
    private javax.swing.JButton jBCancelarEmp;
    private javax.swing.JButton jBCancelarJornada;
    private javax.swing.JButton jBCancelarSalario;
    private javax.swing.JButton jBCancelarTras;
    private javax.swing.JButton jBCancelarTraslado;
    private javax.swing.JButton jBCancelarVacaciones;
    private javax.swing.JButton jBDeshabilitar;
    private javax.swing.JButton jBDiasE;
    private javax.swing.JButton jBEliminarDia;
    private javax.swing.JButton jBEliminarEmpleado;
    private javax.swing.JButton jBEliminarTras;
    private javax.swing.JButton jBEliminarVaca;
    private javax.swing.JButton jBRegistrarDiaLibre;
    private javax.swing.JButton jBRegistrarVacacion;
    private javax.swing.JButton jBuscarVacA;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButtonBuscarSalario;
    private javax.swing.JComboBox<String> jCBCedulaDiasLibresC;
    private javax.swing.JComboBox<String> jCBCedulaDiasLibresE;
    private javax.swing.JComboBox<String> jCBCedulaDiasLibresR;
    private javax.swing.JComboBox<String> jCBCedulaEmpleadoC;
    private javax.swing.JComboBox<String> jCBCedulaEmpleadoE;
    private javax.swing.JComboBox<String> jCBCedulaSalario;
    private javax.swing.JComboBox<String> jCBCedulaServiciosC;
    private javax.swing.JComboBox<String> jCBCedulaTrasladoA;
    private javax.swing.JComboBox<String> jCBCedulaTrasladoC;
    private javax.swing.JComboBox<String> jCBCedulaTrasladoE;
    private javax.swing.JComboBox<String> jCBCedulaTrasladoR;
    private javax.swing.JComboBox<String> jCBCedulaVacacionesC;
    private javax.swing.JComboBox<String> jCBCedulaVacacionesE;
    private javax.swing.JComboBox<String> jCBCedulaVacacionesR;
    private javax.swing.JComboBox<String> jCBDiasLibreasA;
    private javax.swing.JComboBox<String> jCBDiasVacacionesA;
    private javax.swing.JComboBox<String> jCBJornada;
    private javax.swing.JComboBox<String> jCBJornadaA;
    private javax.swing.JComboBox<String> jCBciudadesA;
    private javax.swing.JComboBox<String> jCBciudadesR;
    private javax.swing.JComboBox<String> jCBciudadesR1;
    private javax.swing.JComboBox<String> jCNuevaJornada;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private com.toedter.calendar.JDateChooser jDCDiaLibre;
    private com.toedter.calendar.JDateChooser jDCFinVacacion;
    private com.toedter.calendar.JDateChooser jDCdialibreA;
    private com.toedter.calendar.JDateChooser jDCida;
    private com.toedter.calendar.JDateChooser jDCinicioVacacion;
    private com.toedter.calendar.JDateChooser jDCregreso;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooserFin;
    private com.toedter.calendar.JDateChooser jDateIda;
    private com.toedter.calendar.JDateChooser jDateInicio;
    private com.toedter.calendar.JDateChooser jDateRegreso;
    private javax.swing.JLabel jLApellidosC;
    private javax.swing.JLabel jLApellidosC2;
    private javax.swing.JLabel jLCantidadC;
    private javax.swing.JLabel jLCedulaC;
    private javax.swing.JLabel jLCedulaC2;
    private javax.swing.JLabel jLCiudadC;
    private javax.swing.JLabel jLCiudadC2;
    private javax.swing.JList<String> jLDiasLibresActualizar;
    private javax.swing.JLabel jLEmpleado;
    private javax.swing.JLabel jLEmpleadoC;
    private javax.swing.JLabel jLEmpleadoDiaE;
    private javax.swing.JLabel jLEmpleadoDiasLibres;
    private javax.swing.JLabel jLEmpleadoDiasLibresC;
    private javax.swing.JLabel jLEmpleadoJornada;
    private javax.swing.JLabel jLEmpleadoTrasladoC;
    private javax.swing.JLabel jLEmpleadoTrasladoC6;
    private javax.swing.JLabel jLEmpleadoTrasladoE;
    private javax.swing.JLabel jLEmpleadoVacE;
    private javax.swing.JLabel jLEmpleadoVacacionesA;
    private javax.swing.JLabel jLEmpleadoVacacionesC;
    private javax.swing.JLabel jLEspecialidadC;
    private javax.swing.JLabel jLEspecialidadC1;
    private javax.swing.JLabel jLEstadoC;
    private javax.swing.JLabel jLEstadoC1;
    private javax.swing.JLabel jLJornada;
    private javax.swing.JLabel jLJornadaC;
    private javax.swing.JLabel jLJornadaC2;
    private javax.swing.JLabel jLNombresC;
    private javax.swing.JLabel jLNombresC2;
    private javax.swing.JLabel jLRegreso;
    private javax.swing.JLabel jLRegreso1;
    private javax.swing.JLabel jLRegreso2;
    private javax.swing.JLabel jLSalario;
    private javax.swing.JLabel jLSalarioC;
    private javax.swing.JLabel jLSalarioC3;
    private javax.swing.JLabel jLTraslado;
    private javax.swing.JLabel jLTraslado1;
    private javax.swing.JLabel jLTraslado2;
    private javax.swing.JLabel jLabeFecha;
    private javax.swing.JLabel jLabeFecha1;
    private javax.swing.JLabel jLabeFecha2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLciudad;
    private javax.swing.JLabel jLciudad1;
    private javax.swing.JLabel jLciudad2;
    private javax.swing.JLabel jLida;
    private javax.swing.JLabel jLida1;
    private javax.swing.JLabel jLida2;
    private javax.swing.JList<String> jListDiasLibres;
    private javax.swing.JList<String> jListaDiasE;
    private javax.swing.JLabel jLregreso;
    private javax.swing.JLabel jLregreso1;
    private javax.swing.JLabel jLregreso2;
    private javax.swing.JPanel jPEmpleadoC;
    private javax.swing.JPanel jPEmpleadoC1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelEmpleado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFEspecialidad;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFSalario;
    private javax.swing.JTextField jTFSalarioActualizar;
    private javax.swing.JTable jTVacaciones;
    private javax.swing.JTable jTVacacionesA;
    private javax.swing.JTable jTVacacionesE;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jtfcedula;
    // End of variables declaration//GEN-END:variables
}
