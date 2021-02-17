
package Interfaz;

import Fuentes.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

//@author KelvinOjeda

public class JFVuelo extends javax.swing.JFrame {

    Vuelo vuelo;
    static Conexion conexion;
    ArrayList<Vuelo> vuelos;
    ArrayList<Avion> aviones;
    
    public JFVuelo() {
        initComponents();
        this.vuelo = new Vuelo();
        this.conexion = new Conexion();
        this.vuelos = new ArrayList<Vuelo>();
        this.aviones = new ArrayList<Avion>();
        this.setLocationRelativeTo(null);
    }
    
    public JFVuelo(Conexion conexion) {
        initComponents();
        this.vuelo = new Vuelo();
        this.conexion = conexion;
        this.vuelos = this.conexion.obtenerListaVuelos();
        this.aviones = this.conexion.obtenerListaAviones();
        this.setLocationRelativeTo(null);
        this.jBRellenarTabla.doClick();
        this.llenarComboBoxAviones();
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
        jTFVuelo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFruta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTFestadoVuelo = new javax.swing.JTextField();
        jCBAviones = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTVuelo = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setTitle("Vuelo");

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

        jLabel1.setText("ID Vuelo");

        jLabel2.setText("Avión:");

        jLabel3.setText("Estado del vuelo (En curso / Por despegar):");

        jLabel4.setText("Ruta:");

        jCBAviones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escoja un avión" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFestadoVuelo, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFruta))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFVuelo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBAviones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBAviones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFestadoVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTVuelo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. de Vuelo", "ID del Avión", "Ruta", "Estado del vuelo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTVuelo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBActualizarClase)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jBEliminarTipo)
                                .addComponent(jBInsertarTipo))
                            .addComponent(jBRellenarTabla))
                        .addGap(130, 130, 130))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBInsertarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBActualizarClase)
                        .addGap(18, 18, 18)
                        .addComponent(jBRellenarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInsertarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarTipoActionPerformed
        String idVuelo = this.jTFVuelo.getText();
        Avion avion = this.aviones.get(this.jCBAviones.getSelectedIndex() - 1);
        String rutaVuel = this.jTFruta.getText();
        boolean estadoVuel = false;
        if(this.jTFestadoVuelo.getText().equalsIgnoreCase("EN CURSO")){
            estadoVuel = true;
        }
        vuelo= new Vuelo(idVuelo, avion, rutaVuel, estadoVuel);
        this.conexion.subirALaBase(vuelo);
        this.jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBInsertarTipoActionPerformed

    public void llenarComboBoxAviones(){
        this.aviones = this.conexion.obtenerListaAviones();
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel)this.jCBAviones.getModel();
        comboBoxModel.removeAllElements();
        this.jCBAviones.addItem("Elija un avión");
        for(Avion aux: this.aviones){
            this.jCBAviones.addItem("" + aux.getIdAvion() + " - " + aux.getDescripcion());
        }
    }
    
    private void jBEliminarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarTipoActionPerformed
        String idVuelo = this.jTFVuelo.getText();
        this.conexion.eliminarDeLaBase(idVuelo, Vuelo.class);
    }//GEN-LAST:event_jBEliminarTipoActionPerformed

    private void jBRellenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRellenarTablaActionPerformed
        this.vuelos = this.conexion.obtenerListaVuelos();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.jTVuelo.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[4];
        for(int i = 0; i < this.vuelos.size(); i++){
            fila[0] = this.vuelos.get(i).getIdVuelo();
            fila[1] = this.vuelos.get(i).getAvion().getIdAvion();
            fila[2] = this.vuelos.get(i).getRuta();
            fila[3] = this.vuelos.get(i).isEstadoDeVuelo()?("En curso"):("Por despegar");
            modeloTabla.addRow(fila);
        }
    }//GEN-LAST:event_jBRellenarTablaActionPerformed

    private void jBActualizarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarClaseActionPerformed
        String idVuelo = this.jTFVuelo.getText();
        Avion avion = this.aviones.get(this.jCBAviones.getSelectedIndex() - 1);
        String rutaVuel = this.jTFruta.getText();
        boolean estadoVuel = false;
        if(this.jTFestadoVuelo.getText().equalsIgnoreCase("EN CURSO")){
            estadoVuel = true;
        }
        vuelo= new Vuelo(idVuelo, avion, rutaVuel, estadoVuel);
        this.conexion.actualizarEnLaBase(idVuelo, vuelo);
        this.jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBActualizarClaseActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jBSalirActionPerformed

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
            java.util.logging.Logger.getLogger(JFVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarClase;
    private javax.swing.JButton jBEliminarTipo;
    private javax.swing.JButton jBInsertarTipo;
    private javax.swing.JButton jBRellenarTabla;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBAviones;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFVuelo;
    private javax.swing.JTextField jTFestadoVuelo;
    private javax.swing.JTextField jTFruta;
    private javax.swing.JTable jTVuelo;
    // End of variables declaration//GEN-END:variables
}
