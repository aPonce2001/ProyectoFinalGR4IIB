
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
    Ng_ClsReserva ng_clsReserva = new Ng_ClsReserva();
    Ng_ClsCliente ng_clsCliente = new Ng_ClsCliente();
    List<Cm_ClsClase> listaClasesCB;
    List<Cm_ClsPais> listaPaises;
    List<Cm_ClsComida> listaComidas;
    List<Cm_ClsClase> listaClases;
    List<Cm_ClsAsiento> listaAsientos;
    List<Cm_ClsReserva> listaReservas;
    List<Cm_ClsCliente> listaClientes;
    List<Cm_ClsAsiento> listaAsientosDisponibles;
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
        this.ng_clsCliente = new Ng_ClsCliente();
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisOrigenAdd, false, 0);
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisDestinoAdd, false, 0);
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisOrigenMod, false, 0);
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisDestinoMod, false, 0);
        this.llenarTablaPaises();
        this.llenarTablaComidas();
        this.llenarTablaClases();
        this.llenarTablaAsientos();
        this.llenarTablaReservas();
        this.llenarComboBoxAsientos();
        this.llenarComboBoxClientes();
        this.llenarComboBoxComidas();
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
        jBAddComida = new javax.swing.JButton();
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
        jPModificarClase = new javax.swing.JPanel();
        jLCapacidadMod = new javax.swing.JLabel();
        jLNombreClaseMod = new javax.swing.JLabel();
        jLIDClase = new javax.swing.JLabel();
        jTFIDClaseMod = new javax.swing.JTextField();
        jTFClaseMod = new javax.swing.JTextField();
        jLMaximoClase1 = new javax.swing.JLabel();
        jTFCapacidadMod = new javax.swing.JTextField();
        jBModificarClase = new javax.swing.JButton();
        jPBorrarClase = new javax.swing.JPanel();
        jLIDClase1 = new javax.swing.JLabel();
        jTFIDClaseRm = new javax.swing.JTextField();
        jBEliminarClase = new javax.swing.JButton();
        jPAsiento = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAsientos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPAgregarClase1 = new javax.swing.JPanel();
        jLNombreClase1 = new javax.swing.JLabel();
        jLCapacidad1 = new javax.swing.JLabel();
        jBAddReserva = new javax.swing.JButton();
        jCBClienteAdd = new javax.swing.JComboBox<>();
        jCBAsientoAdd = new javax.swing.JComboBox<>();
        jCBComidaAdd = new javax.swing.JComboBox<>();
        jLCapacidad2 = new javax.swing.JLabel();
        jLCapacidad3 = new javax.swing.JLabel();
        jLCapacidad4 = new javax.swing.JLabel();
        jCBPaisOrigenAdd = new javax.swing.JComboBox<>();
        jCBPaisDestinoAdd = new javax.swing.JComboBox<>();
        jPAgregarClase5 = new javax.swing.JPanel();
        jLNombreClase4 = new javax.swing.JLabel();
        jLCapacidad13 = new javax.swing.JLabel();
        jBModificarReserva2 = new javax.swing.JButton();
        jCBClienteMod = new javax.swing.JComboBox<>();
        jCBAsientoMod = new javax.swing.JComboBox<>();
        jCBComidaMod = new javax.swing.JComboBox<>();
        jLCapacidad14 = new javax.swing.JLabel();
        jLCapacidad15 = new javax.swing.JLabel();
        jLCapacidad16 = new javax.swing.JLabel();
        jCBPaisOrigenMod = new javax.swing.JComboBox<>();
        jCBPaisDestinoMod = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTFIDReservaMod = new javax.swing.JTextField();
        jPAgregarClase3 = new javax.swing.JPanel();
        jBEliminarReserva = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTFIdReservaEliminar = new javax.swing.JTextField();
        jBRegistrar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTReservas = new javax.swing.JTable();
        jBActualizarListaClientes = new javax.swing.JButton();
        jLBienvenido = new javax.swing.JLabel();
        jBCerrarSesion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administración de la base de datos");

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
                .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLCodigoPais)
                    .addComponent(jLNombrePais))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarPaisLayout.createSequentialGroup()
                        .addComponent(jLMaximoPais)
                        .addGap(0, 292, Short.MAX_VALUE))
                    .addComponent(jTFNombrePais, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                    .addComponent(jTFCodigoPais))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarPaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAddPais)
                .addGap(166, 166, 166))
        );
        jPAgregarPaisLayout.setVerticalGroup(
            jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarPaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoPais)
                    .addComponent(jTFCodigoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombrePais)
                    .addComponent(jTFNombrePais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximoPais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddPais))
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
                .addGroup(jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLNombrePais1)
                    .addComponent(jLCodigoPais1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPActualizarPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPActualizarPaisLayout.createSequentialGroup()
                        .addComponent(jLMaximoPais1)
                        .addGap(0, 292, Short.MAX_VALUE))
                    .addComponent(jTFCodigoPaisActualizar)
                    .addComponent(jTFNombrePaisActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPActualizarPaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBModificarPais)
                .addGap(154, 154, 154))
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
                .addComponent(jTFCodigoPaisEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminarPais)
                .addGap(162, 162, 162))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigoEliminar)
                    .addComponent(jTFCodigoPaisEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminarPais)
                .addContainerGap())
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
            .addGroup(jPPaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPPaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                    .addGroup(jPPaisLayout.createSequentialGroup()
                        .addComponent(jPAgregarPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPActualizarPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
            .addGroup(jPAgregarComidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFIdComidaRm)
                    .addGroup(jPAgregarComidaLayout.createSequentialGroup()
                        .addGroup(jPAgregarComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLComida)
                            .addComponent(jLMaximoComida))
                        .addGap(0, 411, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPAgregarComidaLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jBRmComida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jBRmComida)
                .addContainerGap())
        );

        jPAgregarComida1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar comida"));

        jBAddComida.setText("Agregar a la base de datos");
        jBAddComida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddComidaActionPerformed(evt);
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
            .addGroup(jPAgregarComida1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPAgregarComida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFComida)
                    .addGroup(jPAgregarComida1Layout.createSequentialGroup()
                        .addGroup(jPAgregarComida1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLComida1)
                            .addComponent(jLMaximoComida1))
                        .addGap(0, 388, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPAgregarComida1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jBAddComida)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jBAddComida)
                .addContainerGap())
        );

        jPAgregarComida2.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar comida"));

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
                        .addGap(0, 388, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarComida2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBModComida)
                .addGap(181, 181, 181))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAgregarComida1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAgregarComida2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAgregarComida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPComidaLayout.setVerticalGroup(
            jPComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPComidaLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPComidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPComidaLayout.createSequentialGroup()
                        .addComponent(jPAgregarComida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPAgregarComida2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPAgregarComida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 98, Short.MAX_VALUE)))
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
        jTClases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTClasesMouseClicked(evt);
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
                        .addComponent(jLMaximoClase)
                        .addGap(0, 340, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarClaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAddClase)
                .addGap(162, 162, 162))
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

        jPModificarClase.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar clase"));

        jLCapacidadMod.setText("Capacidad:");

        jLNombreClaseMod.setText("Clase:");

        jLIDClase.setText("ID:");

        jTFIDClaseMod.setEditable(false);

        jTFClaseMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFClaseModActionPerformed(evt);
            }
        });

        jLMaximoClase1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLMaximoClase1.setText("Máximo 25 caracteres");

        jTFCapacidadMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCapacidadModActionPerformed(evt);
            }
        });

        jBModificarClase.setText("Modificar desde la base");
        jBModificarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPModificarClaseLayout = new javax.swing.GroupLayout(jPModificarClase);
        jPModificarClase.setLayout(jPModificarClaseLayout);
        jPModificarClaseLayout.setHorizontalGroup(
            jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPModificarClaseLayout.createSequentialGroup()
                .addGroup(jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPModificarClaseLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLIDClase)
                            .addComponent(jLNombreClaseMod))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFIDClaseMod)
                            .addComponent(jTFClaseMod)
                            .addGroup(jPModificarClaseLayout.createSequentialGroup()
                                .addComponent(jLMaximoClase1)
                                .addGap(0, 340, Short.MAX_VALUE))))
                    .addGroup(jPModificarClaseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCapacidadMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFCapacidadMod)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPModificarClaseLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBModificarClase)
                .addGap(165, 165, 165))
        );
        jPModificarClaseLayout.setVerticalGroup(
            jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPModificarClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDClase)
                    .addComponent(jTFIDClaseMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreClaseMod)
                    .addComponent(jTFClaseMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLMaximoClase1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPModificarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCapacidadMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCapacidadMod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBModificarClase)
                .addContainerGap())
        );

        jPBorrarClase.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar clase"));

        jLIDClase1.setText("ID:");

        jTFIDClaseRm.setEditable(false);

        jBEliminarClase.setText("Eliminar desde la base");
        jBEliminarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarClaseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPBorrarClaseLayout = new javax.swing.GroupLayout(jPBorrarClase);
        jPBorrarClase.setLayout(jPBorrarClaseLayout);
        jPBorrarClaseLayout.setHorizontalGroup(
            jPBorrarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBorrarClaseLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLIDClase1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFIDClaseRm, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPBorrarClaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBEliminarClase)
                .addGap(164, 164, 164))
        );
        jPBorrarClaseLayout.setVerticalGroup(
            jPBorrarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPBorrarClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPBorrarClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLIDClase1)
                    .addComponent(jTFIDClaseRm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminarClase)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPClaseLayout = new javax.swing.GroupLayout(jPClase);
        jPClase.setLayout(jPClaseLayout);
        jPClaseLayout.setHorizontalGroup(
            jPClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAgregarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPModificarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPBorrarClase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPClaseLayout.setVerticalGroup(
            jPClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPClaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPClaseLayout.createSequentialGroup()
                        .addComponent(jPAgregarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPModificarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPBorrarClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE))
                .addContainerGap())
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 980, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPAsientoLayout.setVerticalGroup(
            jPAsientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAsientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 535, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTPEntidades.addTab("Asiento", jPAsiento);

        jPAgregarClase1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Reserva"));

        jLNombreClase1.setText("Cliente:");

        jLCapacidad1.setText("Asiento:");

        jBAddReserva.setText("Agregar a la base de datos");
        jBAddReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAddReservaActionPerformed(evt);
            }
        });

        jLCapacidad2.setText("Comida:");

        jLCapacidad3.setText("País de origen:");

        jLCapacidad4.setText("País de destino:");

        javax.swing.GroupLayout jPAgregarClase1Layout = new javax.swing.GroupLayout(jPAgregarClase1);
        jPAgregarClase1.setLayout(jPAgregarClase1Layout);
        jPAgregarClase1Layout.setHorizontalGroup(
            jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClase1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPAgregarClase1Layout.createSequentialGroup()
                        .addComponent(jLCapacidad4)
                        .addGap(1, 1, 1)
                        .addComponent(jCBPaisDestinoAdd, 0, 281, Short.MAX_VALUE))
                    .addGroup(jPAgregarClase1Layout.createSequentialGroup()
                        .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCapacidad2)
                            .addComponent(jLCapacidad3)
                            .addComponent(jLCapacidad1)
                            .addComponent(jLNombreClase1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBPaisOrigenAdd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBClienteAdd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBAsientoAdd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBComidaAdd, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarClase1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAddReserva)
                .addGap(105, 105, 105))
        );
        jPAgregarClase1Layout.setVerticalGroup(
            jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClase1Layout.createSequentialGroup()
                .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBClienteAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombreClase1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBAsientoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCapacidad1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBComidaAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCapacidad2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCapacidad3)
                    .addComponent(jCBPaisOrigenAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBPaisDestinoAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCapacidad4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAddReserva)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPAgregarClase5.setBorder(javax.swing.BorderFactory.createTitledBorder("Modificar Reserva"));

        jLNombreClase4.setText("Cliente:");

        jLCapacidad13.setText("Asiento:");

        jBModificarReserva2.setText("Modificar reserva");
        jBModificarReserva2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarReserva2ActionPerformed(evt);
            }
        });

        jLCapacidad14.setText("Comida:");

        jLCapacidad15.setText("País de origen:");

        jLCapacidad16.setText("País de destino:");

        jLabel4.setText("ID Reserva:");

        jTFIDReservaMod.setEditable(false);

        javax.swing.GroupLayout jPAgregarClase5Layout = new javax.swing.GroupLayout(jPAgregarClase5);
        jPAgregarClase5.setLayout(jPAgregarClase5Layout);
        jPAgregarClase5Layout.setHorizontalGroup(
            jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClase5Layout.createSequentialGroup()
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarClase5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLCapacidad16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBPaisDestinoMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPAgregarClase5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLCapacidad15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBPaisOrigenMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarClase5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarClase5Layout.createSequentialGroup()
                        .addComponent(jBModificarReserva2)
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPAgregarClase5Layout.createSequentialGroup()
                        .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLCapacidad14)
                            .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLNombreClase4)
                                .addComponent(jLCapacidad13))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCBComidaMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBAsientoMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCBClienteMod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTFIDReservaMod, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPAgregarClase5Layout.setVerticalGroup(
            jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClase5Layout.createSequentialGroup()
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFIDReservaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombreClase4)
                    .addComponent(jCBClienteMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCapacidad13)
                    .addComponent(jCBAsientoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCapacidad14)
                    .addComponent(jCBComidaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCapacidad15)
                    .addComponent(jCBPaisOrigenMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPAgregarClase5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCapacidad16)
                    .addComponent(jCBPaisDestinoMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBModificarReserva2))
        );

        jPAgregarClase3.setBorder(javax.swing.BorderFactory.createTitledBorder("Eliminar Reserva"));

        jBEliminarReserva.setText("Eliminar Reserva");
        jBEliminarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarReservaActionPerformed(evt);
            }
        });

        jLabel2.setText("Id Reserva:");

        jTFIdReservaEliminar.setEditable(false);

        javax.swing.GroupLayout jPAgregarClase3Layout = new javax.swing.GroupLayout(jPAgregarClase3);
        jPAgregarClase3.setLayout(jPAgregarClase3Layout);
        jPAgregarClase3Layout.setHorizontalGroup(
            jPAgregarClase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClase3Layout.createSequentialGroup()
                .addGroup(jPAgregarClase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPAgregarClase3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTFIdReservaEliminar))
                    .addGroup(jPAgregarClase3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jBEliminarReserva)
                        .addGap(0, 130, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPAgregarClase3Layout.setVerticalGroup(
            jPAgregarClase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPAgregarClase3Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPAgregarClase3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFIdReservaEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminarReserva)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jBRegistrar.setText("Registrar un nuevo cliente");
        jBRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRegistrarActionPerformed(evt);
            }
        });

        jTReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N.º", "Fecha", "Cliente", "Asiento", "Comida", "País de origen", "País de destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTReservas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTReservasMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTReservas);

        jBActualizarListaClientes.setText("Actualizar lista de clientes");
        jBActualizarListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarListaClientesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPAgregarClase5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAgregarClase3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPAgregarClase1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jBRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(jBActualizarListaClientes)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPAgregarClase1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPAgregarClase5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPAgregarClase3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBRegistrar)
                            .addComponent(jBActualizarListaClientes))))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTPEntidades.addTab("Reserva", jPanel2);

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLBienvenido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBCerrarSesion))
                            .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jTPEntidades))
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
                .addComponent(jBSalir))
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
    
    private void llenarTablaReservas(){
        this.listaReservas = this.ng_clsReserva.mostrarReservaAll();
        DefaultTableModel modeloTabla = (DefaultTableModel)this.jTReservas.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[7];
        for(Cm_ClsReserva aux: this.listaReservas){
            fila[0] = aux.getId();
            fila[1] = aux.getFecha().toString();
            fila[2] = aux.getIdClientFk();
            fila[3] = aux.getIdAsientoFk();
            fila[4] = aux.getIdComidaFk();
            fila[5] = aux.getIdPaisOrigenFk();
            fila[6] = aux.getIdPaisDestinoFk();
            modeloTabla.addRow(fila);
        }
    }
    
    private void llenarComboBoxPaises(){
        this.jCBPaisOrigenAdd.removeAllItems();
        this.jCBPaisDestinoAdd.removeAllItems();
        this.jCBPaisOrigenMod.removeAllItems();
        this.jCBPaisDestinoMod.removeAllItems();
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisOrigenAdd, false, 0);
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisDestinoAdd, false, 0);
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisOrigenMod, false, 0);
        this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisDestinoMod, false, 0);
    }
    
    private void llenarComboBoxAsientos(){
        this.jCBAsientoAdd.removeAllItems();
        this.jCBAsientoMod.removeAllItems();
        this.listaAsientosDisponibles = this.ng_clsAsiento.mostrarAsientosDisponibles();
        this.jCBAsientoAdd.addItem("Seleccione una opción");
        this.jCBAsientoMod.addItem("Mantener asiento");
        for(Cm_ClsAsiento aux: listaAsientosDisponibles){
            this.jCBAsientoAdd.addItem("Clase " + aux.getId_clse_FK() + " - " + aux.getId() + " - " + aux.getUbicacion());
            this.jCBAsientoMod.addItem("Clase " + aux.getId_clse_FK() + " - " + aux.getId() + " - " + aux.getUbicacion());
        }
    }
    
    private void llenarComboBoxClientes(){
        this.jCBClienteAdd.removeAllItems();
        this.jCBClienteMod.removeAllItems();
        this.listaClientes = this.ng_clsCliente.mostrarClienteAll();
        this.jCBClienteAdd.addItem("Seleccione una opción");
        this.jCBClienteMod.addItem("Seleccione una opción");
        for(Cm_ClsCliente aux: listaClientes){
            this.jCBClienteAdd.addItem(aux.getCedula() + " - " + aux.getNombre() + " " + aux.getApellido());
            this.jCBClienteMod.addItem(aux.getCedula() + " - " + aux.getNombre() + " " + aux.getApellido());
        }
    }
    
    private void llenarComboBoxComidas(){
        this.jCBComidaAdd.removeAllItems();
        this.jCBComidaMod.removeAllItems();
        this.jCBComidaAdd.addItem("Seleccione una opción");
        this.jCBComidaMod.addItem("Seleccione una opción");
        for(Cm_ClsComida aux: listaComidas){
            this.jCBComidaAdd.addItem(aux.getNombre());
            this.jCBComidaMod.addItem(aux.getNombre());
        }
    }
    
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed
    
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
            this.llenarComboBoxComidas();
        }else{
            JOptionPane.showMessageDialog(null, "Existen reservas con esta comida o no existe.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
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
                this.llenarComboBoxPaises();
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
                this.llenarComboBoxPaises();
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
            this.llenarComboBoxPaises();
            this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisOrigenAdd, false, 0);
            this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisDestinoAdd, false, 0);
            this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisOrigenMod, false, 0);
            this.listaPaises = this.ng_clsPais.mostrarPaisAll(jCBPaisDestinoMod, false, 0);
        }else{
            JOptionPane.showMessageDialog(null, "El país no se pudo borrar debido a que hay clientes de ese país registrados en la base, o no existe.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarPaisActionPerformed

    private void jBAddComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddComidaActionPerformed
       Matcher matNombreComida = this.patNombres.matcher(this.jTFComida.getText());
        if(matNombreComida.matches()){
            int respuesta = this.ng_clsComida.insertarComida(this.jTFComida.getText());
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaComidas();
                this.llenarComboBoxComidas();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n- El nombre de la comida ingresada no es válido.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAddComidaActionPerformed

    private void jTFComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFComidaActionPerformed
        this.jBAddComida.doClick();
    }//GEN-LAST:event_jTFComidaActionPerformed

    private void jBModComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModComidaActionPerformed
       Matcher matNombreComida = this.patNombres.matcher(this.jTFComidaMod.getText());
        if(matNombreComida.matches()){
            int respuesta = this.ng_clsComida.actualizarComida(Integer.parseInt(jTFIdComidaMod.getText()),this.jTFComidaMod.getText());
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaComidas();
                this.llenarComboBoxComidas();
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n- El nombre de la comida ingresada no es válido.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModComidaActionPerformed

    private void jTFComidaModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFComidaModActionPerformed
        this.jBModComida.doClick();
    }//GEN-LAST:event_jTFComidaModActionPerformed

    private void jTComidasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTComidasMouseClicked
       Cm_ClsComida comidaSeleccionada = this.listaComidas.get(this.jTComidas.getSelectedRow());
       this.jTFIdComidaMod.setText(""+comidaSeleccionada.getId());
       this.jTFComidaMod.setText(comidaSeleccionada.getNombre());
       this.jTFIdComidaRm.setText(""+comidaSeleccionada.getId());
    }//GEN-LAST:event_jTComidasMouseClicked

    private void jTFClaseModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFClaseModActionPerformed
        this.jBModificarClase.doClick();
    }//GEN-LAST:event_jTFClaseModActionPerformed

    private void jTFCapacidadModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCapacidadModActionPerformed
        this.jBModificarClase.doClick();
    }//GEN-LAST:event_jTFCapacidadModActionPerformed

    private void jBModificarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarClaseActionPerformed
        Matcher matNombreClase = this.patNombres.matcher(this.jTFClaseMod.getText());
        Matcher matCapacidad = this.patCapacidad.matcher(this.jTFCapacidadMod.getText());
        if(matNombreClase.matches() && matCapacidad.matches()){
            int respuesta = this.ng_clsClase.actualizarClase(Integer.parseInt(this.jTFIDClaseMod.getText()), this.jTFClaseMod.getText(), Integer.parseInt(this.jTFCapacidadMod.getText()));
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
    }//GEN-LAST:event_jBModificarClaseActionPerformed

    private void jBEliminarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarClaseActionPerformed
        int respuesta = this.ng_clsClase.borrarClase(Integer.parseInt(this.jTFIDClaseRm.getText()));
            if(respuesta >= 1){
                JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                this.llenarTablaClases();
            }else{
                JOptionPane.showMessageDialog(null, "La clase está en una reserva o no existe.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jBEliminarClaseActionPerformed

    private void jTClasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTClasesMouseClicked
        Cm_ClsClase claseSeleccionada = this.listaClases.get(this.jTClases.getSelectedRow());
        this.jTFIDClaseMod.setText("" + claseSeleccionada.getId());
        this.jTFClaseMod.setText(claseSeleccionada.getNombre());
        this.jTFCapacidadMod.setText("" + claseSeleccionada.getCapacidad());
        this.jTFIDClaseRm.setText("" + claseSeleccionada.getId());
    }//GEN-LAST:event_jTClasesMouseClicked

    private void jBRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRegistrarActionPerformed
        JFRegistroCliente jfRegistro = new JFRegistroCliente();
        jfRegistro.setVisible(true);
    }//GEN-LAST:event_jBRegistrarActionPerformed

    private void jBAddReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAddReservaActionPerformed
        if(jCBClienteAdd.getSelectedIndex() != 0 && jCBAsientoAdd.getSelectedIndex() != 0 && jCBClienteAdd.getSelectedIndex() != 0 && jCBComidaAdd.getSelectedIndex() != 0 && jCBPaisOrigenAdd.getSelectedIndex() != 0 && jCBPaisDestinoAdd.getSelectedIndex() != 0){
            int respuesta = this.ng_clsAsiento.actualizarEstadoAsiento (this.listaAsientosDisponibles.get(this.jCBAsientoAdd.getSelectedIndex() - 1).getId(),"Ocupado");
            if(respuesta > 0){
                int respuesta2 = this.ng_clsReserva.insertarReserva(this.listaClientes.get(this.jCBClienteAdd.getSelectedIndex() - 1).getId(), this.listaAsientosDisponibles.get(this.jCBAsientoAdd.getSelectedIndex() - 1).getId(), this.listaComidas.get(this.jCBComidaAdd.getSelectedIndex() - 1).getId(), this.listaPaises.get(this.jCBPaisOrigenAdd.getSelectedIndex() - 1).getId(), this.listaPaises.get(this.jCBPaisDestinoAdd.getSelectedIndex() - 1).getId());
                if(respuesta2 > 0){
                    JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTablaReservas();
                    this.llenarComboBoxAsientos();
                    this.llenarTablaAsientos();
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            String error = "";
            error += jCBClienteAdd.getSelectedIndex() != 0?"":"- No ha seleccionado un cliente.\n";
            error += jCBAsientoAdd.getSelectedIndex() != 0?"":"- No ha seleccionado un asiento.\n";
            error += jCBComidaAdd.getSelectedIndex() != 0?"":"- No ha seleccionado una comida.\n";
            error += jCBPaisOrigenAdd.getSelectedIndex() != 0?"":"- No ha seleccionado un país de origen.\n";
            error += jCBPaisDestinoAdd.getSelectedIndex() != 0?"":"- No ha seleccionado un país de destino.\n";
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n" + error, "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBAddReservaActionPerformed

    private void jBEliminarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarReservaActionPerformed
        int respuesta = this.ng_clsAsiento.actualizarEstadoAsiento ((int)this.jTReservas.getValueAt(this.jTReservas.getSelectedRow(), 3),"Disponible");
        if(respuesta > 0){
            this.ng_clsReserva.borrarReserva(Integer.parseInt(this.jTFIdReservaEliminar.getText()));
            JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
            this.llenarTablaReservas();
            this.llenarComboBoxAsientos();
            this.llenarTablaAsientos();
        }else{
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBEliminarReservaActionPerformed

    private void jBModificarReserva2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarReserva2ActionPerformed
        if(jCBClienteMod.getSelectedIndex() != 0 && jCBClienteMod.getSelectedIndex() != 0 && jCBComidaMod.getSelectedIndex() != 0 && jCBPaisOrigenMod.getSelectedIndex() != 0 && jCBPaisDestinoMod.getSelectedIndex() != 0){
            int indexReserva = -1;
                for(Cm_ClsReserva aux: this.listaReservas){
                    if(aux.getId() == Integer.parseInt(this.jTFIDReservaMod.getText())){
                        indexReserva = this.listaReservas.indexOf(aux);
                        break;
                    }
                }
            if(this.jCBAsientoMod.getSelectedIndex() == 0){
                int respuesta = this.ng_clsReserva.actualizarReserva(Integer.parseInt(this.jTFIDReservaMod.getText()), this.listaClientes.get(this.jCBClienteMod.getSelectedIndex() - 1).getId(), this.listaReservas.get(indexReserva).getIdAsientoFk(), this.listaComidas.get(this.jCBComidaMod.getSelectedIndex() - 1).getId(), this.listaPaises.get(this.jCBPaisOrigenMod.getSelectedIndex() - 1).getId(), this.listaPaises.get(this.jCBPaisDestinoMod.getSelectedIndex() - 1).getId());
                if(respuesta > 0){
                    JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                    this.llenarTablaReservas();
                    this.llenarComboBoxAsientos();
                    this.llenarTablaAsientos();
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                
                int respuesta2 = this.ng_clsAsiento.actualizarEstadoAsiento(this.listaReservas.get(indexReserva).getIdAsientoFk(), "Disponible");
                int respuesta3 = this.ng_clsAsiento.actualizarEstadoAsiento(this.listaAsientosDisponibles.get(this.jCBAsientoMod.getSelectedIndex() - 1).getId(), "Ocupado");
                if(respuesta2 >0 && respuesta3 > 0){
                    int respuesta = this.ng_clsReserva.actualizarReserva(Integer.parseInt(this.jTFIDReservaMod.getText()), this.listaClientes.get(this.jCBClienteMod.getSelectedIndex() - 1).getId(), this.listaAsientosDisponibles.get(this.jCBAsientoMod.getSelectedIndex() - 1).getId(), this.listaComidas.get(this.jCBComidaMod.getSelectedIndex() - 1).getId(), this.listaPaises.get(this.jCBPaisOrigenMod.getSelectedIndex() - 1).getId(), this.listaPaises.get(this.jCBPaisDestinoMod.getSelectedIndex() - 1).getId());
                    if(respuesta >0){
                        JOptionPane.showMessageDialog(null, "La operación se ha realizado con éxito", "Completo", JOptionPane.INFORMATION_MESSAGE);
                        this.llenarTablaReservas();
                        this.llenarComboBoxAsientos();
                        this.llenarTablaAsientos();
                    }else{
                        JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrió un error con la solicitud.\nPor favor, inténtelo más tarde.\n\nSi el problema persiste, por favor, comuníquese con los estudiantes.", "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            String error = "";
            error += jCBClienteMod.getSelectedIndex() != 0?"":"- No ha seleccionado un cliente.\n";
            error += jCBComidaMod.getSelectedIndex() != 0?"":"- No ha seleccionado una comida.\n";
            error += jCBPaisOrigenMod.getSelectedIndex() != 0?"":"- No ha seleccionado un país de origen.\n";
            error += jCBPaisDestinoMod.getSelectedIndex() != 0?"":"- No ha seleccionado un país de destino.\n";
            JOptionPane.showMessageDialog(null, "Comprueba la siguiente información:\n\n" + error, "Error en la solicitud", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBModificarReserva2ActionPerformed

    private void jTReservasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTReservasMouseClicked
        Cm_ClsReserva reservaSeleccionada = this.listaReservas.get(this.jTReservas.getSelectedRow());
        this.jTFIDReservaMod.setText("" + reservaSeleccionada.getId());
        this.jTFIdReservaEliminar.setText("" + reservaSeleccionada.getId());
        int indexCliente = -1;
        for(Cm_ClsCliente aux: this.listaClientes){
            if(aux.getId() == reservaSeleccionada.getIdClientFk()){
                indexCliente = this.listaClientes.indexOf(aux);
                break;
            }
        }
        this.jCBClienteMod.setSelectedIndex(indexCliente + 1);
        int indexComida = -1;
        for(Cm_ClsComida aux: this.listaComidas){
            if(aux.getId() == reservaSeleccionada.getIdComidaFk()){
                indexComida = this.listaComidas.indexOf(aux);
                break;
            }
        }
        this.jCBComidaMod.setSelectedIndex(indexComida + 1);
        int indexPaisOrigen = -1;
        for(Cm_ClsPais aux: this.listaPaises){
            if(aux.getId() == reservaSeleccionada.getIdPaisOrigenFk()){
                indexPaisOrigen = this.listaPaises.indexOf(aux);
                break;
            }
        }
        this.jCBPaisOrigenMod.setSelectedIndex(indexPaisOrigen + 1);
        int indexPaisDestino = -1;
        for(Cm_ClsPais aux: this.listaPaises){
            if(aux.getId() == reservaSeleccionada.getIdPaisDestinoFk()){
                indexPaisDestino = this.listaPaises.indexOf(aux);
                break;
            }
        }
        this.jCBPaisDestinoMod.setSelectedIndex(indexPaisDestino + 1);
    }//GEN-LAST:event_jTReservasMouseClicked

    private void jBActualizarListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarListaClientesActionPerformed
        this.llenarComboBoxClientes();
    }//GEN-LAST:event_jBActualizarListaClientesActionPerformed

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
    private javax.swing.JButton jBActualizarListaClientes;
    private javax.swing.JButton jBAddClase;
    private javax.swing.JButton jBAddComida;
    private javax.swing.JButton jBAddPais;
    private javax.swing.JButton jBAddReserva;
    private javax.swing.JButton jBCerrarSesion;
    private javax.swing.JButton jBEliminarClase;
    private javax.swing.JButton jBEliminarPais;
    private javax.swing.JButton jBEliminarReserva;
    private javax.swing.JButton jBModComida;
    private javax.swing.JButton jBModificarClase;
    private javax.swing.JButton jBModificarPais;
    private javax.swing.JButton jBModificarReserva2;
    private javax.swing.JButton jBRegistrar;
    private javax.swing.JButton jBRmComida;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBAsientoAdd;
    private javax.swing.JComboBox<String> jCBAsientoMod;
    private javax.swing.JComboBox<String> jCBClienteAdd;
    private javax.swing.JComboBox<String> jCBClienteMod;
    private javax.swing.JComboBox<String> jCBComidaAdd;
    private javax.swing.JComboBox<String> jCBComidaMod;
    private javax.swing.JComboBox<String> jCBPaisDestinoAdd;
    private javax.swing.JComboBox<String> jCBPaisDestinoMod;
    private javax.swing.JComboBox<String> jCBPaisOrigenAdd;
    private javax.swing.JComboBox<String> jCBPaisOrigenMod;
    private javax.swing.JLabel jLBienvenido;
    private javax.swing.JLabel jLCapacidad;
    private javax.swing.JLabel jLCapacidad1;
    private javax.swing.JLabel jLCapacidad13;
    private javax.swing.JLabel jLCapacidad14;
    private javax.swing.JLabel jLCapacidad15;
    private javax.swing.JLabel jLCapacidad16;
    private javax.swing.JLabel jLCapacidad2;
    private javax.swing.JLabel jLCapacidad3;
    private javax.swing.JLabel jLCapacidad4;
    private javax.swing.JLabel jLCapacidadMod;
    private javax.swing.JLabel jLCodigoEliminar;
    private javax.swing.JLabel jLCodigoPais;
    private javax.swing.JLabel jLCodigoPais1;
    private javax.swing.JLabel jLComida;
    private javax.swing.JLabel jLComida1;
    private javax.swing.JLabel jLComida2;
    private javax.swing.JLabel jLComida3;
    private javax.swing.JLabel jLIDClase;
    private javax.swing.JLabel jLIDClase1;
    private javax.swing.JLabel jLMaximoClase;
    private javax.swing.JLabel jLMaximoClase1;
    private javax.swing.JLabel jLMaximoComida;
    private javax.swing.JLabel jLMaximoComida1;
    private javax.swing.JLabel jLMaximoComida2;
    private javax.swing.JLabel jLMaximoPais;
    private javax.swing.JLabel jLMaximoPais1;
    private javax.swing.JLabel jLNombreClase;
    private javax.swing.JLabel jLNombreClase1;
    private javax.swing.JLabel jLNombreClase4;
    private javax.swing.JLabel jLNombreClaseMod;
    private javax.swing.JLabel jLNombrePais;
    private javax.swing.JLabel jLNombrePais1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPActualizarPais;
    private javax.swing.JPanel jPAgregarClase;
    private javax.swing.JPanel jPAgregarClase1;
    private javax.swing.JPanel jPAgregarClase3;
    private javax.swing.JPanel jPAgregarClase5;
    private javax.swing.JPanel jPAgregarComida;
    private javax.swing.JPanel jPAgregarComida1;
    private javax.swing.JPanel jPAgregarComida2;
    private javax.swing.JPanel jPAgregarPais;
    private javax.swing.JPanel jPAsiento;
    private javax.swing.JPanel jPBorrarClase;
    private javax.swing.JPanel jPClase;
    private javax.swing.JPanel jPComida;
    private javax.swing.JPanel jPModificarClase;
    private javax.swing.JPanel jPPais;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTAsientos;
    private javax.swing.JTable jTClases;
    private javax.swing.JTable jTComidas;
    private javax.swing.JTextField jTFCapacidad;
    private javax.swing.JTextField jTFCapacidadMod;
    private javax.swing.JTextField jTFClaseMod;
    private javax.swing.JTextField jTFCodigoPais;
    private javax.swing.JTextField jTFCodigoPaisActualizar;
    private javax.swing.JTextField jTFCodigoPaisEliminar;
    private javax.swing.JTextField jTFComida;
    private javax.swing.JTextField jTFComidaMod;
    private javax.swing.JTextField jTFIDClaseMod;
    private javax.swing.JTextField jTFIDClaseRm;
    private javax.swing.JTextField jTFIDReservaMod;
    private javax.swing.JTextField jTFIdComidaMod;
    private javax.swing.JTextField jTFIdComidaRm;
    private javax.swing.JTextField jTFIdReservaEliminar;
    private javax.swing.JTextField jTFNombreClase;
    private javax.swing.JTextField jTFNombrePais;
    private javax.swing.JTextField jTFNombrePaisActualizar;
    private javax.swing.JTabbedPane jTPEntidades;
    private javax.swing.JTable jTPaises;
    private javax.swing.JTable jTReservas;
    // End of variables declaration//GEN-END:variables
}
