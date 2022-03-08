package Interfaz;

import Codigo.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import Codigo.Validar;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Codigo.Validar;
import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public class JFFacturacion extends javax.swing.JFrame {

    Conexion conec = new Conexion();
    Connection conet;
    PreparedStatement ps;
    Statement st;
    ResultSet rs;
    String textoFact = "";
    String textoServ = "";
    String textoTotal = "";
    String textoServExp = "";
    int nFact=0;
    int nServ=0;
    float total=0;
    int v=0;
    int count=0;
    Date tmpFech=null;
    String[] Serv = new String[10];
    String[] codServ = new String[10];
    String[] datFact = new String[10];
    float[] precServ = new float[10];
    DateFormat f1=new SimpleDateFormat("dd/MM/yyyy");
    
    
    public JFFacturacion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.numFact();
        this.listaCitas();
        this.rellenarNfact();
        
        
        AutoCompleteDecorator.decorate(cbxNumCita);
        AutoCompleteDecorator.decorate(cbxNfact2);
        AutoCompleteDecorator.decorate(cbxNfact3);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel10 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaFact1 = new javax.swing.JTextArea();
        jPanel12 = new javax.swing.JPanel();
        crearFacturaButton1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtCed = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        fecha1 = new com.toedter.calendar.JDateChooser();
        jLabel24 = new javax.swing.JLabel();
        cbxPago = new javax.swing.JComboBox<>();
        buscarClienteButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNom = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxDesc = new javax.swing.JComboBox<>();
        cbxNumCita = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbSubt = new javax.swing.JLabel();
        lbIva = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        lbServ = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lbPrec = new javax.swing.JLabel();
        añadirServicioButton1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        areaFact2 = new javax.swing.JTextArea();
        jButton8 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        cbxNfact2 = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        cbxNfact3 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        areaFact3 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel10.setBackground(new java.awt.Color(153, 204, 255));

        jPanel11.setBackground(new java.awt.Color(153, 204, 255));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
        });

        areaFact1.setColumns(20);
        areaFact1.setRows(5);
        jScrollPane5.setViewportView(areaFact1);

        jPanel12.setBackground(java.awt.SystemColor.textHighlightText);
        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel12.setForeground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jPanel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel12MouseMoved(evt);
            }
        });
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
        });

        crearFacturaButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/factura.png"))); // NOI18N
        crearFacturaButton1.setText("Generar Factura");
        crearFacturaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearFacturaButton1ActionPerformed(evt);
            }
        });

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel18.setText("Cédula Cliente :");

        txtCed.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedActionPerformed(evt);
            }
        });

        jLabel22.setText("Fecha : ");

        fecha1.setToolTipText("");
        fecha1.setDateFormatString("dd/MM/yyyy");
        fecha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecha1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fecha1MouseExited(evt);
            }
        });

        jLabel24.setText("Pago :");

        cbxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago en Efectivo", "Tarjeta de Débito", "Tarjeta de Crédito" }));

        buscarClienteButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        buscarClienteButton1.setText("Buscar Cita");
        buscarClienteButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarClienteButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Número de Cita :");

        jLabel2.setText("Nombres :");

        jLabel3.setText("Apellidos :");

        jLabel4.setText("Teléfono:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Descuento:");

        cbxDesc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Cumpleaños" }));

        cbxNumCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbxNumCita.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cbxNumCitaMouseMoved(evt);
            }
        });
        cbxNumCita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxNumCitaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxNumCitaMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxNumCitaMouseReleased(evt);
            }
        });
        cbxNumCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNumCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxNumCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                        .addComponent(cbxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel13Layout.createSequentialGroup()
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel22)
                                            .addComponent(jLabel24))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cbxPago, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buscarClienteButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addComponent(txtDir))))
                .addGap(18, 18, 18))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarClienteButton1)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbxNumCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbxPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel24)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cbxDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(fecha1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel26.setText("Sub Total:  $");

        jLabel27.setText("IVA 12% :  $");

        jLabel28.setText("Total :  $");

        lbSubt.setText("___");

        lbIva.setText("___");

        lbTotal.setText("____");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbIva, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(lbSubt)
                    .addComponent(lbIva)
                    .addComponent(lbTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Servicios"));

        jLabel29.setText("Código");

        txtCod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtCodMouseExited(evt);
            }
        });

        jLabel30.setText("Nombre Servicio");

        lbServ.setText("___________________");

        jLabel32.setText("Descuento");

        txtDesc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDesc.setText("0");
        txtDesc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtDescMouseExited(evt);
            }
        });

        jLabel33.setText("%");

        jLabel34.setText("Precio");

        lbPrec.setText("______");

        añadirServicioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/anadir.png"))); // NOI18N
        añadirServicioButton1.setText("Añadir Servicio");
        añadirServicioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirServicioButton1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/basura.png"))); // NOI18N
        jButton1.setText("Eliminar Servicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("$");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel30)
                            .addComponent(lbServ, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(añadirServicioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel32)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbPrec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel32)
                        .addComponent(jLabel34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(jLabel30)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbServ)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(lbPrec)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(añadirServicioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119))
        );

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(crearFacturaButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(crearFacturaButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/AirBrush_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel36)
                        .addGap(85, 85, 85))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );

        jTabbedPane2.addTab("   Crear  Factura   ", new javax.swing.ImageIcon(getClass().getResource("/Iconos/factura.png")), jPanel11); // NOI18N

        jPanel16.setBackground(new java.awt.Color(153, 204, 255));

        areaFact2.setColumns(20);
        areaFact2.setRows(5);
        jScrollPane7.setViewportView(areaFact2);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton8.setText("Consultar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel17.setBackground(java.awt.SystemColor.controlLtHighlight);
        jPanel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel37.setText("Número de Factura : ");

        cbxNfact2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbxNfact2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(cbxNfact2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel39.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.highlight"));
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/AirBrush_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel38))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jLabel39))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jButton8)
                .addGap(87, 87, 87)
                .addComponent(jLabel38)
                .addGap(110, 110, 110)
                .addComponent(jLabel39)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        jTabbedPane2.addTab("   Consultar Factura    ", new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png")), jPanel16); // NOI18N

        jPanel18.setBackground(new java.awt.Color(153, 204, 255));

        jPanel19.setBackground(java.awt.Color.white);
        jPanel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel41.setText("Número de Factura : ");

        cbxNfact3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbxNfact3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNfact3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel41)
                .addGap(44, 44, 44)
                .addComponent(cbxNfact3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(cbxNfact3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/exportar.png"))); // NOI18N
        jButton10.setText("Exportar");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        areaFact3.setColumns(20);
        areaFact3.setRows(5);
        jScrollPane8.setViewportView(areaFact3);

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/lupa.png"))); // NOI18N
        jButton11.setText("Buscar");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/AirBrush_.png"))); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel42)))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton11)
                    .addComponent(jButton10))
                .addGap(206, 206, 206)
                .addComponent(jLabel42)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8)
                .addContainerGap())
        );

        jTabbedPane2.addTab("   Exportar Factura   ", new javax.swing.ImageIcon(getClass().getResource("/Iconos/exportar.png")), jPanel18); // NOI18N

        jLabel44.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel44.setText("Facturación");

        jButton13.setBackground(new java.awt.Color(153, 204, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/atras.png"))); // NOI18N
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(381, 381, 381)
                .addComponent(jLabel44)
                .addContainerGap(410, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addContainerGap(589, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                    .addGap(0, 58, Short.MAX_VALUE)
                    .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearFacturaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearFacturaButton1ActionPerformed
        Validar val3 =new Validar();
        String ced = txtCed.getText().toString();
        String nom = txtNom.getText().toString();
        String ape = txtApe.getText().toString();
        String tel = txtTel.getText().toString();
        String dir = txtDir.getText().toString();
        String pago = cbxPago.getSelectedItem().toString();
        String desc = cbxDesc.getSelectedItem().toString();
        java.util.Date fech = fecha1.getDate();

        try{
            if(ced.equals("") || !val3.verificarCedula(ced)){
                JOptionPane.showMessageDialog(null, "Cédula no válida - repita", "ERROR!", 0);
                txtCed.setText("");
            }else {
                if(nom.equals("") || nom.length()>60 || !val3.validarNombres(nom)){
                    JOptionPane.showMessageDialog(null, "Nombres no válidos - repita", "ERROR!", 0);
                    txtNom.setText("");
                }else{
                    if(ape.equals("") || ape.length()>60 || !val3.validarNombres(ape)){
                        JOptionPane.showMessageDialog(null, "Apellidos no válidos - repita", "ERROR!", 0);
                        txtApe.setText("");
                    }else{
                        if(tel.equals("") || tel.length()<7 || tel.length()>10 || !val3.validarTelefono(tel)){
                            JOptionPane.showMessageDialog(null, "Teléfono no válido - repita", "ERROR!", 0);
                            txtTel.setText("");
                        }else{
                            if(dir.equals("") || dir.length()>100){
                                JOptionPane.showMessageDialog(null, "Dirección no válida - repita", "ERROR!", 0);
                                txtDir.setText("");
                            }else{
                                if(fech == null){
                                    JOptionPane.showMessageDialog(null, "Fecha no válida - repita", "ERROR!", 0);
                                    fecha1.setDate(null);
                                }else{
                                    if(nServ==0){
                                            JOptionPane.showMessageDialog(null, "Inserte los servicios adquiridos - repita", "ERROR!", 0);
                                        }else{
                                            int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que quiere generar una nueva factura?", "Facturar",JOptionPane.YES_NO_OPTION);
                                            if(resp == 0){

                                            String sql = "insert into factura values("+nFact+",'"+ced+"','"+nom+"','"+ape+"','"+dir+"','"+
                                                    tel+"',"+total+",'"+pago+"','"+desc+"','"+new java.sql.Date(fech.getTime())+"');";
                                            conet = conec.getConnection();
                                            st = conet.createStatement();
                                            st.executeUpdate(sql);
                                       
                                            for (int i = 0; i < nServ; i++) {
                                                conet = conec.getConnection();
                                                st = conet.createStatement();
                                                st.executeUpdate("insert into servicio_has_factura values('"+codServ[i]+"',"+nFact+","+precServ[i]+");");
                                            }
                                            JOptionPane.showMessageDialog(null, "Factura generada exitosamente");
                                            vaciar();
                                            nServ=0;
                                            cbxNfact2.addItem(""+nFact);
                                            cbxNfact3.addItem(""+nFact);
                                            textoFact="";
                                            textoTotal="";
                                            textoServ="";
                                            lbSubt.setText("");
                                            lbIva.setText("");
                                            lbTotal.setText("");
                                            nFact++;
                                        }
                                        }
                                }
                            }
                        }
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Error al ingresar datos en la base de datos");
        }
        
    }//GEN-LAST:event_crearFacturaButton1ActionPerformed

    private void txtCedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedActionPerformed

    private void buscarClienteButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarClienteButton1ActionPerformed
        String numCita = cbxNumCita.getSelectedItem().toString();
        textoFact="";
        textoTotal="";
        textoServ="";
        total=0;
        nServ=0;
        if(numCita=="" || numCita==" "){
            JOptionPane.showMessageDialog(null, "Número de cita no válido - repita", "ERROR!", 0);
        }else{
            
            consultarCita(Integer.parseInt(numCita));
        }
        
        
    }//GEN-LAST:event_buscarClienteButton1ActionPerformed

    private void añadirServicioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirServicioButton1ActionPerformed
        String cod = txtCod.getText();
        float desc = Float.parseFloat(txtDesc.getText());
        if(cod.equals("")|| cod.length()>5 || cod.length()<5){
            JOptionPane.showMessageDialog(null, "Código de servicio no válido - repita", "ERROR!", 0);
            txtCod.setText("");
            txtDesc.setText("0");
        }else if(desc<0 || desc>100){
            JOptionPane.showMessageDialog(null, "Valor de descuento no válido - repita", "ERROR!", 0);
            txtCod.setText("");
            txtDesc.setText("0");
        }else{
                consultarServicio(cod,desc);
            actualizarTexto();
            txtCod.setText("");
            txtDesc.setText("0");
                }
        
    }//GEN-LAST:event_añadirServicioButton1ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        JFMenu fjmenu = new JFMenu();
        fjmenu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void fecha1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha1MouseExited

    }//GEN-LAST:event_fecha1MouseExited

    private void cbxNumCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNumCitaActionPerformed

    }//GEN-LAST:event_cbxNumCitaActionPerformed

    private void cbxNumCitaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxNumCitaMouseEntered
        
    }//GEN-LAST:event_cbxNumCitaMouseEntered

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered


    }//GEN-LAST:event_jPanel11MouseEntered

    private void cbxNumCitaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxNumCitaMouseClicked
        
    }//GEN-LAST:event_cbxNumCitaMouseClicked

    private void cbxNumCitaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxNumCitaMouseMoved
        
    }//GEN-LAST:event_cbxNumCitaMouseMoved

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        
    }//GEN-LAST:event_jPanel12MouseEntered

    private void cbxNumCitaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxNumCitaMouseReleased

    }//GEN-LAST:event_cbxNumCitaMouseReleased

    private void jPanel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseMoved

    }//GEN-LAST:event_jPanel12MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String cod1 = txtCod.getText().toString();
        eliminarServicio(cod1);
        txtCod.setText("");
        txtDesc.setText("0");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fecha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecha1MouseClicked
 
    }//GEN-LAST:event_fecha1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea cancelar la generación de la factura?", "Facturar",JOptionPane.YES_NO_OPTION);
        if(resp == 0){
            vaciar();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String buscar1 = cbxNfact2.getSelectedItem().toString();
        if(buscar1==""){
            JOptionPane.showMessageDialog(null, "Número de factura no válido - repita", "ERROR!", 0);
        }else{
            buscarFactura(Integer.parseInt(buscar1),1);
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String buscar2 = cbxNfact3.getSelectedItem().toString();
        if(buscar2==""){
            JOptionPane.showMessageDialog(null, "Número de factura no válido - repita", "ERROR!", 0);
        }else{
            buscarFactura(Integer.parseInt(buscar2),2);
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void cbxNfact3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNfact3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNfact3ActionPerformed

    private void txtCodMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCodMouseExited
       servTemporal(txtCod.getText().toString(),Integer.parseInt(txtDesc.getText().toString()));
    }//GEN-LAST:event_txtCodMouseExited

    private void txtDescMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDescMouseExited
        servTemporal(txtCod.getText().toString(),Integer.parseInt(txtDesc.getText().toString()));
    }//GEN-LAST:event_txtDescMouseExited

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea exportar la factura?", "Facturar",JOptionPane.YES_NO_OPTION);
        if(resp==0){
            try{
                
                Document documento = new Document();
                String name ="Factura_"+cbxNfact3.getSelectedItem()+".pdf";
                PdfWriter.getInstance(documento, new FileOutputStream(name));
                documento.open();
                Paragraph p1 = new Paragraph("\n     Air-Brush\nLatacunga - Ecuador\n");
                p1.setAlignment(1);
                documento.add(p1);
                
                Paragraph p2 = new Paragraph("\n\n   Factura Nº. "+cbxNfact3.getSelectedItem()+
                "\n\n  DATOS DEL CLIENTE:"+        
                "\n\n     NOMBRES :      "+datFact[1].toUpperCase()+
                "\n     APELLIDOS :    "+datFact[2].toUpperCase()+
                "\n     CÉDULA :         "+datFact[0]+
                "\n     TELÉFONO :     "+datFact[4]+
                "\n     DIRECCIÓN :    "+datFact[3].toUpperCase()+
                "\n     FECHA DE EMISIÓN : "+f1.format(tmpFech)+
                "\n\n     PAGO :               "+datFact[6].toUpperCase()+
                "\n     DESCUENTO :   "+datFact[7].toUpperCase()+
                "\n\n\n\n     SERVICIOS"+
                "\n\n     CÓDIGO      SERVICIO                                                                                       VALOR\n\n");
                
                documento.add(p2);
                Paragraph p22 = new Paragraph("------------------------------------------------------------------------------------------------------------------------------");
                documento.add(p22);
                
                Paragraph p3 = new Paragraph(textoServExp);
                documento.add(p3);
                //String space = "                                                 ";
                Paragraph p4 = new Paragraph("\nSubTotal :   $ "+Math.round((Float.parseFloat(datFact[5])*0.88) * 100d) / 100d+
                "\nIVA :           $ "+Math.round((Float.parseFloat(datFact[5])*0.12) * 100d) / 100d+
                "\nTotal :          $ "+Math.round(Float.parseFloat(datFact[5]) * 100d) / 100d);
                p4.setAlignment(Paragraph.ALIGN_RIGHT);
                documento.add(p4);
                
                //Image imagen = Image.getInstance(("AirBrush_.png"));
                //imagen.setAlignment(Image.ALIGN_CENTER);
                
                //documento.add(imagen);
               // Paragraph p5 = new Paragraph();
                //documento.add;
                
                documento.close();
                JOptionPane.showMessageDialog(null, "Factura exportada exitosamente");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "No se pudo exportar la factura", "ERROR!", 0);
            }
        }else{
            
        }
       
    }//GEN-LAST:event_jButton10ActionPerformed

//    public void paint(Graphics g){
//        ImageIcon imagen = new ImageIcon(getClass().getResource("Fondos/fondoFacturacion_png"));
//        g.drawImage(imagen.getImage(),0,0,getWidth(),getHeight(),this);
//        setOpaque(false)
//        super.paint(g);
//    }
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
            java.util.logging.Logger.getLogger(JFFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFFacturacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFFacturacion().setVisible(true);
            }
        });
    }

    void consultarCita(int numCita){
        try{ 

            ps=conec.getCon().prepareStatement("Select * from cita where numero = '"+numCita+"';");
            rs=ps.executeQuery();
            
            String cedClient="";
            String codSer="";
            while(rs.next()){
                 cedClient = rs.getString("Cliente_cedula");
                 codSer = rs.getString("Servicio_codigo");
                 fecha1.setDate(rs.getDate("Fecha"));
            }

            consultarServicio(codSer, (float) 0.0);
            if(cedClient!=""){
                ps=conec.getCon().prepareStatement("Select * from cliente where cedula = '"+cedClient+"';");
                rs=ps.executeQuery();
                
                String[] datos = new String[6];
                while (rs.next()){
                    datos[0] = rs.getString("cedula");
                    datos[1] = rs.getString("nombres");
                    datos[2] = rs.getString("apellidos");
                    datos[3] = rs.getString("telefono");
                    datos[4] = rs.getString("direccion");
                    
                }
                txtCed.setText(datos[0]);
                txtNom.setText(datos[1]);
                txtApe.setText(datos[2]);
                txtTel.setText(datos[3]);
                txtDir.setText(datos[4]);
                
                actualizarTexto();
                
            }
        }catch(Exception e){
            System.out.println("Error al establecer la coneccion con la base de datos");
        }
    }
    void buscarFactura(int nFactura, int tmp){
        textoFact="";
        textoTotal="";
        textoServ="";
        try{
            ps=conec.getCon().prepareStatement("Select * from factura where numero = "+nFactura+";");
            rs=ps.executeQuery();

            while(rs.next()){
                 datFact[0] = rs.getString("cedulaCliente");
                 datFact[1] = rs.getString("nombres");
                 datFact[2] = rs.getString("apellidos");
                 datFact[3] = rs.getString("direccion");
                 datFact[4] = rs.getString("telefono");
                 datFact[5] = rs.getString("total");
                 datFact[6] = rs.getString("pago");
                 datFact[7] = rs.getString("descuento");
                 tmpFech = rs.getDate("fechaFactura"); 
            }
            
            textoFact = "\t\t       Air-Brush\n\t\tLatacunga - Ecuador"+
                "\n   Factura Nº. "+nFactura+
                "\n\n   NOMBRES :\t"+datFact[1].toUpperCase()+
                "\n   APELLIDOS :\t"+datFact[2].toUpperCase()+
                "\n   CÉDULA :\t"+datFact[0]+
                "\n   TELÉFONO :\t"+datFact[4]+
                "\n   DIRECCIÓN :\t"+datFact[3].toUpperCase()+
                "\n   FECHA DE EMISIÓN : "+f1.format(tmpFech)+
                "\n\n   PAGO :\t"+datFact[6].toUpperCase()+
                "\n   DESCUENTO:"+datFact[7].toUpperCase()+
                "\n\n   SERVICIOS"+
                "\n\n   CÓDIGO     SERVICIO\t\t\tVALOR\n\n";
            
            textoServ = "------------------------------------------------------------------------------------------------------------------------------\n";
            textoTotal = "\n\t\t\tSubTotal :\t"+Math.round((Float.parseFloat(datFact[5])*0.88) * 100d) / 100d+
                "\n\t\t\tIVA :\t"+Math.round((Float.parseFloat(datFact[5])*0.12) * 100d) / 100d+
                "\n\t\t\tTotal :\t"+Math.round(Float.parseFloat(datFact[5]) * 100d) / 100d;
        
            ps=conec.getCon().prepareStatement("Select Servicio_codigo,nombre,precioServicio from servicio INNER JOIN servicio_has_factura ON servicio.codigo = "
                    + "servicio_has_factura.Servicio_codigo and Factura_numero="+nFactura+";");
            rs=ps.executeQuery();
            
            while(rs.next()){
                textoServ=textoServ+"    "+rs.getString("Servicio_codigo")+"         "+rs.getString("nombre")+"\t\t\t"+rs.getString("precioServicio")+"\n";
                textoServExp = textoServExp+"       "+rs.getString("Servicio_codigo")+"         "+rs.getString("nombre")+"                                                                                       "+rs.getString("precioServicio")+"\n";
            }
            if(tmp==1){
                areaFact2.setText("");
                areaFact2.setText(textoFact+textoServ+textoTotal);
            }else{
                areaFact3.setText("");
                areaFact3.setText(textoFact+textoServ+textoTotal);
            }
            
        }catch(Exception e){
            
        }
    }
    void actualizarTexto(){
        String cedu = txtCed.getText();
        String nomb = txtNom.getText();
        String appe = txtApe.getText();
        String tele = txtTel.getText();
        String dire = txtDir.getText();
        java.util.Date fech = fecha1.getDate();
        String pago = cbxPago.getSelectedItem().toString();
        String desc = cbxDesc.getSelectedItem().toString();
        DateFormat f=new SimpleDateFormat("dd/MM/yyyy");
        
        
        textoFact = "\t\t       Air-Brush\n\t\tLatacunga - Ecuador"+
                "\n   Factura Nº. "+nFact+
                "\n\n   NOMBRES :\t"+nomb.toUpperCase()+
                "\n   APELLIDOS :\t"+appe.toUpperCase()+
                "\n   CÉDULA :\t"+cedu+
                "\n   TELÉFONO :\t"+tele+
                "\n   DIRECCIÓN :\t"+dire.toUpperCase()+
                "\n   FECHA DE EMISIÓN : "+f.format(fech)+
                "\n\n   PAGO :\t"+pago.toUpperCase()+
                "\n   DESCUENTO:"+desc.toUpperCase()+
                "\n\n   SERVICIOS"+
                "\n\n    CÓDIGO     SERVICIO\t\t\tVALOR\n\n";
        textoTotal = "\n\t\t\tSubTotal :\t"+Math.round((total*0.88) * 100d) / 100d+
                "\n\t\t\tIVA :\t"+Math.round((total*0.12) * 100d) / 100d+
                "\n\t\t\tTotal :\t"+Math.round(total * 100d) / 100d;
        areaFact1.setText("");
        areaFact1.setText(textoFact+textoServ+textoTotal);
        lbSubt.setText(""+Math.round((total*0.88) * 100d) / 100d);
        lbIva.setText(""+Math.round((total*0.12) * 100d) / 100d);
        lbTotal.setText(""+Math.round(total* 100d) / 100d);
    }
    void servTemporal(String codigo, float descuento){
        try{
            ps=conec.getCon().prepareStatement("Select * from servicio where codigo = '"+codigo+"';");
            rs=ps.executeQuery();
            
            String serv="";
            float prec = 0;
            while(rs.next()){
                 serv = rs.getString("nombre");
                 prec= rs.getFloat("precio");
            }
            prec = prec*(1-descuento/100);
            lbServ.setText(serv);
            lbPrec.setText(""+prec);
        }catch(Exception e){
            
        }
    }
    void consultarServicio(String codigo, float descuento){
        try{ 

            ps=conec.getCon().prepareStatement("Select * from servicio where codigo = '"+codigo+"';");
            rs=ps.executeQuery();
            
            String serv="";
            float prec = 0;
            while(rs.next()){
                 serv = rs.getString("nombre");
                 prec= rs.getFloat("precio");
            }
            prec = prec*(1-descuento/100);
            
            Serv[nServ]= "    "+codigo+"         "+serv+"\t\t\t"+Math.round(prec * 100d) / 100d+"\n";
            codServ[nServ]= codigo;
            precServ[nServ] = prec;
            nServ++;
            lbServ.setText("");
            lbPrec.setText("0");
            listaServiciosAdquiridos();
    
        }catch(Exception e){
            
        }

    }
    void listaServiciosAdquiridos(){
            
            textoServ="";
            total=0;
            for (int i = 0; i < nServ; i++) {
                textoServ = textoServ+Serv[i];
                total += precServ[i];
            }
    }
    
    void listaCitas(){
        try{ 

            ps=conec.getCon().prepareStatement("Select * from cita");
            rs=ps.executeQuery();

            String cita="";           
            while(rs.next()){
                cita = rs.getString("numero");
                cbxNumCita.addItem(cita); 
            }
  
        }catch(Exception e){
            System.out.println("error actualizar users");
        } 
    }
    
    void eliminarServicio(String cod1){
        boolean w=false;
        if(cod1.equals("")|| cod1.length()<5 || cod1.length()>5){
            JOptionPane.showMessageDialog(null, "Código de servicio no válido - repita", "ERROR!", 0);
        }else{
            for (int e = 0; e < nServ; e++) {
                if(cod1.equals(codServ[e])){
                    for (int t = e; t < nServ; t++) {
                        codServ[t] = codServ[t+1];
                        Serv[t]=Serv[t+1]; 
                        precServ[t]=precServ[t+1]; 
                    }
                    nServ--;
                    count=0;
                    listaServiciosAdquiridos();
                    actualizarTexto();
                    w = true;
                    break;
                }
            }
            if(w==false){
                        JOptionPane.showMessageDialog(null, "Servicio no añadido - repita", "ERROR!", 0);
                    }
        }
    }
    
    void vaciar(){
        txtCed.setText("");
            txtNom.setText("");
            txtApe.setText("");
            txtDir.setText("");
            txtTel.setText("");
            fecha1.setDate(null);
            cbxNumCita.setSelectedIndex(0);
            cbxPago.setSelectedIndex(0);
            cbxDesc.setSelectedIndex(0);
            areaFact1.setText(null);
    }
    
    void numFact(){
        try{
            ps=conec.getCon().prepareStatement("SELECT numero FROM factura ORDER by numero DESC LIMIT 1;"); 
            rs=ps.executeQuery();            
            while(rs.next()){
                nFact = rs.getInt("numero");     
            }
            nFact++; 
        }catch(Exception e){
            
        }
    }
    
    void rellenarNfact(){

        try{
           
            ps=conec.getCon().prepareStatement("SELECT numero FROM factura ORDER by numero ASC ;"); 
            rs=ps.executeQuery();            
            while(rs.next()){
                cbxNfact2.addItem(rs.getString("numero"));
                cbxNfact3.addItem(rs.getString("numero"));
            }
            
        }catch(Exception e){
            
        }
       
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaFact1;
    private javax.swing.JTextArea areaFact2;
    private javax.swing.JTextArea areaFact3;
    private javax.swing.JButton añadirServicioButton1;
    private javax.swing.JButton buscarClienteButton1;
    private javax.swing.JComboBox<String> cbxDesc;
    private javax.swing.JComboBox<String> cbxNfact2;
    private javax.swing.JComboBox<String> cbxNfact3;
    private javax.swing.JComboBox<String> cbxNumCita;
    private javax.swing.JComboBox<String> cbxPago;
    private javax.swing.JButton crearFacturaButton1;
    private com.toedter.calendar.JDateChooser fecha1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lbIva;
    private javax.swing.JLabel lbPrec;
    private javax.swing.JLabel lbServ;
    private javax.swing.JLabel lbSubt;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JTextField txtApe;
    private javax.swing.JTextField txtCed;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtDir;
    private javax.swing.JTextField txtNom;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables

}
