
package CapaPresentacion;

//@author Andrés Ponce

import javax.swing.*;
import CapaComun.*;
import CapaNegocio.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;

public class JFAdministrador extends javax.swing.JFrame {
    
    private JFLogin jfLogin;
    Ng_ClsPais ng_clsPais = new Ng_ClsPais();
    Ng_ClsComida ng_clsComida = new Ng_ClsComida();
    Ng_ClsClase ng_clsClase = new Ng_ClsClase();
    Ng_ClsAsiento ng_clsAsiento = new Ng_ClsAsiento();
    List<Cm_ClsClase> listaClasesCB;
    List<Cm_ClsPais> listaPaises;
    List<Cm_ClsComida> listaComidas;
    List<Cm_ClsClase> listaClases;
    List<Cm_ClsAsiento> listaAsientos;
    private Pattern patNombrePais = Pattern.compile("[a-zA-ZñáéíóúÑÁÉÍÓÚ\\s]{1,70}");
    private Pattern patNombres = Pattern.compile("[a-zA-ZñáéíóúÑÁÉÍÓÚ\\s]{1,25}");
    private Pattern patCapacidad = Pattern.compile("[0-9]+");
    private Pattern patContrasenia = Pattern.compile("^(?=.*[0-9])(?=.*[a-zñáéíóú])(?=.*[A-ZÑÁÉÍÓÚ]).{6,64}$");
    
    public JFAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.ng_clsPais = new Ng_ClsPais();
        this.ng_clsComida = new Ng_ClsComida();
        this.ng_clsClase = new Ng_ClsClase();
        this.ng_clsAsiento = new Ng_ClsAsiento();
        this.llenarTablaPaises();
        this.llenarTablaComidas();
        this.llenarTablaClases();
        this.llenarTablaAsientos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTPEntidades = new javax.swing.JTabbedPane();
        jPPais = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPaises = new javax.swing.JTable();
        jPAgregarPais = new javax.swing.JPanel();
        jLNombrePais = new javax.swing.JLabel();
        jLCodigoPais = new javax.swing.JLabel();
        jTFNombrePais = new javax.swing.JTextField();
        jTFCodigoPais = new javax.swing.JTextField();
        jBAddPais = new javax.swing.JButton();
        jLMaximoPais = new javax.swing.JLabel();
        jPActualizarPais = new javax.swing.JPanel();
        jLCodigoPais1 = new javax.swing.JLabel();
        jTFCodigoPaisActualizar = new javax.swing.JTextField();
        jLNombrePais1 = new javax.swing.JLabel();
        jTFNombrePaisActualizar = new javax.swing.JTextField();
        jBModificarPais = new javax.swing.JButton();
        jLMaximoPais1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLCodigoEliminar = new javax.swing.JLabel();
        jTFCodigoPaisEliminar = new javax.swing.JTextField();
        jBEliminarPais = new javax.swing.JButton();
        jPComida = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTComidas = new javax.swing.JTable();
        jPAgregarComida = new javax.swing.JPanel();
        jBRmComida = new javax.swing.JButton();
        jLComida = new javax.swing.JLabel();
        jTFIdComidaRm = new javax.swing.JTextField();
        jLMaximoComida = new javax.swing.JLabel();
        jPAgregarComida1 = new javax.swing.JPanel();
        jBAddComida1 = new javax.swing.JButton();
        jLComida1 = new javax.swing.JLabel();
        jTFComida = new javax.swing.JTextField();
        jLMaximoComida1 = new javax.swing.JLabel();
        jPAgregarComida2 = new javax.swing.JPanel();
        jBModComida = new javax.swing.JButton();
        jLComida2 = new javax.swing.JLabel();
        jTFComidaMod = new javax.swing.JTextField();
        jLMaximoComida2 = new javax.swing.JLabel();
        jLComida3 = new javax.swing.JLabel();
        jTFIdComidaMod = new javax.swing.JTextField();
        jPClase = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jPAgregarClase = new javax.swing.JPanel();
        jLNombreClase = new javax.swing.JLabel();
        jLCapacidad = new javax.swing.JLabel();
        jTFNombreClase = new javax.swing.JTextField();
        jTFCapacidad = new javax.swing.JTextField();
        jBAddClase = new javax.swing.JButton();
        jLMaximoClase = new javax.swing.JLabel();
        jPAsiento = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAsientos = new javax.swing.JTable();
        jLBienvenido = new javax.swing.JLabel();
        jBCerrarSesion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de la base de datos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTPEntidades.setBorder(javax.swing.BorderFactory.createTitledBorder("Entidades"));

        jTPaises.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTPaises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISO 3166-1", "Nombre del país"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTPaises.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTPaisesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTPaises);

        jPAgregarPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar país"));

        jLNombrePais.setText("Nombre:");

        jLCodigoPais.setText("Código ISO 3166-1:");

        jTFNombrePais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombrePaisActionPerformed(evt);
            }
        });

        jTFCodigoPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCodigoPaisActionPerformed(evt);
            }
        });

        jBAddPais.setText("Agregar a la base de datos");
        jBAddPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddPaisActionPerformed(evt);
            }
        });

        jLMaximoPais.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximoPais.setText("Máximo 70 caracteres");

        javax.swing.GroupLayout jPAgregarPaisLayout = new javax.swing.GroupLayout(jPAgregarPais);
        jPAgregarPais.setLayout(jPAgregarPaisLayout);
        jPAgregarPaisLayout.setHorizontalGroup(
            jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarPaisLayout.createSequentialGroup()
                        .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCodigoPais)
                            .addComponent(jLNombrePais))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPAgregarPaisLayout.createSequentialGroup()
                                .addComponent(jLMaximoPais)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFNombrePais, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(jTFCodigoPais))
                        .addContainerGap())
                    .addGroup(jPAgregarPaisLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jBAddPais)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPAgregarPaisLayout.setVerticalGroup(
            jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoPais)
                    .addComponent(jTFCodigoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombrePais)
                    .addComponent(jTFNombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximoPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jBAddPais)
                .addGap(12, 12, 12))
        );

        jPActualizarPais.setBorder(javax.swing.BorderFactory.createTitledBorder("Actualizar País"));

        jLCodigoPais1.setText("Código ISO 3166-1:");

        jTFCodigoPaisActualizar.setEditable(false);

        jLNombrePais1.setText("Nombre:");

        jTFNombrePaisActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombrePaisActualizarActionPerformed(evt);
            }
        });

        jBModificarPais.setText("Modificar desde la base");
        jBModificarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarPaisActionPerformed(evt);
            }
        });

        jLMaximoPais1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximoPais1.setText("Máximo 70 caracteres");

        javax.swing.GroupLayout jPActualizarPaisLayout = new javax.swing.GroupLayout(jPActualizarPais);
        jPActualizarPais.setLayout(jPActualizarPaisLayout);
        jPActualizarPaisLayout.setHorizontalGroup(
            jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPActualizarPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPActualizarPaisLayout.createSequentialGroup()
                        .addGroup(jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLNombrePais1)
                            .addComponent(jLCodigoPais1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPActualizarPaisLayout.createSequentialGroup()
                                .addComponent(jLMaximoPais1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTFCodigoPaisActualizar)
                            .addComponent(jTFNombrePaisActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPActualizarPaisLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jBModificarPais)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPActualizarPaisLayout.setVerticalGroup(
            jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPActualizarPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoPais1)
                    .addComponent(jTFCodigoPaisActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombrePais1)
                    .addComponent(jTFNombrePaisActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximoPais1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBModificarPais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar País"));

        jLCodigoEliminar.setText("Código ISO 3166-1:");

        jTFCodigoPaisEliminar.setEditable(false);

        jBEliminarPais.setText("Eliminar desde la base");
        jBEliminarPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarPaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCodigoEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCodigoPaisEliminar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminarPais)
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoEliminar)
                    .addComponent(jTFCodigoPaisEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminarPais)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPPaisLayout = new javax.swing.GroupLayout(jPPais);
        jPPais.setLayout(jPPaisLayout);
        jPPaisLayout.setHorizontalGroup(
            jPPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAgregarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPActualizarPais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        jPPaisLayout.setVerticalGroup(
            jPPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPaisLayout.createSequentialGroup()
                .addGap(0, 73, Short.MAX_VALUE)
                .addGroup(jPPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPPaisLayout.createSequentialGroup()
                        .addComponent(jPAgregarPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPActualizarPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTPEntidades.addTab("País", jPPais);

        jTComidas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTComidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º", "Comida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTComidas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTComidasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTComidas);

        jPAgregarComida.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar comida"));

        jBRmComida.setText("Eliminar desde la base");
        jBRmComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRmComidaActionPerformed(evt);
            }
        });

        jLComida.setText("ID Comida:");

        jTFIdComidaRm.setEditable(false);
        jTFIdComidaRm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdComidaRmActionPerformed(evt);
            }
        });

        jLMaximoComida.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximoComida.setText("Máximo 25 caracteres");

        javax.swing.GroupLayout jPAgregarComidaLayout = new javax.swing.GroupLayout(jPAgregarComida);
        jPAgregarComida.setLayout(jPAgregarComidaLayout);
        jPAgregarComidaLayout.setHorizontalGroup(
            jPAgregarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarComidaLayout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addComponent(jBRmComida)
                .addGap(57, 57, 57))
            .addGroup(jPAgregarComidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFIdComidaRm)
                    .addGroup(jPAgregarComidaLayout.createSequentialGroup()
                        .addGroup(jPAgregarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLComida)
                            .addComponent(jLMaximoComida))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPAgregarComidaLayout.setVerticalGroup(
            jPAgregarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarComidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLComida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFIdComidaRm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximoComida)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRmComida))
        );

        jPAgregarComida1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar comida"));

        jBAddComida1.setText("Agregar a la base de datos");
        jBAddComida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddComida1ActionPerformed(evt);
            }
        });

        jLComida1.setText("Nombre de la comida:");

        jTFComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFComidaActionPerformed(evt);
            }
        });

        jLMaximoComida1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximoComida1.setText("Máximo 25 caracteres");

        javax.swing.GroupLayout jPAgregarComida1Layout = new javax.swing.GroupLayout(jPAgregarComida1);
        jPAgregarComida1.setLayout(jPAgregarComida1Layout);
        jPAgregarComida1Layout.setHorizontalGroup(
            jPAgregarComida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarComida1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAddComida1)
                .addGap(57, 57, 57))
            .addGroup(jPAgregarComida1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarComida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFComida)
                    .addGroup(jPAgregarComida1Layout.createSequentialGroup()
                        .addGroup(jPAgregarComida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLComida1)
                            .addComponent(jLMaximoComida1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPAgregarComida1Layout.setVerticalGroup(
            jPAgregarComida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarComida1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLComida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximoComida1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddComida1))
        );

        jPAgregarComida2.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar comida"));

        jBModComida.setText("Modificar desde la base");
        jBModComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModComidaActionPerformed(evt);
            }
        });

        jLComida2.setText("Nombre de la comida:");

        jTFComidaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFComidaModActionPerformed(evt);
            }
        });

        jLMaximoComida2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximoComida2.setText("Máximo 25 caracteres");

        jLComida3.setText("ID Comida:");

        jTFIdComidaMod.setEditable(false);
        jTFIdComidaMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFIdComidaModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPAgregarComida2Layout = new javax.swing.GroupLayout(jPAgregarComida2);
        jPAgregarComida2.setLayout(jPAgregarComida2Layout);
        jPAgregarComida2Layout.setHorizontalGroup(
            jPAgregarComida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarComida2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarComida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFComidaMod)
                    .addComponent(jTFIdComidaMod)
                    .addGroup(jPAgregarComida2Layout.createSequentialGroup()
                        .addGroup(jPAgregarComida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLComida3)
                            .addComponent(jLComida2)
                            .addComponent(jLMaximoComida2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarComida2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jBModComida)
                .addGap(77, 77, 77))
        );
        jPAgregarComida2Layout.setVerticalGroup(
            jPAgregarComida2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarComida2Layout.createSequentialGroup()
                .addComponent(jLComida3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFIdComidaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLComida2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFComidaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximoComida2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBModComida)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPComidaLayout = new javax.swing.GroupLayout(jPComida);
        jPComida.setLayout(jPComidaLayout);
        jPComidaLayout.setHorizontalGroup(
            jPComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPComidaLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAgregarComida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPComidaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPAgregarComida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPComidaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPAgregarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPComidaLayout.setVerticalGroup(
            jPComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPComidaLayout.createSequentialGroup()
                .addGroup(jPComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPComidaLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPAgregarComida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPAgregarComida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPAgregarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPComidaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 59, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jTPEntidades.addTab("Comida", jPComida);

        jTClases.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º", "Nombre de la clase", "Capacidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTClases);

        jPAgregarClase.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar clase"));

        jLNombreClase.setText("Nombre:");

        jLCapacidad.setText("Capacidad:");

        jTFNombreClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreClaseActionPerformed(evt);
            }
        });

        jTFCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapacidadActionPerformed(evt);
            }
        });

        jBAddClase.setText("Agregar a la base de datos");
        jBAddClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddClaseActionPerformed(evt);
            }
        });

        jLMaximoClase.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximoClase.setText("Máximo 25 caracteres");

        javax.swing.GroupLayout jPAgregarClaseLayout = new javax.swing.GroupLayout(jPAgregarClase);
        jPAgregarClase.setLayout(jPAgregarClaseLayout);
        jPAgregarClaseLayout.setHorizontalGroup(
            jPAgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCapacidad)
                    .addComponent(jLNombreClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNombreClase)
                    .addComponent(jTFCapacidad)
                    .addGroup(jPAgregarClaseLayout.createSequentialGroup()
                        .addGroup(jPAgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBAddClase)
                            .addComponent(jLMaximoClase))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPAgregarClaseLayout.setVerticalGroup(
            jPAgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreClase)
                    .addComponent(jTFNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLMaximoClase)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCapacidad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddClase)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPClaseLayout = new javax.swing.GroupLayout(jPClase);
        jPClase.setLayout(jPClaseLayout);
        jPClaseLayout.setHorizontalGroup(
            jPClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPAgregarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPClaseLayout.setVerticalGroup(
            jPClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPAgregarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPEntidades.addTab("Clase", jPClase);

        jTAsientos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTAsientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º", "Ubicación", "Estado", "Clase"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTAsientos);

        javax.swing.GroupLayout jPAsientoLayout = new javax.swing.GroupLayout(jPAsiento);
        jPAsiento.setLayout(jPAsientoLayout);
        jPAsientoLayout.setHorizontalGroup(
            jPAsientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPAsientoLayout.setVerticalGroup(
            jPAsientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTPEntidades.addTab("Asiento", jPAsiento);

        jLBienvenido.setText("Bienvenido");

        jBCerrarSesion.setText("Cerrar sesión");
        jBCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCerrarSesionActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTPEntidades)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLBienvenido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCerrarSesion))
                            .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCerrarSesion)
                    .addComponent(jLBienvenido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTPEntidades)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSalir)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarTablaPaises(){
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(new JComboBox(), false, 0);
        DefaultTableModel modeloTabla = (DefaultTableModel)this.jTPaises.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[2];
        for(Cm_ClsPais aux : this.listaPaises){
            fila[0] = aux.getId();
            fila[1] = aux.getNombre();
            modeloTabla.addRow(fila);
        }
    }
    
    private void llenarTablaComidas(){
        this.listaComidas = this.ng_clsComida.mostrarComidaTabla();
        DefaultTableModel modeloTabla = (DefaultTableModel)this.jTComidas.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[2];
        for(Cm_ClsComida aux : this.listaComidas){
            fila[0] = aux.getId();
            fila[1] = aux.getNombre();
            modeloTabla.addRow(fila);
        }
    }
    
    private void llenarTablaClases(){
        this.listaClases = this.ng_clsClase.mostrarClaseAll(new JComboBox());
        DefaultTableModel modeloTabla = (DefaultTableModel)this.jTClases.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[3];
        for(Cm_ClsClase aux : this.listaClases){
            fila[0] = aux.getId();
            fila[1] = aux.getNombre();
            fila[2] = aux.getCapacidad();
            modeloTabla.addRow(fila);
        }
    }
    
    private void llenarTablaAsientos(){
        this.listaAsientos = this.ng_clsAsiento.mostrarAsientoAll();
        DefaultTableModel modeloTabla = (DefaultTableModel)this.jTAsientos.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[4];
        for(Cm_ClsAsiento aux : this.listaAsientos){
            fila[0] = aux.getId();
            fila[1] = aux.getUbicacion();
            fila[2] = aux.getEstado();
            fila[3] = aux.getId_clse_FK();
            modeloTabla.addRow(fila);
        }
    }
    
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        this.llenarTablaPaises();
        this.llenarTablaComidas();
        this.llenarTablaClases();
        this.llenarTablaAsientos();
    }//GEN-LAST:event_formWindowOpened

    private void jTFIdComidaRmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdComidaRmActionPerformed
        this.jBRmComida.doClick();
    }//GEN-LAST:event_jTFIdComidaRmActionPerformed

    private void jBCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCerrarSesionActionPerformed
        this.setVisible(false);
        this.jfLogin = new JFLogin();
        this.jfLogin.setVisible(true);
    }//GEN-LAST:event_jBCerrarSesionActionPerformed

    private void jTFNombreClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreClaseActionPerformed
        this.jBAddClase.doClick();
    }//GEN-LAST:event_jTFNombreClaseActionPerformed

    private void jTFCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapacidadActionPerformed
        this.jBAddClase.doClick();
    }//GEN-LAST:event_jTFCapacidadActionPerformed

    private void jBRmComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRmComidaActionPerformed
        
            int respuesta = this.ng_clsComida.eliminarComida(Integer.parseInt(this.jTFIdComidaRm.getText()));
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaComidas();
            }else{
                JOptionPane.showMessageDialog(null, "Existen reservas con esta comida.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        
    }//GEN-LAST:event_jBRmComidaActionPerformed

    private void jBAddClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddClaseActionPerformed
        Matcher matNombreClase = this.patNombres.matcher(this.jTFNombreClase.getText());
        Matcher matCapacidad = this.patCapacidad.matcher(this.jTFCapacidad.getText());
        if(matNombreClase.matches() && matCapacidad.matches()){
            int respuesta = this.ng_clsClase.insertarClase(this.jTFNombreClase.getText(), Integer.parseInt(this.jTFCapacidad.getText()));
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaClases();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            String error = "";
            error += matNombreClase.matches()?"":"- El nombre de la clase ingresada no es válido.\n";
            error += matCapacidad.matches()?"":"- La capacidad ingresada no es válida.\n";
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n" + error, "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAddClaseActionPerformed

    private void jBModificarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarPaisActionPerformed
        Matcher matNombrePais = this.patNombrePais.matcher(this.jTFNombrePaisActualizar.getText());
        if(matNombrePais.matches()){
            int respuesta = this.ng_clsPais.actualizarPais(Integer.parseInt(this.jTFCodigoPaisActualizar.getText()), this.jTFNombrePaisActualizar.getText());
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaPaises();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            String error = "";
            error += matNombrePais.matches()?"":"- El nombre del país ingresado no es válido.\n";
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n" + error, "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModificarPaisActionPerformed

    private void jTFNombrePaisActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombrePaisActualizarActionPerformed
        this.jBModificarPais.doClick();
    }//GEN-LAST:event_jTFNombrePaisActualizarActionPerformed

    private void jBAddPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddPaisActionPerformed
        Matcher matCodigo = this.patCapacidad.matcher(this.jTFCodigoPais.getText());
        Matcher matNombrePais = this.patNombrePais.matcher(this.jTFNombrePais.getText());
        if(matCodigo.matches() && matNombrePais.matches()){
            int respuesta = this.ng_clsPais.insertarPais(Integer.parseInt(this.jTFCodigoPais.getText()), this.jTFNombrePais.getText());
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaPaises();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            String error = "";
            error += matCodigo.matches()?"":"- El código de país ingresado no es válido.\n";
            error += matNombrePais.matches()?"":"- El nombre del país ingresado no es válido.\n";
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n" + error, "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAddPaisActionPerformed

    private void jTFCodigoPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCodigoPaisActionPerformed
        this.jBAddPais.doClick();
    }//GEN-LAST:event_jTFCodigoPaisActionPerformed

    private void jTFNombrePaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombrePaisActionPerformed
        this.jBAddPais.doClick();
    }//GEN-LAST:event_jTFNombrePaisActionPerformed

    private void jTPaisesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTPaisesMouseClicked
        Cm_ClsPais paisSeleccionado = this.listaPaises.get(this.jTPaises.getSelectedRow());
        this.jTFCodigoPaisActualizar.setText("" + paisSeleccionado.getId() );
        this.jTFNombrePaisActualizar.setText(paisSeleccionado.getNombre());
        this.jTFCodigoPaisEliminar.setText("" + paisSeleccionado.getId());
    }//GEN-LAST:event_jTPaisesMouseClicked

    private void jBEliminarPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarPaisActionPerformed
        int respuesta = this.ng_clsPais.borrarPais(Integer.parseInt(this.jTFCodigoPaisEliminar.getText()));
        if(respuesta >= 1){
            JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
            this.llenarTablaPaises();
        }else{
            JOptionPane.showMessageDialog(null, "El país no se pudo borrar debido a que hay clientes de ese país registrados en la base.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarPaisActionPerformed

    private void jBAddComida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddComida1ActionPerformed
       Matcher matNombreComida = this.patNombres.matcher(this.jTFComida.getText());
        if(matNombreComida.matches()){
            int respuesta = this.ng_clsComida.insertarComida(this.jTFComida.getText());
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaComidas();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n- El nombre de la comida ingresada no es válido.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAddComida1ActionPerformed

    private void jTFComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFComidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFComidaActionPerformed

    private void jBModComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModComidaActionPerformed
       Matcher matNombreComida = this.patNombres.matcher(this.jTFComidaMod.getText());
        if(matNombreComida.matches()){
            int respuesta = this.ng_clsComida.actualizarComida(Integer.parseInt(jTFIdComidaMod.getText()),this.jTFComidaMod.getText());
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaComidas();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n- El nombre de la comida ingresada no es válido.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModComidaActionPerformed

    private void jTFComidaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFComidaModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFComidaModActionPerformed

    private void jTFIdComidaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFIdComidaModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFIdComidaModActionPerformed

    private void jTComidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTComidasMouseClicked
       Cm_ClsComida comidaSeleccionada = this.listaComidas.get(this.jTComidas.getSelectedRow());
       this.jTFIdComidaMod.setText(""+comidaSeleccionada.getId());
       this.jTFComidaMod.setText(comidaSeleccionada.getNombre());
       
       this.jTFIdComidaRm.setText(""+comidaSeleccionada.getId());
    }//GEN-LAST:event_jTComidasMouseClicked

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(JFAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAddClase;
    private javax.swing.JButton jBAddComida1;
    private javax.swing.JButton jBAddPais;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBEliminarPais;
    private javax.swing.JButton jBModComida;
    private javax.swing.JButton jBModificarPais;
    private javax.swing.JButton jBRmComida;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLBienvenido;
    private javax.swing.JLabel jLCapacidad;
    private javax.swing.JLabel jLCodigoEliminar;
    private javax.swing.JLabel jLCodigoPais;
    private javax.swing.JLabel jLCodigoPais1;
    private javax.swing.JLabel jLComida;
    private javax.swing.JLabel jLComida1;
    private javax.swing.JLabel jLComida2;
    private javax.swing.JLabel jLComida3;
    private javax.swing.JLabel jLMaximoClase;
    private javax.swing.JLabel jLMaximoComida;
    private javax.swing.JLabel jLMaximoComida1;
    private javax.swing.JLabel jLMaximoComida2;
    private javax.swing.JLabel jLMaximoPais;
    private javax.swing.JLabel jLMaximoPais1;
    private javax.swing.JLabel jLNombreClase;
    private javax.swing.JLabel jLNombrePais;
    private javax.swing.JLabel jLNombrePais1;
    private javax.swing.JPanel jPActualizarPais;
    private javax.swing.JPanel jPAgregarClase;
    private javax.swing.JPanel jPAgregarComida;
    private javax.swing.JPanel jPAgregarComida1;
    private javax.swing.JPanel jPAgregarComida2;
    private javax.swing.JPanel jPAgregarPais;
    private javax.swing.JPanel jPAsiento;
    private javax.swing.JPanel jPClase;
    private javax.swing.JPanel jPComida;
    private javax.swing.JPanel jPPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTAsientos;
    private javax.swing.JTable jTClases;
    private javax.swing.JTable jTComidas;
    private javax.swing.JTextField jTFCapacidad;
    private javax.swing.JTextField jTFCodigoPais;
    private javax.swing.JTextField jTFCodigoPaisActualizar;
    private javax.swing.JTextField jTFCodigoPaisEliminar;
    private javax.swing.JTextField jTFComida;
    private javax.swing.JTextField jTFComidaMod;
    private javax.swing.JTextField jTFIdComidaMod;
    private javax.swing.JTextField jTFIdComidaRm;
    private javax.swing.JTextField jTFNombreClase;
    private javax.swing.JTextField jTFNombrePais;
    private javax.swing.JTextField jTFNombrePaisActualizar;
    private javax.swing.JTabbedPane jTPEntidades;
    private javax.swing.JTable jTPaises;
    // End of variables declaration//GEN-END:variables
}
