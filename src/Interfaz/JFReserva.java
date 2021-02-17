
package Interfaz;

import Fuentes.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

//@author KelvinOjeda

public class JFReserva extends javax.swing.JFrame {

    Reserva reserva;
    static Conexion conexion;
    ArrayList<Reserva> reservas;
    ArrayList<Cliente> clientes;
    ArrayList<Vuelo> vuelos;
    ArrayList<Asiento> asientos;
    
    public JFReserva() {
        initComponents();
        this.reserva = new Reserva();
        this.conexion = new Conexion();
        this.reservas = new ArrayList<Reserva>();
        this.clientes = new ArrayList<Cliente>();
        this.vuelos = new ArrayList<Vuelo>();
        this.asientos = new ArrayList<Asiento>();
        this.setLocationRelativeTo(null);
    }
    
    public JFReserva(Conexion conexion) {
        initComponents();
        this.reserva = new Reserva();
        this.conexion = conexion;
        this.reservas = this.conexion.obtenerListaReservas();
        this.clientes = this.conexion.obtenerListaClientes();
        this.vuelos = this.conexion.obtenerListaVuelos();
        this.asientos = this.conexion.obtenerListaAsientos();
        this.setLocationRelativeTo(null);
        this.jBRellenarTabla.doClick();
        this.llenarComboBoxAsientos();
        this.llenarComboBoxClientes();
        this.llenarComboBoxVuelos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBInsertarTipo = new javax.swing.JButton();
        jBEliminarTipo = new javax.swing.JButton();
        jBRellenarTabla = new javax.swing.JButton();
        jBActualizarClase = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFReserva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCBClientes = new javax.swing.JComboBox<>();
        jCBVuelos = new javax.swing.JComboBox<>();
        jCBAsientos = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTReservas = new javax.swing.JTable();

        setTitle("Reserva");

        jBInsertarTipo.setText("Insertar");
        jBInsertarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInsertarTipoActionPerformed(evt);
            }
        });

        jBEliminarTipo.setText("Eliminar");
        jBEliminarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarTipoActionPerformed(evt);
            }
        });

        jBRellenarTabla.setText("Mostrar");
        jBRellenarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRellenarTablaActionPerformed(evt);
            }
        });

        jBActualizarClase.setText("Actualizar");
        jBActualizarClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarClaseActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingreso de datos:"));

        jLabel1.setText("ID Reserva:");

        jLabel2.setText("Cliente:");

        jLabel3.setText("Asiento:");

        jLabel4.setText("Vuelo:");

        jCBClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija su identificación" }));

        jCBVuelos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un vuelo" }));

        jCBAsientos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un asiento" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFReserva))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBClientes, 0, 239, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAsientos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBVuelos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jCBVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBAsientos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTReservas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTReservas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reserva No.", "ID Cliente", "ID Vuelo", "ID Asiento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTReservas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBInsertarTipo)
                            .addComponent(jBEliminarTipo)
                            .addComponent(jBActualizarClase)
                            .addComponent(jBRellenarTabla))
                        .addGap(117, 117, 117))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBSalir)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBInsertarTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminarTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBActualizarClase)
                .addGap(31, 31, 31)
                .addComponent(jBRellenarTabla)
                .addGap(3, 3, 3)
                .addComponent(jBSalir)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInsertarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarTipoActionPerformed
        int idReserva = Integer.parseInt(this.jTFReserva.getText());
        Cliente cliente = this.clientes.get(jCBClientes.getSelectedIndex() - 1);
        Vuelo vuelo = this.vuelos.get(jCBVuelos.getSelectedIndex() - 1);
        Asiento asiento = this.asientos.get(jCBAsientos.getSelectedIndex() - 1);
        reserva= new Reserva(idReserva, cliente, vuelo, asiento);
        this.conexion.subirALaBase(reserva);
        this.jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBInsertarTipoActionPerformed

    private void jBEliminarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarTipoActionPerformed
        int idReserva = Integer.parseInt(this.jTFReserva.getText());
        this.conexion.eliminarDeLaBase(idReserva, Reserva.class);
        this.jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBEliminarTipoActionPerformed

    private void jBRellenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRellenarTablaActionPerformed
        ArrayList<Reserva> reservas = this.conexion.obtenerListaReservas();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.jTReservas.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[4];
        for(int i = 0; i < reservas.size(); i++){
            fila[0] = reservas.get(i).getIdReserva();
            fila[1] = reservas.get(i).getCliente().getIdCliente();
            fila[2] = reservas.get(i).getVuelo().getIdVuelo();
            fila[3] = reservas.get(i).getAsiento().getIdAsiento();
            modeloTabla.addRow(fila);
        }
    }//GEN-LAST:event_jBRellenarTablaActionPerformed

    private void jBActualizarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarClaseActionPerformed
        int idReserva = Integer.parseInt(this.jTFReserva.getText());
        Cliente cliente = this.clientes.get(jCBClientes.getSelectedIndex() - 1);
        Vuelo vuelo = this.vuelos.get(jCBVuelos.getSelectedIndex() - 1);
        Asiento asiento = this.asientos.get(jCBAsientos.getSelectedIndex() - 1);
        reserva= new Reserva(idReserva, cliente, vuelo, asiento);
        this.conexion.actualizarEnLaBase(idReserva, reserva);
        this.jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBActualizarClaseActionPerformed

    private void llenarComboBoxClientes(){
        for(Cliente aux : this.clientes){
            this.jCBClientes.addItem("" + aux.getIdCliente() + " - " + aux.getNombre());
        }
    }
    
    private void llenarComboBoxVuelos(){
        for(Vuelo aux : this.vuelos){
            this.jCBVuelos.addItem(aux.getIdVuelo() + " - " + aux.getRuta());
        }
    }
    
    private void llenarComboBoxAsientos(){
        for(Asiento aux : this.asientos){
            this.jCBAsientos.addItem("" + aux.getIdAsiento() + " - " +(aux.isEstado()?("Ocupado"):("Libre")));
        }
    }
    
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFReserva().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarClase;
    private javax.swing.JButton jBEliminarTipo;
    private javax.swing.JButton jBInsertarTipo;
    private javax.swing.JButton jBRellenarTabla;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBAsientos;
    private javax.swing.JComboBox<String> jCBClientes;
    private javax.swing.JComboBox<String> jCBVuelos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFReserva;
    private javax.swing.JTable jTReservas;
    // End of variables declaration//GEN-END:variables
}
