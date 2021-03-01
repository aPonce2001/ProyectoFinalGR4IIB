
package Interfaz;

import Fuentes.*;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

//@author Kelvin Ojeda

public class JFCliente extends javax.swing.JFrame {

    Cliente cliente;
    static Conexion conexion;
    ArrayList<Cliente> clientes;
    ArrayList<Pais> paises;
    
    public JFCliente() {
        initComponents();
        this.cliente = new Cliente();
        this.conexion =  null;
        this.clientes = new ArrayList<Cliente>();
        this.paises = new ArrayList<Pais>();
        this.setLocationRelativeTo(null);
    }
    
    public JFCliente(Conexion conexion) {
        initComponents();
        this.cliente = new Cliente();
        this.conexion = conexion;
        this.clientes = this.conexion.obtenerListaClientes();
        this.paises = this.conexion.obtenerListaPaises();
        this.setLocationRelativeTo(null);
        this.jBRellenarTabla.doClick();
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
        jTFCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFnombreyapell = new javax.swing.JTextField();
        jCBPaises = new javax.swing.JComboBox<>();
        jBSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClientes = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setTitle("Cliente");

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

        jLabel1.setText("Pasaporte:");

        jLabel2.setText("País:");

        jLabel3.setText("Nombre y apellido:");

        jCBPaises.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elija un país" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFCliente)
                    .addComponent(jCBPaises, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTFnombreyapell))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTFCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBPaises, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFnombreyapell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jTClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Pasaporte", "ID Pais", "Nombre y Apellido"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTClientes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 403, Short.MAX_VALUE)
                                .addComponent(jBSalir)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBInsertarTipo)
                            .addComponent(jBEliminarTipo)
                            .addComponent(jBActualizarClase)
                            .addComponent(jBRellenarTabla))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBInsertarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBEliminarTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBActualizarClase)
                        .addGap(26, 26, 26)
                        .addComponent(jBRellenarTabla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBInsertarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInsertarTipoActionPerformed
        int idCliente = Integer.parseInt(this.jTFCliente.getText());
        Pais pais = this.paises.get(this.jCBPaises.getSelectedIndex() - 1);
        String nomb = this.jTFnombreyapell.getText();
        cliente =  new Cliente(idCliente, pais, nomb);
        this.conexion.subirALaBase(cliente);
        jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBInsertarTipoActionPerformed

    private void jBEliminarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarTipoActionPerformed
        int idCliente= Integer.parseInt(this.jTFCliente.getText());
        this.conexion.eliminarDeLaBase(idCliente, Cliente.class);
        jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBEliminarTipoActionPerformed

    private void jBRellenarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRellenarTablaActionPerformed
        this.clientes = this.conexion.obtenerListaClientes();
        DefaultTableModel modeloTabla = (DefaultTableModel) this.jTClientes.getModel();
        modeloTabla.setNumRows(0);
        Object[] fila = new Object[3];
        for(int i = 0; i < this.clientes.size(); i++){
            fila[0] = this.clientes.get(i).getIdCliente();
            fila[1] = this.clientes.get(i).getPais().getIdPais();
            fila[2] = this.clientes.get(i).getNombre();
            modeloTabla.addRow(fila);
        }
    }//GEN-LAST:event_jBRellenarTablaActionPerformed

    private void jBActualizarClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarClaseActionPerformed
        int idCliente = Integer.parseInt(this.jTFCliente.getText());
        Pais pais = this.paises.get(this.jCBPaises.getSelectedIndex() - 1);
        String nomb = this.jTFnombreyapell.getText();
        cliente =  new Cliente(idCliente, pais, nomb);
        this.conexion.actualizarEnLaBase(idCliente, cliente);
        this.jBRellenarTabla.doClick();
    }//GEN-LAST:event_jBActualizarClaseActionPerformed

    public void llenarComboBoxPais(){
        this.paises = this.conexion.obtenerListaPaises();
        DefaultComboBoxModel comboBoxModel = (DefaultComboBoxModel)this.jCBPaises.getModel();
        comboBoxModel.removeAllElements();
        this.jCBPaises.addItem("Elija un país");
        for(Pais aux: this.paises){
            this.jCBPaises.addItem(aux.getNombrePais());
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
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarClase;
    private javax.swing.JButton jBEliminarTipo;
    private javax.swing.JButton jBInsertarTipo;
    private javax.swing.JButton jBRellenarTabla;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<String> jCBPaises;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClientes;
    private javax.swing.JTextField jTFCliente;
    private javax.swing.JTextField jTFnombreyapell;
    // End of variables declaration//GEN-END:variables
}
